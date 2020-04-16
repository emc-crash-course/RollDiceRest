package it.sistinf.crash.dicerest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sistinf.crash.dicerest.model.Dice;
import it.sistinf.crash.dicerest.service.RollService;

@RestController
@RequestMapping("/dice")
public class RollController {

    @GetMapping(value = "/one")
    public Dice rollOne(){
        
        RollService rollService = new RollService();
        int value = rollService.rollOne(1,6);

        return new Dice(value);
    
    }

}