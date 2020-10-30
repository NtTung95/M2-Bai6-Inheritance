public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] showXYZ = new float[3];
        showXYZ[0] = super.getX();
        showXYZ[1] = super.getY();
        showXYZ[2] = this.z;
        return showXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }
}
