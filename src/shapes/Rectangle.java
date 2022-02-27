package shapes;

public class Rectangle {
    protected int length ;
    protected int width;

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width){
        this.width = width;
        }


    public Rectangle(int length, int width){
    super();
    this.length = length;
    this.width = width;
    }

    public int perimeter (int length,int width){
        return (2*length)+(2*width);
    }
    public int area(int length, int width){
        return length * width;
    }







}
