import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,4,5);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
