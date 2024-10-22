package automationtesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTestScript {

//	5. What Are The Steps To Create A Simple Web Driver Script? Explain with code.
	
/*	
	Step 1 - Create a maven project on your eclipse IDE, new Pom.xml file will be added to you project.
	
	Step 2 - Add the selenium-java dependency from the maven and add to the pom.xml file.
	
	step 3 - Create a class and execute the selenium code.
	
*/	
	public static void main(String[] args) {

		//Initializing the browser instance
		WebDriver chrome = new ChromeDriver();

//		Maximizing the webbrowser
		chrome.manage().window().maximize();
		
//		Global wait to even for all the element in the webpage
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Opening the google website		
		chrome.get("https://www.selenium.dev/");
		
//		Title of the webpage
		String pagename = chrome.getTitle(); 
		System.out.println(pagename);
		
		
		
		
	}

}
