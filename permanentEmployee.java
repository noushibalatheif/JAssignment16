package assignment16;

public class permanentEmployee extends employee implements promotionalOffers
{
	
	public permanentEmployee(String name, int age, int empcode, String gender,
			int phno,int pf,int gratuity,int salary)
	{
		super(name, age, empcode, gender, phno, pf, gratuity, salary);
	}

	String permanentCode;

	public void setpcode(String pcode)
	{
		this.permanentCode=pcode;
	}
	
	public String getpcode()
	{
		return  permanentCode;
	}
	
	void disp()
	{
		System.out.println("PermanentCode : "+ permanentCode);
	}
	
	
	public void seasonOffer(int totalPurchaseAmount) {
		totalPurchaseAmount=totalPurchaseAmount*25/100;
		System.out.println("25% of purchase : "+totalPurchaseAmount);
	}
	
	public void regularOffer(int amount) {
		amount=amount*10/100;
		System.out.println("10% of purchase : "+amount);
	}

}
