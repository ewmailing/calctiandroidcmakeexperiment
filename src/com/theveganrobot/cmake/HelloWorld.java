 package com.theveganrobot.cmake;
 
 public class HelloWorld {
     public native String stringFromJNI();
     public static void main(String[] args) {
         System.out.println(new HelloWorld().stringFromJNI());
     }
     static {
         System.loadLibrary("hello-cmake");
     }
 }
