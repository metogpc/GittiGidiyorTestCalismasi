package proje;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import pages.LoginPage;

public class LoginPageTest {

	final static Logger logger = Logger.getLogger(LoginPageTest.class);
	LoginPage loginPage=new LoginPage();
	
	@Test
	public void loginTest() {
		loginPage.openLogin();
		logger.info("Login test başladı");
		assertTrue(loginPage.login("denemeTest123@gmail.com", "123456m."));
	}
}
