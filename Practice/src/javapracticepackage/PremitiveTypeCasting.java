package javapracticepackage;

public class PremitiveTypeCasting 
{
public static void main(String[] args) 
{
//Widening
	char a='A';
	System.out.println(a);
	double b=a;
	System.out.println(b);
//Narrowing
	double c=98.142;
	System.out.println(c);
	char d=(char)c;
	System.out.println(d);
	System.out.println();
	for(int i=65;i<=90;i++)
	{
		char e=(char)i;
		System.out.println(i+" ------------>"+e);
	}
	System.out.println();
	for(int i=97;i<=122;i++)
	{
		char e=(char)i;
		System.out.println(i+" ------------>"+e);
	}
}
}
