public class Rectange extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectange() {
    }

    public Rectange(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public Rectange(String color, boolean filled,double width,double height) {
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with"+ "width="+ this.width +"and" +"height="+this.height+ "which is a subclass of"+ super.toString();
    }

    public static void main(String[] args) {
        Rectange rectange = new Rectange();
        System.out.println(rectange);
        rectange = new Rectange(10,20) ;
        System.out.println(rectange);
        rectange = new Rectange("black",false,10,20);
        System.out.println(rectange);
    }
}
