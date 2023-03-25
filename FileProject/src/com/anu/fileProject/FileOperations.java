package com.anu.fileProject;

import java.io.File;

public class FileOperations {
	public static void renameFile(String oldPath, String newName) {
        File oldFile = new File(oldPath);
        if (!oldFile.exists()) {
            System.out.println("Error: File not found.");
            return;
        }
        String parentPath = oldFile.getParent();
        File newFile = new File(parentPath + "/" + newName);
        if (newFile.exists()) {
            System.out.println("Error: A file with that name already exists.");
            return;
        }
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Error: Failed to rename file.");
        }
    }
}
