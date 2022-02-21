package Figure;

public class Mail {
    public static void main(String arg[]){

        FigureCube figureCube = new FigureCube(1);
        System.out.println("Square Cube "+figureCube.getSquare());
        System.out.println("Volume Cube "+figureCube.getVolume());

        Sphere sphere = new Sphere(1);
        System.out.println("Square Sphere "+sphere.getSquare());
        System.out.println("Volume Sphere "+sphere.getVolume());

        Cuboid cuboid = new Cuboid(1,1,1);
        System.out.println("Square Cuboid "+cuboid.getSquare());
        System.out.println("Volume Cuboid "+cuboid.getVolume());
    }


}
