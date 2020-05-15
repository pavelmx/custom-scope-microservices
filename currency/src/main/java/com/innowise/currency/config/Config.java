package com.innowise.currency.config;

import com.innowise.currency.entity.Currency;
import com.innowise.currency.entity.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class Config {

    @Bean
    @Scope("currency")
    public Currency currency() {
        Random random = new Random();
        return new Currency(random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    @Bean
    public Response response() {
        return new Response() {
            @Override
            protected Currency getCurrency() {
                return currency();
            }
        };
    }
}
