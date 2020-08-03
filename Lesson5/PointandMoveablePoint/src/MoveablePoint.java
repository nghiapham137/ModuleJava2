public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {}

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x,float y,float xSpeed,float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] Speed = {xSpeed, ySpeed};
        return Speed;
    }

    @Override
    public String toString() {
        return "Điểm mới có tọa độ là : (" + getX()
        + "," + getY() + ") và có thay đổi với tốc độ là: ("
        + getxSpeed() + "," + getySpeed() + ")";
    }

    public void move() {
         super.setX(super.getX() + xSpeed);
         super.setY(super.getY() + ySpeed);

    }



}
