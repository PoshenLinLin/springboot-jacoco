package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author meow
 */
@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService testService;

    @Test
    void test1() {
        String result = testService.test1(Boolean.TRUE);
        assertEquals("test1", result);
    }

    @Test
    void test2() {
        String result = testService.test2();
        assertEquals("test2", result);
    }
}