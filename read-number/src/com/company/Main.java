package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number, ones, tens, huns;
        number = scanner.nextInt();
        ones = number % 10;
        tens = number%100/10;
        huns = number / 100;
        String prtones = "";
        String prttens = "";
        String prthuns = "";

        if (number == 0) {
            switch (ones) {
                case 0:
                    prtones = "zero";
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (ones) {
                case 0:
                    prtones = "ten";
                    break;
                case 1:
                    prtones = "eleven";
                    break;
                case 2:
                    prtones = "twelve";
                    break;
                case 3:
                    prtones = "thirdteen";
                    break;
                case 4:
                    prtones = "fourteen";
                    break;
                case 5:
                    prtones = "fifteen";
                    break;
                case 6:
                    prtones = "sixteen";
                    break;
                case 7:
                    prtones = "seventeen";
                    break;
                case 8:
                    prtones = "eightteen";
                    break;
                case 9:
                    prtones = "nineteen";
                    break;
            }
        }else {
            switch (ones) {
                case 1:
                    prtones = "one";
                    break;
                case 2:
                    prtones = "two";
                    break;
                case 3:
                    prtones = "three";
                    break;
                case 4:
                    prtones = "four";
                    break;
                case 5:
                    prtones = "five";
                    break;
                case 6:
                    prtones = "six";
                    break;
                case 7:
                    prtones = "seven";
                    break;
                case 8:
                    prtones = "eight";
                    break;
                case 9:
                    prtones = "nine";
                    break;
            }
            switch (tens) {
                case 2:
                    prttens = "twenty";
                    break;
                case 3:
                    prttens = "thirdty";
                    break;
                case 4:
                    prttens = "fourty";
                    break;
                case 5:
                    prttens = "fifty";
                    break;
                case 6:
                    prttens = "sixty";
                    break;
                case 7:
                    prttens = "seventy";
                    break;
                case 8:
                    prttens = "eighty";
                    break;
                case 9:
                    prttens = "ninety";
                    break;
            }
            switch (huns) {
                case 1:
                    prthuns = "one hundred";
                    break;
                case 2:
                    prthuns = "two hundred";
                    break;
                case 3:
                    prthuns = "three hundred";
                    break;
                case 4:
                    prthuns = "four hundred";
                    break;
                case 5:
                    prthuns = "five hundred";
                    break;
                case 6:
                    prthuns = "six hundred";
                    break;
                case 7:
                    prthuns = "seven hundred";
                    break;
                case 8:
                    prthuns = "eight hundred";
                    break;
                case 9:
                    prthuns = "nine hundred";
                    break;
            }
        }
        System.out.printf("%s %s %s", prthuns, prttens, prtones);
    }
}