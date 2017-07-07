package assignment16;

public class contractEmployee extends employee implements promotionalOffers
{
	public contractEmployee(String name, int age, int empcode, String gender,
			int phno,int pf,int gratuity,int salary)
	{
		super(name, age, empcode, gender, phno, pf, gratuity, salary);
	}
	
	int contractDuration;
	
	public void setDuration(int duration) {this.contractDuration=duration;}
	
	public int getDuration() {return contractDuration;}
	
	void cdisp()
	{
		System.out.println("Contract Duration : "+contractDuration);
	}
	
	public void seasonOffer(int totalPurchaseAmount)
	{		
		totalPurchaseAmount=totalPurchaseAmount*15/100;
		System.out.println("15% of purchase : "+totalPurchaseAmount);
	}
	
	public void regularOffer(int amount)
	{		
		amount=amount*8/100;
		System.out.println("8% of purchase : "+amount);
	}

}
