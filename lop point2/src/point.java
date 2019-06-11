public class point {
    protected float x =0.0f;
    protected float y = 0.0f;

    public point() {
    }

    public point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    float[] arr = new float[2];

    String getXY(){
        String arr1 = " ";
        for (int i = 0; i < arr.length; i++){
            arr1+=arr[i]+" ";
        }
        return arr1;
    }
    public void setXY(float x, float y){
        arr[0] = x;
        arr[1] = y;
    }

    @Override
    public String toString() {
        return "X = "+ getX()+ ", Y =" + getY()+", XY = "+getXY();
    }

    public static void main(String[] args) {
        point point = new point();
        System.out.println(point);
        point = new point(2,3);
        point.setXY(2,3);
        System.out.println(point);
    }
}
