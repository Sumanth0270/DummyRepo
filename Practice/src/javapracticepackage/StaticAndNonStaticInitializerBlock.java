package javapracticepackage;

public class StaticAndNonStaticInitializerBlock 
{
	public StaticAndNonStaticInitializerBlock()
	{
		System.out.println("Constructor loading...!");
	}
	public static void main(String[] args) 
	{
		System.out.println("main loading...!");
	}
	static
	{
		System.out.println("static loading...!");
		StaticAndNonStaticInitializerBlock ob1=new StaticAndNonStaticInitializerBlock();	
        StaticAndNonStaticInitializerBlock ob2=new StaticAndNonStaticInitializerBlock();		
	}
	{
		System.err.println("non static loading...!");
	}
}
