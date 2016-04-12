package week3;

import org.openqa.selenium.By;

public class CommonFunctions 
{
    // Locate elements by getElement method
	@SuppressWarnings("unused")
	public By getElement(String value)
	{
		By locator =null;
		String tempLocateBy ="";
		String tempLocateValue ="";
		if(value.startsWith("id")||value.startsWith("Id"))
		{
			tempLocateBy ="id";
			tempLocateValue=value.split("=")[1];
			locator=By.id(tempLocateValue);
			
		}
		else if(value.startsWith("name")||value.startsWith("Name"))
		{
			tempLocateBy ="name";
			tempLocateValue=value.split("=")[1];
			locator=By.name(tempLocateValue);		
		}
		else if(value.startsWith("classname")||value.startsWith("ClassName"))
		{
			tempLocateBy ="className";
			tempLocateValue=value.split("=")[1];
			locator=By.className(tempLocateValue);		
		}	
		else if(value.startsWith("//"))
		{
			tempLocateBy ="Xpath";
			tempLocateValue=value;
			locator=By.xpath(tempLocateValue);		
		}
		else if(value.startsWith("xpath")||value.startsWith("Xpath"))
		{
			tempLocateBy ="xpath";
			tempLocateValue=value.split(":")[1];
			locator=By.xpath(tempLocateValue);		
		}	
		else if(value.startsWith("linkText")||value.startsWith("LinkText"))
		{
			tempLocateBy ="linkText";
			tempLocateValue=value.split("=")[1];
			locator=By.linkText(tempLocateValue);	
			
		}	
		return locator;
	}
	
	// getCurrentMethod name
	@SuppressWarnings("unused")
	public static String getCurrentMethodNames() {
	    final StackTraceElement e = Thread.currentThread().getStackTrace()[2];
	    final String s = e.getClassName();
	    //return s.substring(s.lastIndexOf('.') + 1, s.length()) + "." + e.getMethodName();
	    return  e.getMethodName();
	}



}
