
public class Main {

	public static void main(String[] args) {
		
		//Static Inner Class
		Outer.StaticInner k1 = new Outer.StaticInner();
		
		//Non-Static Inner Class
		Outer.Inner k2 = new Outer().new Inner();
		
		
		new Outer().new Inner().i1();
		
		Outer.StaticInner.si1();
		
		new Outer.StaticInner().si2();
		
		new Outer().d1.show();
		new Outer().d2.show();	
		
	}
		
		
	}