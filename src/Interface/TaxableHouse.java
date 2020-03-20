package Interface;

public class TaxableHouse extends House implements ITaxable{
	 public TaxableHouse(String location, boolean inCity, double area, double value) {
		    super(location, inCity, area, value);
		  }

		  public double TaxValue(){
		    if (inCity)
		      return (estimatedValue / 1000.0) * 5 + 5 *(double)area;
		    else
		      return (estimatedValue / 1000.0) * 3;
		  }
}
