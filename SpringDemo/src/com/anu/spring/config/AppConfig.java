package com.anu.spring.config;


import java.io.File;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anu.spring.util.FileChecker;
import com.anu.spring.util.FileUtil;
@Configuration
@ComponentScan("com.anu.spring")
public class AppConfig {
   
    @Bean
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }
    @Bean
    public FileUtil utilData() {
        return new FileUtil();
    }
}
