package TestNG_Scripts;

import org.testng.annotations.Test;

public class Sample_TestNG_Scripts 
{

	@Test(priority=1)
	public void India()
	{
		System.out.println("I am in India");
	}
	
	@Test(priority=2)
	public void Telengana()
	{
		System.out.println("I am in Telengana");
	}
	
	@Test 
	public void Hyderabad()
	{
		System.out.println("I am in Hyderabad");
	}
	
	/*
* I am in Hyderabad
I am in India
I am in Telengena
	 */
}
