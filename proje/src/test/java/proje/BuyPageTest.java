package proje;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

import pages.BuyPage;

public class BuyPageTest {
	final static Logger logger = Logger.getLogger(LoginPageTest.class);
	BuyPage buyPage=new BuyPage();
	
	@Test
	public void buy() throws InterruptedException {
		logger.info("alisveris testi");
		Random rnd=new Random();
		int index=rnd.nextInt(48);
		assertTrue(buyPage.satinAlma(index));
	}
	
}
