package proje;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import pages.Page;

public class HomePageTest {
	final static Logger logger = Logger.getLogger(LoginPageTest.class);
	Page page= new Page();
	
	@Test
	public void anaSayfaTest() {
		logger.info("ana sayafa test");
		assertEquals("https://www.gittigidiyor.com/", page.anasayfaAc("https://www.gittigidiyor.com/"));
	}
}
