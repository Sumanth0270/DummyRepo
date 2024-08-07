package programming;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryNumber 
{
public static void main(String[] args) 
{
	int a=256;
	ArrayList<Integer> binarylist=new ArrayList<Integer>();
	for(int i=0;i<=25;i++)
	{
		if(a%2==0)
		{
			binarylist.add(0);
			a=a/2;
		}
		else
		{
			binarylist.add(1);
			a=a/2;
		}
	}
	System.out.println(binarylist);
	Collections.reverse(binarylist);
	System.out.println(binarylist);
	
//	for(int i=binarylist.size()-1;i>=0;i--)
//	{
//		
//	}
}
}
	

