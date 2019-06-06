public class rectange1 {
    double width,height;
    public rectange1(){

    }
    public rectange1(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public  double getPerimetter(){
        return ((this.width + this.height)*2);
    }
    public String display(){
        return "rectange{" + "width = "+ width + "height ="+ height +"}";
    }

}

