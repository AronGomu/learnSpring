package com.example.learnspring.controllers;

import com.example.learnspring.services.AsyncService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Log4j2
@RestController
@RequestMapping("/api/")
public class MultiThreadingController {

    private final AsyncService asyncService;

    @Autowired
    public MultiThreadingController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping("/multiThreading")
    public String hello() {
        log.info("GET /api/multiThreading endpoint called");
        CompletableFuture<Void> completableFuture = asyncService.performAsyncTask();
        log.info("After calling async task");

        try {
            completableFuture.get();
            return "SUCCESS AWAIT MULTITHREADING";
        } catch (Exception e) {
            return "FAILED MULTITHREADING";
        }

    }
}
