public class Square extends Rectange {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+ "which is a subclass of" + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.0);
        System.out.println(square);
        square = new Square("black",false,2.0);
        System.out.println(square);

    }
}
