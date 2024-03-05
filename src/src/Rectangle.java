import java.util.ArrayList;

class Rectangle extends Shape{
	private Point topLeft;
	private int width;
	private int height;

	public Rectangle(Point p, int w, int h){
		this.topLeft = p;
		this.width = w;
		this.height = h;
	}

	public ArrayList<Pixel> draw(){
		//	
		return null;
	};
	
	public String toString(){
		return super.toString()+"Rectangle : "+topLeft.toString()+", width "+ width + ", hauteur "+ height;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
