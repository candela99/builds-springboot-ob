package com.example.springdeploy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringDeployApplicationTest {

    @Test
    void contextLoads(){
        System.getenv().forEach(
                (key, value) -> System.out.println(key + " " + value)
        );
    }
}