package com.innowise.bank;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CurrencyPrinter {

    @Scheduled(fixedRate = 1000)
    private void printCurrentCurrency() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/currency";
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        System.out.println(response);
    }
}
