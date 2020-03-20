package generic;

public class Main {

	public static void main(String[] args) {
		Box1 b1= new Box1(100);
		Box2 b2= new Box2("Test");
		System.out.println(b1.get());
		System.out.println(b2.get());
	}

}
