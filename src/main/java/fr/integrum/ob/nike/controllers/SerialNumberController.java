package fr.integrum.ob.nike.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.integrum.ob.nike.repositories.SerialNumberRepository;
import fr.integrum.ob.nike.retailmodels.SerialNumber;

@RestController
public class SerialNumberController {
	
	private static Logger LOG = LoggerFactory.getLogger(SerialNumberController.class);

	@Autowired
	private SerialNumberRepository serialNumberRepository;
	
	@GetMapping("/serialNumbers")
    public Page<SerialNumber> getSerialNumbers(Pageable pageable) {
        return serialNumberRepository.findAll(pageable);
    }
	
	@PostMapping("/serialNumbers")
    public SerialNumber createSerialNumber(@Validated @RequestBody SerialNumber serialNumber) {
		LOG.info("SerialNumber created. ");
        return serialNumberRepository.save(serialNumber);
    }

}
