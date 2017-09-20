interface myinter
{
	public void  method1();
	public void method2();
}
class Example implements myinter {
public void method1()
{
	System.out.print("method1 implemented");
}
public void method2()
{
	System.out.println("method2 implemented");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myinter obj=new Example();
		obj.method1();
		obj.method2();
	}
}

	


