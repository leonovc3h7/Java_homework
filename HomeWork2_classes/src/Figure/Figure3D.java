package Figure;

public abstract class Figure3D {     // абстрактный класс фигуры 3D
    private double parametrA, parametrB, parametrC; // 3 параметра
    // конструктор на 3 параметра
    public Figure3D(double parametrA, double parametrB, double parametrC) {
        this.parametrA = parametrA;
        this.parametrB = parametrB;
        this.parametrC = parametrC;
    }
    // конструктор на один параметр
    public Figure3D(double parametrA) {
        this.parametrA = parametrA;
    }
    // гетеры
    public double getParametrA() {
        return parametrA;
    }

    public double getParametrB() {
        return parametrB;
    }

    public double getParametrC() {
        return parametrC;
    }

    public abstract double getSquare(); // абстрактные методы вычисления объема
    public abstract double getVolume(); // и площади
}
