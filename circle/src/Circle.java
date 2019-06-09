public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "radius:" + this.radius + " color: " + color + " area: "+ getArea() +" perimeter: "+ getPerimeter();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0,"black");
        System.out.println(circle);
    }
}
