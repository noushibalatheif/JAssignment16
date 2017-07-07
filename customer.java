package assignment16;

public class customer implements promotionalOffers
{
	String name;
	String address;
	int age;
	int phno;
	
	customer(String name, String address, int age, int phno)
	{
		this.name=name;
		this.address=address;
		this.age=age;
		this.phno=phno;;
				
	}

	void customDisplay()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
		System.out.println("Phone No. : "+phno);
	}
	
	public void seasonOffer(int totalPurchaseAmount)
	{	
		totalPurchaseAmount=totalPurchaseAmount*15/100;
		System.out.println("15% of purchase : "+totalPurchaseAmount);
	}

	public void regularOffer(int amount)
	{
		amount=amount*0/100;
		System.out.println("0% of purchase : "+amount);
	}
}
