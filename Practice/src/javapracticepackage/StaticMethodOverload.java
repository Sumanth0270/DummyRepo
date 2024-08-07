package javapracticepackage;

public class StaticMethodOverload 
{
	public static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
public static void add(int a,int b)
{
	System.out.println(a+b);
}
public static void sub()
{
	int a=100;
	int b=20;
	System.out.println(a-b);
}
public static void sub(int a,int b)
{
	System.out.println(a-b);
}
public static void main(String[] args) 
{
	StaticMethodOverload.add();
	StaticMethodOverload.add(100, 200);
	StaticMethodOverload.sub();
	StaticMethodOverload.sub(20,17);
}
}
