package com.innowise.currency.controller;

import com.innowise.currency.entity.Currency;
import com.innowise.currency.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private Response response;

    @GetMapping
    public ResponseEntity<Currency> getRates() {
        return new ResponseEntity<>(response.getRates(), HttpStatus.OK);
    }
}
