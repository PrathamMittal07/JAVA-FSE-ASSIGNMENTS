package com.cognizant.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoanController.class);

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        LOGGER.info("START: getLoan");
        Loan loan = new Loan(number, "car", 400000.0, 3258.0, 18);
        LOGGER.info("END: getLoan");
        return loan;
    }
}
