package com.report;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReportApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("".equals("a"));
        System.out.println(new Object().equals(null));
    }

    public static void main(String[] args) {
        Integer a = new Integer(0);
        Integer b = new Integer(0);
        System.out.println(a == b);
    }

}
