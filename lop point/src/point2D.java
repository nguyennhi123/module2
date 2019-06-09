import java.awt.geom.Point2D;

public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2D() {
    }
    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public  void  setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[]arr ={x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "x = " + getX()+"y = "+ getY()+"XY = "+ getXY();
    }

    public static void main(String[] args) {
       point2D point = new point2D();
        System.out.println(point);
        point = new point2D(2,3);
        System.out.println(point);
    }
}
