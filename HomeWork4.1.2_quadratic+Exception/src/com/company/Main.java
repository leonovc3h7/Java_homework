package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int aTest = 0;
        try {
            Quadratic testQuadraticTwoRoots = new Quadratic(aTest, -5, 6); // 2 roots (3;2)
            testQuadraticTwoRoots.rootsDisplay();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            Quadratic testQuadraticOneRoots = new Quadratic(aTest, -10, 25); // 1 roots (5)
            testQuadraticOneRoots.rootsDisplay();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } /*finally {
            aTest += 1;
        }*/
        try {
            Quadratic testQuadraticNoRoots = new Quadratic(aTest, 10, -25); // no roots
            testQuadraticNoRoots.rootsDisplay();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

