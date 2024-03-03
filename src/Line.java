public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point s, Point e){
        this.startPoint = s;
        this.endPoint = e;
    }

    public String toString(){
        return "Line : "+ startPoint +", "+ endPoint;
    }

    public void draw() {
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}