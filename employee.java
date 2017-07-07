package assignment16;

public class employee
{
	String name;
	int age;
	int empcode;
	String gender;
	int phno;
	int pf;
	int gratuity;
	int salary;
	
	public employee(String name, int age, int empcode, String gender,
			int phno,int pf,int gratuity,int salary)
	{
		this.name=name;
		this.age=age;
		this.empcode=empcode;
		this.gender=gender;
		this.phno=phno;;
		this.pf=pf;
		this.gratuity=gratuity;
		this.salary=salary;
	}
	
	public int calculateSalary()
	{
		return(salary-(pf+gratuity));
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Employee Code : "+empcode);
		System.out.println("Gender : "+gender);
		System.out.println("Phone No. : "+phno);
		System.out.println("Total Salary : "+calculateSalary());
    }

}
