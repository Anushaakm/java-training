package com.anu.fileHandling;

import java.io.File;
public class FileSizeInMB {
   void size() {
        File file = new File("src/com/anu/fileHandling/abc.txt"); 
        long fileSizeInBytes = file.length();
        double fileSizeInMB = (double) fileSizeInBytes / (1024 * 1024);
        System.out.printf("File size: %.2f MB", fileSizeInMB);
    }}


