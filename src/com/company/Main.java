package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String rawInput = new Scanner(System.in).next();
        int sum = 0;
        String second = "";
        String first = String.valueOf(rawInput.charAt(0));
        for (int i = 0; i < rawInput.length(); ++i){
            if (i < rawInput.length() - 1)
                second = String.valueOf(rawInput.charAt(i + 1));
            else break;
            if ((first + second).equals("10") || (first + second).equals("20")) sum-=2;
            if (first.equals("0")) break;
            else if (Integer.parseInt(first + second) <= 26) sum+=2;
            first = second;
        }
        if (sum == 0) sum++;
        if (((rawInput.length()) %2) != 0) sum--;
        if (String.valueOf(rawInput.charAt(0)).equals("0")) sum = 0;
        System.out.println(sum);
    }
}
