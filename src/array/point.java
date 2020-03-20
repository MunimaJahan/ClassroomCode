package array;

public class point {
private int x;
public point(int a){
	x=a;
}
//Copy constructor
public point(point p) {
	this.x=p.x;
}
public void setX(int a) {
	x=a;
}
public int getX() {
	return(x);
}


}
