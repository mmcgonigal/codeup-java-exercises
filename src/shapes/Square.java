package shapes;

public class Square extends Rectangle{
    protected int side;


    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side = side;

    }

    public Square(int side){
        super(side, side);
        this.side = side;
    }

  //  @Override
    public int getPerimeter(int side) {
        return side*4;
    }

    public int getArea(int side){
        return side*side;
    }


}
