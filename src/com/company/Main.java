package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomAge = new Random();

        for (int i = 0; i < 107; i++) {
            System.out.println(randomAge.nextInt(107));
        }
    }
}
