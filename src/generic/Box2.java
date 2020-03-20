package generic;

public class Box2 implements storable<String>{
	String item;
	public Box2(String a) {
		item=a;
	}
	public void set(String a) {
		item=a;
	}
	public String get() {
		return item;
	}

}