package TestNGdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprd {
	@Test(dataProvider = "dpr")
	public void Dat(Integer age, String name)
	{
		System.out.print("age is"+" "+age + "/");
		System.out.println("name is"+" "+name);
	
}

@DataProvider
public Object[][] dpr()
{
	return new Object[][]
			{
		new Object[] {25,"PAV"},
		new Object[] {26,"lal"},
		new Object[] {28,"P"},
		new Object[] {20,"kum"},
		
		};
	}
			
}
