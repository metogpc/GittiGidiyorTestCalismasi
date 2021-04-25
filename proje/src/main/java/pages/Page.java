package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page {

	protected WebDriver webDriver;
	
	public WebDriver anaSayfa() {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/Desktop/mulakat2/demo/src/main/java/chromedriver.exe" );
		WebDriver webDriver = new ChromeDriver(options);
		return webDriver;
	}
	
	public String anasayfaAc(String url) {
		try {
			anaSayfa().get(url);
			return url;
		} catch (Exception e) {
			// TODO: handle exception
			return "url hata";
		}
	}

}
