package com.anu.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class RangeController {
    @GetMapping(value="/numbers")
    public Flux<Integer> generateNumber(){
        return Flux.range(1, 100)
        .log()
        .map( i -> i * 2)
        .doOnRequest(n -> System.out.println("Requesting " + n +" items"))
        .doOnNext(n -> System.out.println("Processing " + n))
        .limitRate(3);
    }
}
