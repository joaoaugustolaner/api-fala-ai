package com.api.fala_ai.controller;

import com.api.fala_ai.models.Slang;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {


    @GetMapping("")
    public ResponseEntity<Slang> hello(){

        Slang slang = new Slang(1, "test", "test", "test");
        return new ResponseEntity<Slang>(slang, HttpStatus.ACCEPTED);
    }

}