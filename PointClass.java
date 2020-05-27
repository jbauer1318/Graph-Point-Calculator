import java.util.*;
public class PointClass {
	
	
public static void main(String args[]){
	
	
Scanner input = new Scanner(System.in);	
Point p1 = new Point();
System.out.println("First point is " + p1);
Point p2 = new Point(7, 13);
System.out.println("Second point is " + p2);
Point p3 = new Point(7, 15);
System.out.println("Third point is " + p3);
Point copyPoint = new Point();
	
	
if(p2.isVertical(p3))
System.out.println("Second point " + p2 + " lines up vertically with third point" + p3 + ".");
else
System.out.println("Second point " + p2 + " does not line up vertically with third point" + p3 + ".");
	
if(p2.isHorizontral(p3))
System.out.println("Second point " + p2 + " lines up horizontally with third point" + p3 + ".");
else
System.out.println("Second point " + p2 + " does not line up horizontally with third point" + p3 + ".");
	
	
	
	
	
System.out.println("Enter the x coordinate: ");
int ix = getX(); 
System.out.println("Enter the y coordinate: ");
int iy =  getY();
	
p1.setX(ix);
p1.setY(iy);
System.out.println("First point (after call to set) is" + p1);
System.out.println("Distance from the first point is: " + p1.distanceFromOrigin());
System.out.println("Distance from origin for second point is: " + p1);
System.out.println("Distance between first and second point is: " + p1.distance(p2));

	
p1.translate(5,10);
System.out.println("First point (after call to translate (5,10) =" + p1);
p2.translate(15,5);
System.out.println("Second point (after call to translate (15,5) =" + p2);

	
if(p1.equals(p2)){
System.out.println("Call to equals: The 2 points are equal.");
}
else{		
System.out.println("Call to equals: The 2 points are not equal.");
}
	
	
	
System.out.println("Calls to copy and print");
copyPoint = p1.getCopy();
System.out.println("Calls to copy and print");
p2 = copyPoint;
System.out.println("Calls to copy and print");

	
if(p2.equals(copyPoint)){
System.out.println("Calls to copy and print");
}
else{		
System.out.println("Calls to copy and print");
}
	
	
	
public static int getInt(Scanner sc) {
	int num;

	
	while (!sc.hasNextInt()) {
System.out.println("Not an integer, Try again");
		sc.next();
	}
	num = sc.nextInt();
		
	
	return num;
	
}
	
}
}