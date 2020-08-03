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

import fr.integrum.ob.nike.repositories.NumberRepository;

@RestController
public class NumberController {
	
	private static Logger LOG = LoggerFactory.getLogger(NumberController.class);

	@Autowired
	private NumberRepository numberRepository;
	
	@GetMapping("/numbers")
    public Page<Number> getNumbers(Pageable pageable) {
        return numberRepository.findAll(pageable);
    }
	
	@PostMapping("/numbers")
    public Number createNumber(@Validated @RequestBody Number number) {
		LOG.info("Number created. ");
        return numberRepository.save(number);
    }

}
