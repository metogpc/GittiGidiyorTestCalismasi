package pages;

import org.openqa.selenium.By;

public class SearchPage extends Page{
	
	By bilgisayarText = By.xpath("//input[@class='sc-4995aq-0 sc-14oyvky-0 itMXHg']");
	By bilgisayarClick= By.xpath("//button[@class='qjixn8-0 sc-1bydi5r-0 hKfdXF']");
	By reklamKapat= By.xpath("wis-clsbtn-86917");
	
	public boolean searchPage2(String key) throws InterruptedException {
		
		webDriver=anaSayfa();
		webDriver.get(anasayfaAc("https://www.gittigidiyor.com/"));
		
		try {
			webDriver.findElement(bilgisayarText).sendKeys(key);
			webDriver.findElement(bilgisayarClick).click();
			webDriver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
