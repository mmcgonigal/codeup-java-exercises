package shapes;

public class Square extends Quadrilateral{
    protected int side;

    public Square(double side) {
        super(side,side);
    }

    @Override
    public double getPerimeter() {
        return length*2 + width*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void setLength(double side) {
        this.length = side;

    }

    @Override
    public void setWidth(double side) {
        this.length = side;
    }
}
