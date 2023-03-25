package com.anu.cb;
public class CallBackRunner{
public static void callbackDemo() {

    ImageUploader up = new ImageUploader();

   // up.select();
    up.select( imageTask -> {
        System.out.println("✅ Image Selection Completed ");

    //up.compress();
        up.compress( compressTask -> { 
            System.out.println("✅ Image Compression Completed ");

    //up.upload();
            up.upload( uploadTask -> {
                System.out.println("✅ Image Upload Completed ");
            });

        });
    });
}
public static void main(String[] args) throws Exception {
    System.out.println("🔥 General Solutions 🔥");
    callbackDemo();
}
}

