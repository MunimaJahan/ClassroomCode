package array;

public class PassbyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=8;
		int c[]= {6,7};
		point p =new point(a);
		point q= new point(p);
		swap(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		swap(c);
		System.out.println("c0="+c[0]);
		System.out.println("c1="+c[1]);
		//p.setX(5);
		System.out.println("x="+p.getX());
		System.out.println(q.getX());
		p.setX(15);
		System.out.println("p="+p.getX());
		System.out.println("q="+q.getX());
		changeObject(p,q);
		System.out.println("after change p="+p.getX());
		System.out.println("after change q="+q.getX());
	}
	public static void swap(int a, int b) {
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
	}
	public static void swap(int c[]) {
		int tmp;
		tmp=c[0];
		c[0]=c[1];
		c[1]=tmp;
	}
	public static void changeObject(point r,point q) {
		point tmPoint=new point(2);
		tmPoint.setX(r.getX());
		r.setX(q.getX());
		q.setX(tmPoint.getX());
	}

}
