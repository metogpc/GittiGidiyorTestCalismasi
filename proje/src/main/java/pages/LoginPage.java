package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

	private String userNameId="L-UserNameField";
	private String passwordId="L-PasswordField";
	private String loginId="gg-login-enter";
	WebDriver webDriver=anaSayfa();
	
	public boolean openLogin() {
		try {
			webDriver.get("https://www.gittigidiyor.com/uye-girisi");			
			webDriver.manage().window().maximize();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean login(String username, String password) {
		try {
			webDriver.findElement(By.id(userNameId)).sendKeys(username);
			webDriver.findElement(By.id(passwordId)).sendKeys(password);
			webDriver.findElement(By.id(loginId)).click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	
}
