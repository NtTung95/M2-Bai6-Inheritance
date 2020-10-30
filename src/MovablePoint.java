public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){}
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] showSpeed = new float[2];
        showSpeed[0] = this.xSpeed;
        showSpeed[1] = this.ySpeed;
        return showSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=(" +
                xSpeed +
                ySpeed +
                ')';
    }

    public MovablePoint move(){
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);
        return this;
    }
}
