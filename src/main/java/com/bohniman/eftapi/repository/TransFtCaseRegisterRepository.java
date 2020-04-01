package com.bohniman.eftapi.repository;

import java.util.List;

import com.bohniman.eftapi.model.TransFtCaseRegister;
import com.bohniman.eftapi.payload.TransFtCaseRegisterPojo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * TransFtCaseRegisterRepository
 */
@Repository
public interface TransFtCaseRegisterRepository extends JpaRepository<TransFtCaseRegister, Long>{

	// @Query(value = "SELECT ftCaseId, suspect, finalFt.ftCode as ftCode, ftCaseNo, policeCaseNo, ftCaseStatus.caseStatusDetails as ftCaseStatus, remarks FROM TransFtCaseRegister f WHERE f.ftCaseId > :ftCaseId and f.finalFt.ftCode = :finalFtCode")
	// Object findByFtCaseIdGreaterThan(@Param("ftCaseId") Long ftCaseId, String finalFtCode);
	@Query(value = "SELECT new com.bohniman.eftapi.payload.TransFtCaseRegisterPojo(f.ftCaseId, f.suspect, f.finalFt.ftCode as ftCode, f.ftCaseNo, f.policeCaseNo, f.ftCaseStatus.caseStatusDetails as ftCaseStatus, f.remarks) FROM TransFtCaseRegister f WHERE f.ftCaseId > :ftCaseId and f.finalFt.ftCode = :finalFtCode")
	List<TransFtCaseRegisterPojo> findByFtCaseIdGreaterThan(@Param("ftCaseId") Long ftCaseId, String finalFtCode);

	// @Query(value = "SELECT new com.bohniman.eFT.payload.CaseTrial(CONCAT(t.suspect.firstName,' ',t.suspect.middleName,' ',t.suspect.lastName) as suspectName,t.ftCaseRegister.ftCaseNo as ftCaseNo,t.trialDate as trialDate,count(*) as documentCount, t.ftCaseRegister.ftCaseId as ftCaseId, t.suspect.suspectId as suspectId) FROM TransFtOfflineDoc t WHERE t.ftCaseRegister.ftCaseId = :ftCaseId GROUP BY t.suspect.suspectId,t.trialDate")
	// List<CaseTrial> findTrialGroupByDate(@Param("ftCaseId") Long ftCaseId);
	
	// new com.bohniman.eftapi.payload.TransSuspectSync(f.suspect.suspectId, f.suspect.initiatedBy, f.suspect.typeOfSuspect, f.suspect.firstName, f.suspect.middleName, f.suspect.lastName, f.suspect.fatherName, f.suspect.motherName, f.suspect.dateOfBirth, f.suspect.placeOfBirth,f.suspect.age, f.suspect.ageOnDate) as 

}