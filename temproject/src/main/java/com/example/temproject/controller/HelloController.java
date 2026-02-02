package com.example.temproject.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Api(tags = "Hello API")
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @ApiOperation(value = "Say Hello")
    @GetMapping("")
    public ResponseEntity<Map<String, String>> hello() {
        return ResponseEntity.ok(Collections.singletonMap("message", "Hello World!"));
    }
}



