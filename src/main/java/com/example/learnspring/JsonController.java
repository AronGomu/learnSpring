package com.example.learnspring;

import com.example.learnspring.Entities.JsonEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/json")
public class JsonController {
    @GetMapping("/hello")
    public String hello() {
        log.info("GET /api/hello endpoint called");
        return "Hello, World!";
    }

    @PostMapping("/receiveJson")
    public String receiveJson(@RequestBody JsonEntity jsonEntity) {
        log.info("POST /api/receiveJson endpoint called with: {}", jsonEntity);

        // Process myEntity as needed

        return "Received and processed JSON: " + jsonEntity.toString();
    }
}
