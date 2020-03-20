package Interface;

public interface ITaxable {
	int tax=0;
	 double TaxValue();
	 default void msg(){System.out.println("default method");}  
	
}
