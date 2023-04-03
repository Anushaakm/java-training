package com.anu.spring.excel;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.anu.spring.util.FileUtil;


@Component

public class XLManager {
	@Autowired
    private XLReader reader;
	@Autowired
    private XLFormatter formatter;
	
	  @Qualifier("util")
    @Autowired // works perfectly
    private FileUtil util; // it will autowire with the bean in container, which is having same name as variable i.e. util

    @Autowired
    @Qualifier("utilData")
    private FileUtil utilAbc;


    public void configXL() {
        reader.setReadLimit(10);
        formatter.setFont("abc");
        util.fileSize();
        utilAbc.fileSize();
    }
}
