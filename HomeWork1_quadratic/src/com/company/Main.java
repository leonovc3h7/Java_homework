package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Quadratic testQuadraticTwoRoots = new Quadratic(1, -5, 6); // 2 roots (3;2)
        testQuadraticTwoRoots.rootsDisplay();

        Quadratic testQuadraticOneRoots = new Quadratic(1, -10, 25); // 1 roots (5)
        testQuadraticOneRoots.rootsDisplay();

        Quadratic testQuadraticNoRoots = new Quadratic(-10, 10, -25); // no roots
        testQuadraticNoRoots.rootsDisplay();
    }
}
