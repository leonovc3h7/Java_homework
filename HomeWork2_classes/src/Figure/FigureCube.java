package Figure;

public class FigureCube extends Figure3D { // Куб

    public FigureCube(double radius){
        super(radius);
    }

    @Override
    public double getParametrA() {
        return super.getParametrA();
    }

    @Override
    public double getSquare() {
        return 6*super.getParametrA();
    }

    @Override
    public double getVolume() {
        return super.getParametrA()*super.getParametrA()*super.getParametrA();
    }
}
