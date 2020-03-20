package generic;

public class Box1 implements storable<Integer>{
	Integer item;
	public Box1(Integer a) {
		item=a;
	}
	public void set(Integer a) {
		item=a;
	}
	public Integer get() {
		return item;
	}

}
