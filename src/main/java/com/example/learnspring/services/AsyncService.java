package com.example.learnspring.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
@Log4j2
public class AsyncService {

    @Async
    public CompletableFuture<Void> performAsyncTask() {
        try {
            log.info("STARTING ASYNC SLEEP");
            for (int i = 1; i < 6; i++) {
                TimeUnit.SECONDS.sleep(1);
                log.info(i + " seconds...");
            }
            log.info("ENDING ASYNC SLEEP");
            return CompletableFuture.completedFuture(null);
        } catch (InterruptedException e) {
            return CompletableFuture.failedFuture(e);
        }
    }
}
