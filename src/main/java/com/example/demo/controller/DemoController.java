package com.example.demo.controller;

import com.example.demo.dto.DemoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class DemoController {

    @GetMapping(path = "/demos")
    public ResponseEntity<List<DemoDTO>> getDemos() {
        return ResponseEntity.ok(
                List.of(
                        DemoDTO.builder()
                                .value("value1")
                                .key("key1")
                                .build(),
                        DemoDTO.builder()
                                .value("value2")
                                .key("key2")
                                .build()
                ));
    }
}
