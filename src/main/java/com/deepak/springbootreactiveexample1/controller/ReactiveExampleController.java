package com.deepak.springbootreactiveexample1.controller;

import com.deepak.springbootreactiveexample1.domain.WriteUp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ReactiveExampleController {
    @GetMapping("/hello")
    Flux<WriteUp> allMessages() {

        return Flux.just(
                WriteUp.builder().description("First Message").id(200L).build(),
                WriteUp.builder().description("Second Message").id(909300L).build(),
                WriteUp.builder().description("Second Message").id(17300L).build(),
                WriteUp.builder().description("Second Message").id(8300L).build(),
                WriteUp.builder().description("Second Message").id(1300L).build(),
                WriteUp.builder().description("Second Message").id(7300L).build(),
                WriteUp.builder().description("Second Message").id(5300L).build(),
                WriteUp.builder().description("Second Message").id(6300L).build(),
                WriteUp.builder().description("Second Message").id(7300L).build(),
                WriteUp.builder().description("Second Message").id(8300L).build(),
                WriteUp.builder().description("Second Message").id(9300L).build(),
                WriteUp.builder().description("Second Message").id(3300L).build(),
                WriteUp.builder().description("Second Message").id(1300L).build(),
                WriteUp.builder().description("Second Message").id(500L).build(),
                WriteUp.builder().description("Second Message").id(800L).build(),
                WriteUp.builder().description("Second Message").id(900L).build(),
                WriteUp.builder().description("Second Message").id(700L).build()
        );
    }
}
