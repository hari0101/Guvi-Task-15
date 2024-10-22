package automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenGoogle {

	/*
	 * 2. Write a Selenium script in Java to open Google and search for "Selenium Browser Driver."
	 *  
	 */

	
	public static void main(String[] args) {
		
		//Initializing the browser instance
//		ChromeDriver safari = new ChromeDriver();
//						(OR)
		WebDriver chrome = new ChromeDriver();

//		Maximizing the webbrowser
		chrome.manage().window().maximize();
		
//		Global wait to even for all the element in the webpage		
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Opening the google website		
		chrome.get("https://www.google.com/");
		
//		passing the values to the google input field
		
		chrome.findElement(By.name("q")).sendKeys("Selenium Browser Driver");
		
//		clicking on the search button
		chrome.findElement(By.className("gNO89b")).click();
		
//		Title of the webpage
		String name = chrome.getTitle(); 
		System.out.println(name);
		
}

}
