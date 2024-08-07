package programming;

public class LargestMultipleOf2 
{
public static void main(String[] args) 
{
int a=1,b=0,c=0;
if(a%2==0 && b%2==0 && c%2==0)
{
	if(a>b && a>c)
	{
		System.out.println(a+" is greater multiple of 2");
	}
	else if(b>a && b>c)
	{
		System.out.println(b+" is greater multiple of 2");
	}
	else
	{
		System.out.println(c+" is gteater multiple of 2");
	}
}
else if(a%2==0 && b%2==0 && c%2!=0)
{
	if(a>b)
	{
		System.out.println(a+" is greater multiple os 2");
	}
	else
	{
		System.out.println(b+" is greater multiple of 2");
	}
}
else if(a%2==0 && b%2!=0 && c%2==0)
{
	if(a>c)
	{
		System.out.println(a+" is greater multiple of 2");
	}
	else
	{
		System.out.println(c+" is greater multiple of 2");
	}
}
else if(a%2!=0 && b%2==0 && c%2==0)
{
	if(b>c)
	{
		System.out.println(b+" is greater multiple of 2");
	}
	else
	{
		System.out.println(c+" is greater multiple of 2");
	}
}
else if(a%2==0 && b%2!=0 && c%2!=0)
	{
		System.out.println(a+" is greater multiple of 2");
	}
else if(a%2!=0 && b%2==0 && c%2!=0)
{
	System.out.println(b+" is greater multiple of 2");
}
else if(a%2!=0 && b%2!=0 && c%2==0)
{
	System.out.println(c+" is greater multiple of 2");
}
else
{
	System.out.println(a+","+b+","+c+" are not multiple of 2");
}
}
}
