package tech.gebel.piggybank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tech.gebel.piggybank.repositories.CoinRepository;

@RestController
public class CoinController {
    @Autowired
    private CoinRepository coinRepository;
}
