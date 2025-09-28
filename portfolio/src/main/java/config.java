package com.example.portfolio.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class config {

    @Value("${web3form.key}")
    private String web3FormKey;

    public String getWeb3FormKey() {
        return web3FormKey;
    }
}
