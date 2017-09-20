 abstract class S1 {
	abstract void func1();
	void func2()
	{
		System.out.print("func2");
	}
	}
 class S2 extends S1
 {
	 void func1()
	 {
		 System.out.print("func1");
	 }
	 }
 class Sample
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 s=new S2();
		s.func1();
		s.func2();

	}

}
