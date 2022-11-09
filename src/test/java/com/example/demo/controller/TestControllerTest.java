package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author meow
 */
@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TestService testService;

    @Test
    void test1() throws Exception {
        String str = "test1";
        Mockito.when(testService.test1(Boolean.TRUE)).thenReturn(str);

        mockMvc.perform(get("/test/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(str));
    }

    @Test
    void test2() throws Exception {
        String str = "test2";
        Mockito.when(testService.test2()).thenReturn(str);

        mockMvc.perform(get("/test/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(str));
    }
}