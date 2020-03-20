package Interface;

public class TaxableBus extends Bus implements ITaxable{
	public TaxableBus(int numberOfSeats, int regNumber, double value) {
	    super(numberOfSeats, regNumber, value);
	  }

	  public double TaxValue(){
	    return (value / 10) + 105 * numberOfSeats;
	  }
	  public void msg() {
		  System.out.println("default");
	  }
}
