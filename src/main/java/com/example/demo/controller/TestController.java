package com.example.demo.controller;

import com.example.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meow
 */
@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("1")
    public String test1() {
        return testService.test1(Boolean.TRUE);
    }

    @GetMapping("2")
    public String test2() {
        return testService.test2();
    }
}
