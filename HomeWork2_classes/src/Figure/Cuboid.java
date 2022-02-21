package Figure;
               // прямоугольный параллепипед
public class Cuboid extends Figure3D {
    public Cuboid(double width, double length, double height) {
        super(width, length, height);
    }

    @Override                 // вычисление объема
    public double getVolume() {
        return super.getParametrA()*super.getParametrB()*super.getParametrC();
    }

    @Override                // вычисление площади
    public double getSquare() {
        return 2*(super.getParametrA()*super.getParametrB() + super.getParametrC()*super.getParametrB()
                + super.getParametrC()*super.getParametrA());
    }
}
