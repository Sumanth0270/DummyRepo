package javapracticepackage;

public class Variableshadowing 
{
static String brand="Nestle";
String id;
double price;
String quantity;
public Variableshadowing(String id,double price,String quantity)
{
	id=id;
	price=price;
    quantity=quantity;
}
public void display()
{
	System.out.println("--------------DETAILS--------------");
	System.out.println("Brand = "+Variableshadowing.brand);
	System.out.println("ID = "+id);
	System.out.println("Price = "+price);
	System.out.println("Quantity = "+quantity);
}
public static void main(String[] args) 
{
Variableshadowing p1=new Variableshadowing("p001", 56.2, "250ml");
Variableshadowing p2=new Variableshadowing("p002", 48.6, "750g");
p1.display();
p2.display();
}
}
