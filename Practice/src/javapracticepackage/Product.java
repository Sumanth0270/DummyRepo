package javapracticepackage;

public class Product 
{
static String brand="Nestle";
String pid;
double price;
String qty;
//public Product(String pid,double price,String qty)
//{
//	this.pid=pid;
//	this.price=price;
//	this.qty=qty;
//}
public Product(String pid, double price, String qty) 
{
	super();
	this.pid = pid;
	this.price = price;
	this.qty = qty;
}
public Product(String pid,double price)
{
	this.pid=pid;
	this.price=price;
}
public void display()
{
	System.out.println("Brand : "+Product.brand);
	System.out.println("Product id : "+pid);
	System.out.println("Price : "+price);
	System.out.println("Quantity :"+qty);
	System.out.println("..............................................");
}
public static void main(String[] args) 
{
Product p1=new Product("p001", 45.68d, "1000ml");
Product p2= new Product("p002", 125.64d);
System.out.println("........................DETAILS...................");
p1.display();
p2.display();
}
}
