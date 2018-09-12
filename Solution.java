package com.javarush.task.task15.task1519;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//get user input untill word "exit"
//If input with "." - call method print for Double
//If input >0 and less than 128  - call method print for short
//If input <=0 or >= 128 - call method print for Integer
//otherwise call method String


//Solution With Regex


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        int i;
//        while (!(s = br.readLine()).equals("exit")) {
//            if(s.matches("[-+]?\\d+\\.\\d*"))print(Double.parseDouble(s));
//            else if(s.matches("[-+]?\\d+")){
//                i=Integer.parseInt(s);
//                if(i<128&&i>0)print((short)i);
//                else print(i);
//            }
//            else print(s);
//
//        }
//    }
//
//    public static void print(Double value) {
//        System.out.println("Type - Double, value - " + value);
//    }
//
//    public static void print(String value) {
//        System.out.println("Type - String , value -  " + value);
//    }
//
//    public static void print(short value) {
//        System.out.println("Type - short, value - " + value);
//    }
//
//    public static void print(Integer value) {
//        System.out.println("Type - Integer, value -  " + value);
//    }
//}


// other way
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            try {
                if (line.contains(".")) {
                    print(Double.parseDouble(line));
                continue;}

                    if (Integer.parseInt(line) <= 0 || Integer.parseInt(line) >= 128) {
                    print(Integer.parseInt(line));
                continue;}
                    if (Short.parseShort(line) > 0 && Short.parseShort(line) < 128) {
                    print(Short.parseShort(line));
                    continue;
                } else print(line);
            } catch (Exception e) {
                print(line);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Type - Double, value -  " + value);
    }
    public static void print(Integer value) {
        System.out.println("Type - Integer, value - " + value);
    }

    public static void print(short value) {
        System.out.println("Type - short, value - " + value);
    }
    public static void print(String value) {
        System.out.println("Type - String, value - " + value);
    }

    }

