package Interface;

public class House extends FixedProperty{
	protected double area;

	  public House(String location, boolean inCity, double area, 
	               double value) {
	      super(location, inCity, value);
	   this.area = area;
	  }

	  public double getArea(){
	    
	     return area;
	    
	  } 
}
