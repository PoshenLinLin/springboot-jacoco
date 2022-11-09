package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author meow
 */
@Service
@RequiredArgsConstructor
public class TestService {


    public String test1(Boolean arg1) {
        System.out.println("test1");

        if(arg1) {
            return "test1";
        } else {
            return "test2";
        }

    }

    public String test2() {
        System.out.println("test2");
        return "test2";
    }
}
