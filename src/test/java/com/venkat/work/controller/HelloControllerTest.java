package com.venkat.work.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @BeforeEach
    public void setup() throws Exception{
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void greetings() throws Exception {
        ResponseEntity<String> responseEntity =
                template.getForEntity(base.toString(), String.class);
        assertThat(responseEntity.getBody()).isEqualTo("Hello, World");
    }
}
