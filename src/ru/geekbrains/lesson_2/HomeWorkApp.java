package ru.geekbrains.lesson_2;

import javax.annotation.processing.SupportedSourceVersion;

public class HomeWorkApp {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean checkSum(int first, int second) {
        int sum = first + second;
        return sum >= 10 && sum <= 20 ? true : false;
    }

    public static void checkSignAndPrint(int a) {
        System.out.println(a >= 0 ? a + " is positive" : a + " is negative");
    }

    public static boolean checkSign(int a) {
        return a >= 0 ? true : false;
    }

    public static void printSomeStrings(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year) {
        if(year%4 == 0 && (year%100 != 0) || year%400 == 0 ) {
            return true;
        }
        return false;
    }
}
