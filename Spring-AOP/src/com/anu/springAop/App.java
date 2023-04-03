package com.anu.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anu.springAop.config.AppConfig;
import com.anu.springAop.xl.XLReader;

public final class App {
    public static void main(String[] args) {
      
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // XLReader reader =  ctx.getBean(XLReader.class);

        XLReader reader =  (XLReader) ctx.getBean("XLReader");
        reader.readXLData();
    }
}

