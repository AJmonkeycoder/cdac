package point2d;

class Point2D{
	private int x;
	private int y;
	
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "X: "+x+" Y: "+y;
	}
	
	boolean isEqual(Point2D p){
		if(this.x==p.x && this.y==p.y) return true;
		return false;
	}
	
	public double calculateDistance(Point2D p2){
		return Math.sqrt(((p2.x-this.x)*(p2.x-this.x)) + ((p2.y-this.y)*(p2.y-this.y)));
	}
	
	String isSame(Point2D p){
		if(this.isEqual(p)) return "Same";
		System.out.println("Distance between two point is "+this.calculateDistance(p));
		return "different";	
		
	}
}
