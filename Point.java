public class Point {
	
	
private int x;
private int y;	
	
public Point(){
this(0,0);
}
	
public Point(int ix, int iy){
x = ix;
y = iy;
}


public void setX(int ix){
x = ix;
}

public void setY(int iy){
y = iy;
}

public int getX(){
return x;
}

public int getY(){
return y;
}

public String toString() {	
return "(" + x + "," + y + ")";
}

public void print(){
System.out.println("(" + x + "," + y + ")");
}


public boolean equal(Point otherPoint){
return(x == otherPoint.x && y == otherPoint.y);
}

public void copy(Point otherPoint){
x = otherPoint.x;
y = otherPoint.y;	
}

public Point getCopy(){
Point ipoint = new Point();
ipoint.x = x;
ipoint.y = y;
    return ipoint;
}

public double distance(Point otherPoint) {
int dx = x - otherPoint.x;
int dy = y - otherPoint.y;
double distance = Math.sqrt(dx*dx + dy*dy);
return distance;
}


public double distanceFromOrigin() {
Point origin = new Point();
return  distance(origin);	
}

public void translate(int dx, int dy) {
x += dx;
y += dy;    
}

public boolean isHorizontral(Point otherPoint){
if (y == otherPoint.y){
return true;
}
	
return false;
}

public boolean isVertical(Point otherPoint){
if (x == otherPoint.x){
return true;
	
}
	
return false;
}

public double slope(Point otherPoint){
double changeInX = otherPoint.x - x;
double changeInY = otherPoint.y - y;
double slope = changeInY/changeInX;
return slope;
}



}