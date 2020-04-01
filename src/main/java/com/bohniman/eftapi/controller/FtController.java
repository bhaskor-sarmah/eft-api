package com.bohniman.eftapi.controller;

import javax.validation.Valid;

import com.bohniman.eftapi.payload.FtMasterVersion;
import com.bohniman.eftapi.payload.FtMasterTableSync;
import com.bohniman.eftapi.payload.SyncDocPayload;
import com.bohniman.eftapi.service.FtService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FtController
 */
@Controller
public class FtController {

    @Autowired
    FtService ftService;

    @RequestMapping(value = "/api/postDoc", consumes = { "application/JSON" }, method = RequestMethod.POST)
    // @PreAuthorize("hasRole('ROLE_FT')")
    public ResponseEntity<?> getPasscode(@Valid @RequestHeader(value = "Authorization") String jwtToken,
            @RequestBody SyncDocPayload syncDocPayload) {
        if (ftService.saveOfflineDoc(syncDocPayload)) {
            return new ResponseEntity<String>("Done Saving !", HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok("Failed Saving");
        }
    }

    // ========================================================================
    // # API
    // # Fetch master version table
    // ========================================================================
    @RequestMapping(value = "/api/getMaster", produces = { "application/JSON" }, consumes = {
            "application/JSON" }, method = RequestMethod.POST)
    public ResponseEntity<?> getMasterVersion(@Valid @RequestHeader(value = "Authorization") String jwtToken, @RequestBody FtMasterVersion ftMasterVersion) {
        FtMasterTableSync masterTableSync = ftService.getFtMasterTableSync(ftMasterVersion);
        if(null == masterTableSync){
            return ResponseEntity.ok(new String("Invalid Request received"));
        }
        return ResponseEntity.ok(masterTableSync);
    }

}