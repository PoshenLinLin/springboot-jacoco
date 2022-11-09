package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JacocoExampleApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
    }

    @Test
    void testReport() {
        System.out.println("test >>> ");
    }
}
