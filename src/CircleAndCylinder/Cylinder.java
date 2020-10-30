package CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){}
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return height*radius*radius*Math.PI;
    }

    @Override
    public double getArea(){
        return 2*Math.PI*radius*(radius+height);
    }

    @Override
    public String toString() {
        return "CircleAndCylinder.Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
