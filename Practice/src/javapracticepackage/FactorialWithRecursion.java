package javapracticepackage;

public class FactorialWithRecursion 
{
public static void main(String[] args) 
{
	System.out.println(FactorialWithRecursion.fact(5));
}
public static int fact(int n)
{
	if(n>1)
	{
		return n*fact(n-1);
	}
	else
		return 1;
}
}
