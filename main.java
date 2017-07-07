package assignment16;

public class main
{
	public static void main(String[] args)
	{
		permanentEmployee p=new permanentEmployee("John", 35, 1001, "Male", 989545, 200, 300, 15000);
		contractEmployee c=new contractEmployee("Mary", 24, 1112, "female", 9856224, 500, 600, 10000);
		
		System.out.println("Permanent Employee");
		System.out.println("....................");
		p.setpcode("PM100");
		p.display();
		p.disp();
		p.regularOffer(2500);
		p.seasonOffer(2500);
		System.out.println("=====================");
		
		System.out.println("Contract Employee");
		System.out.println("....................");
		c.setDuration(6);
		c.getDuration();
		c.display();
		c.cdisp();
		c.regularOffer(2500);
		c.seasonOffer(2500);
		System.out.println("=====================");
		
		System.out.println("Contract Employee");
		customer custom=new customer("Anna", "Calicut", 25, 9895623);
		custom.customDisplay();
		custom.regularOffer(2500);
		custom.seasonOffer(2500);
		System.out.println("=====================");
	}

}
