package com.company;

public class Quadratic {                 // a*x^2 + b*x + с = 0
    private double a, b, c; // коэффициенты

    Quadratic(int a, int b, int c) throws IllegalArgumentException { //конструктор уравнения
        if (a ==0) throw new IllegalArgumentException("Coefficient a=0");
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Equation: " + (Math.abs(this.a)==1?(this.a>0?" ":"-"):this.a) + "x^2"
                + (Math.abs(this.b)==1?(this.b>0?" +":" -"):(this.b>0?" +":" ")+this.b) + "x"
                + (this.c>0?" +":" ") + this.c);
    }
    //вычисление дискриминанта
    public double getDiscriminant() {                // b^2 - 4*a*с
        return this.b*this.b - 4*this.a*this.c;
    }
    // вычисление корней
    public double[] getRoots() {                    // [-b +- sqrt(D)]/2a
        double[] roots = new double[2];
        roots[0] = (-this.b + Math.sqrt(getDiscriminant()))/2/this.a;
        roots[1] = (-this.b - Math.sqrt(getDiscriminant()))/2/this.a;
        return roots;
    }
    // вывод корней
    public void rootsDisplay(){
        if (this.getDiscriminant() < 0) {
            System.out.println("NO ROOTS!");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("Root " + this.getRoots()[0]);
        } else {
            System.out.print("Roots (");
            for (int i = 0; i < 2; i++)
                System.out.print(this.getRoots()[i] + (i == 1 ? ")" : ","));
            System.out.println();
        }
    }

}