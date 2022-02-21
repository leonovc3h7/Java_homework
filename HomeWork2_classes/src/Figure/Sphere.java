package Figure;

public class Sphere extends Figure3D {
    public Sphere(double radius){
        super(radius);
    }

    @Override
    public double getVolume() {
        return 4*super.getParametrA()*super.getParametrA()*super.getParametrA()*Math.PI/3;
    }

    @Override
    public double getSquare() {
        return 4*super.getParametrA()*super.getParametrA()*super.getParametrA()*Math.PI;
    }
}
