
public class Outer {
	
	private int a;
	private int b;
	private static int c;
	
	Display d1 = new Display() {
		@Override
		public void show() {
			System.out.println("Showing from Annonymous class");
		}
	};
	
	Display d2 = new Display() {
		@Override
		public void show() {
			System.out.println("Again showing from Annonymous class");
		}
	};
	
	public static void o1() {
		System.out.println("Static method in Outer");
	}
	
	public void o2() {
		System.out.println("Instance method in Outer");
	}
	
	public void o3() {
		
		class LocalInner
		{
			public void li1()
			{
				System.out.println("Instance Method in Local Inner");
				Outer.o1();
				Outer.this.o2();
			}
		}
		new LocalInner().li1();
	}
	
	
	public class Inner{
		
		public void i1()
		{
			System.out.println("Instance Method in Non-Static Inner");
			Outer.o1();
			Outer.this.o2();
		}
		
	}
	
	public static class StaticInner{
		
		public static void si1()
		{
			System.out.println("Static method in StaticInner");
			Outer.o1();
		}
		
		public void si2()
		{
			System.out.println("Instance method in StaticInner");
			Outer.o1();
		
		}
		
	}
	

	
	
	
}
