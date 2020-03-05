package com.bohniman.eftapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bohniman.eftapi.model.AppDevice;
import com.bohniman.eftapi.payload.ThanaPayload;
import com.bohniman.eftapi.repository.DeviceRepository;

@Service
public class ThanaService {
	@Autowired
	DeviceRepository deviceRepository;

	public ThanaPayload getThana(String macId) {
		ThanaPayload thana = new ThanaPayload();
		AppDevice device = deviceRepository.findByMacId(macId);
		if (null != device) {
			thana.setThanaCode(device.getThana().getThanaCode());
			thana.setThanaName(device.getThana().getThanaName());
			thana.setDistrictCode(device.getThana().getDistrict().getDistrictCode());
			thana.setDistrictName(device.getThana().getDistrict().getDistrictName());
			thana.setStateCode(device.getThana().getDistrict().getState().getStateCode());
			thana.setStateName(device.getThana().getDistrict().getState().getStateName());
		}
		return thana;
	}
}
