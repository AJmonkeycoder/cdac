package point2d;
import java.util.Scanner;


class Point2DTester{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many points to plot");
		Point2D[] points = new Point2D[input.nextInt()];
		int counter=0;
		
		boolean exit=false;
		while(!exit) {
			
			System.out.println("1-> Plot a point\n"
					+ "2-> Display all point\n"
					+ "3-> Distance b/w 2 points\n"
					+ "4-> Exit");
			switch(input.nextInt()) {
			
			
			//
			case 1 :
				
				System.out.println("Enter co-oridinates of P1 (x1,y1) : " );
				int ind = input.nextInt();
				if(ind<0 && ind>points.length) System.out.println("index is out of bound");
				else
					points[counter++]=new Point2D(input.nextInt(),input.nextInt());
				break;
				
			case 2 :
				for(Point2D p: points) {
					System.out.println(p);
				}
				break;
			case 3 :
				System .out.println("Enter two indeces");
				int ind1 = input.nextInt();
				int ind2 = input.nextInt();
				points[ind1].isSame(points[ind2]);
			break;
			
			case 4 : 
				exit=true;
			}
		}
		
		
		
		
		input.close();
	}
}
