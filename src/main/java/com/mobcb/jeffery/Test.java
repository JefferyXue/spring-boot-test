/**
 *   Copyright (c) 2014-2017 墨博云舟 All Rights Reserved. 
 */
package com.mobcb.jeffery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Test :
 *
 * @author xue.zewen
 * @version 1.00
 * @since 2017-09-13 10:41
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Test extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Test.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Test.class, args);
    }
}