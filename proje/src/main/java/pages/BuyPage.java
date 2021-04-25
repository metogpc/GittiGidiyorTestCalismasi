package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuyPage extends Page{
	
	
	By altyaziKapat=By.xpath("//a[@class='policy-alert-close btn-alert-close']");
	By fiyat=By.id("sp-price-lowPrice");
	By sepetEkle=By.xpath("//button[@id='add-to-basket']");
	By sepetAc=By.xpath("//*[text()='Sepetim']");
	By sepettekiFiyat=By.className("total-price");
	By dropdownSelect=By.xpath("//select[@class='amount']");
	By toplamFiyat=By.className("total-price");
	By sil=By.xpath("//a[@title='Sil']");
	By urunYokMesaji=By.xpath("//div[@class='gg-d-19 gg-w-21 gg-t-19 gg-m-18']/h2");
	
	
	public boolean satinAlma(int index) throws InterruptedException {
		boolean sonuc=true;
		
		webDriver=anaSayfa();
		webDriver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
		webDriver.findElement(By.xpath("//*[@product-index='" + index + "']")).click();
		webDriver.manage().window().maximize();
		webDriver.findElement(altyaziKapat).click();
		Thread.sleep(4000);
		
		String price=webDriver.findElement(fiyat).getText();
		System.out.println(price);
		
		Thread.sleep(3000);
		WebElement element= webDriver.findElement(sepetEkle);
		element.click();
		Thread.sleep(3000);
		
		webDriver.findElement(sepetAc).click();
		Thread.sleep(3000);
		
		String price2=webDriver.findElement(sepettekiFiyat).getText();
		System.out.println(price2);
		
		Select dropdown=new Select(webDriver.findElement(dropdownSelect));
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		
		String price3=webDriver.findElement(toplamFiyat).getText();
		System.out.println(price3);

		webDriver.findElement(sil).click();
		Thread.sleep(3000);
		
		String note=webDriver.findElement(urunYokMesaji).getText();
		System.out.println(note);
		Thread.sleep(3000);
		if(price.equals(price2))
			sonuc=true;
		else
			sonuc=false;
		
		double priceDouble=sayiyaCevir(price);
		double price3Double=sayiyaCevir(price3);
		
		if(priceDouble*2!=price3Double) {
			sonuc=false;
		}
		else
			System.out.println("doğru");
		
		if(note.equals("Sepetinizde ürün bulunmamaktadır."))
			System.out.println("Dogru");
		else
			sonuc=false;
		
		return sonuc;
	}
	
	public double sayiyaCevir(String price) {
		int i=0;
		String a="";
		boolean b=true;
		while(b) {
			if(price.charAt(i)==',') {}
			else if (price.charAt(i)=='.') {}
			else if(price.charAt(i)==' ') {b=false;}
			else
				a+=price.charAt(i);
			i++;
		}
		return Double.parseDouble(a) ;
	}
	
}
