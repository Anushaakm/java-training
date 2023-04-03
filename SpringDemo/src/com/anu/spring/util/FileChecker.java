package com.anu.spring.util;

import org.springframework.stereotype.Component;

@Component
public class FileChecker  {
	 private FileUtil util;

	    public FileChecker(FileUtil util) {
	        this.util = util;
	    }

	    public void checkFileValidity() {
	        System.out.println("File Size is " + util.fileSize());
	    }
}
