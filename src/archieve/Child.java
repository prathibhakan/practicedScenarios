package archieve;

public class Child extends Parent{
	
	public void Method1()
	{
		System.out.println("childMethod1");
	}
	public void Method3()
	{
		System.out.println("childMethod3");
	}
public static void main(String[] args)
	{
		Child c = new Child();
		c.Method1();//child method1
		c.Method2(); //parent method2
		
		Parent p = new Parent();
		p.Method1(); //Parent method1
		p.Method2(); //Parent Method3
		
		Parent p1 = new Child();
		p1.Method1(); //child Method1
		p1.Method2();//Parent Method2
		
	}
}