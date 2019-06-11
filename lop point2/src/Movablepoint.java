public class Movablepoint extends point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Movablepoint() {
    }

    public Movablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
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

    float[] arr = new float[2];

    String getSpeed() {
        String arr1 = " ";
        for (int i = 0; i < arr.length; i++) {
            arr1 += arr[i] + " ";
        }
        return arr1;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        arr[0] += xSpeed;
        arr[1] += ySpeed;
    }

    @Override
    public String toString() {
        return " XY = " + getXY() + ", Speed = " + getSpeed();
    }

    public Movablepoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        Movablepoint movablepoint = new Movablepoint(2, 3, 4, 5);
        movablepoint.setXY(2, 3);
        movablepoint.setSpeed(4, 5);
        movablepoint.move();
        System.out.println(movablepoint);
        movablepoint.setXY(movablepoint.getX(), movablepoint.getY());
        System.out.println(movablepoint.getXY());
    }
}
