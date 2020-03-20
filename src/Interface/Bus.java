package Interface;

public class Bus extends Vehicle{
	protected int numberOfSeats;
	public Bus(int numberOfSeats, int regNumber, double value) {
	      super(regNumber, 80, value);
	    this.numberOfSeats = numberOfSeats;
	  }

	  public int getNumberOfSeats(){
	    
	     return numberOfSeats;
	  } 
}
