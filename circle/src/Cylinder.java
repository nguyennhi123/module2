public class Cylinder extends Circle {
    private double height =2.0;

    public Cylinder() {
    }
    public Cylinder(double radius,String color) {
        super(radius,color);
    }
    public Cylinder(double radius,String color,double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }
    public double getfullArea(){
        return super.getPerimeter()*this.height;
    }
    public double getAreaCircle(){
        return getfullArea()+ super.getArea()*2;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "volum" + getVolume()+ "full area: "+ getfullArea()+"areacircle: " + getAreaCircle()+ super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3.0,"black");
        System.out.println(cylinder);
        cylinder = new Cylinder(3.0,"black",2.0);
        System.out.println(cylinder);
    }
}
