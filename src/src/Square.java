public class Square extends Shape{
    private Point topLeft;
    private int length;

    public Square(Point p, int l){
        this.topLeft = p;
        this.length=l;
    }

    public String toString(){
        return super.toString()+"Square : " + topLeft + ", width " + length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getLength() {
        return length;
    }
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    public void setLength(int length) {
        this.length = length;
    }
}