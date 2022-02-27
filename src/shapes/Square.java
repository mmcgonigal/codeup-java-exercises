package shapes;

public class Square extends Rectangle{
    protected int side;

    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.width = side;
        this.length = side;
    }

    public Square(int length, int width, int side){
        super(length, width);
        this.length = side;
        this.width = side;
    }
}
