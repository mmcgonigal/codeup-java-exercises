package shapes;

public class Circle {
    private double radius; //반지름

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getCircumference(double radius){ // 원의 둘레 - 원주 : 지름 x 3.14
        return (radius * 2 * Math.PI);
    }
    public double getArea(double radius){ //원의 넓이: 반지름 x 반지름 x 3.14
        return(radius * radius * Math.PI );
    }




}
