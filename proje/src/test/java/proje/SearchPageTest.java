package proje;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;

import pages.SearchPage;

public class SearchPageTest {
	final static Logger logger = Logger.getLogger(LoginPageTest.class);
	SearchPage sc=new SearchPage();
	
	@Test
	public void page2Test() throws InterruptedException {
		logger.warn("Arama test");
		assertTrue(sc.searchPage2("bilgisayar"));
	}
}
