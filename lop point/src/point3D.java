public class point3D extends point2D {
    private float z = 0.0f;

    public point3D() {
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    float[]arr = new float[3];
    public void setXYZ(float x, float y, float z){
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
    }
    String getXYZ(){
        String arr1 = "";
        for (int i = 0; i<arr.length;i++){
            arr1 += arr[i]+"";
        }
        return arr1;
    }

    @Override
    public String toString() {
        return "x = " + getX()+"y = "+ getY()+"Z = "+ getZ()+"XYZ ="+getXYZ();
    }

    public static void main(String[] args) {
        point3D point = new point3D();
        System.out.println(point);

        point = new point3D(2.0f,3.0f,4.0f);
        point.setXYZ(2,3,4);
        System.out.println(point);
    }
}
