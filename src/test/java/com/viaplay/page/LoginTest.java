package com.viaplay.page;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.viaplay.helper.Browser;
import com.viaplay.helper.User;
import com.viaplay.helper.User.UserData;
import com.viaplay.selector.Via;

/**
 * This test class is a proof-of-concept test class that shows how the Viaplay test frame work is meant to be used.
 * Before starting out with your own test class be sure to have read and understand this piece of code.
 * 
 * @author mikael.p.larsson@afconsult.com
 * 
 */
public class LoginTest {
	/**
	 * Standard slf4j logger instantiation
	 */
	Logger log = LoggerFactory.getLogger(LoginTest.class);

	/**
	 * Our browser object
	 */
	Browser browser = null;
	
	/**
	 * Our user object for this test suite.
	 */
	UserData user = User.JOB_TEST; 

	/**
	 * This test setup method is run before each test method below. It creates a new browser and sets its default base
	 * url. This might not be the desired way for some test cases but is fine for this.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		log.info("Setup of test run");
		browser = new Browser(Browser.CHROME);
		browser.setBaseUrl("http://viaplay.se");
	}

	/**
	 * This test tear down method is run after each test method below. It makes sure the current user is logged out
	 * before the browser is closed.
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		browser.logoutAndQuit();
	}

	/**
	 * This test log in a user and verifies that the correct user is logged in.
	 */
	/*@Test
	public void testLogin() {
		browser.get(RootPage.URL);
		browser.login(user);
		browser.get(MyViaplayPage.URL);
		String firstName = browser.waitForElement(Via.id(MyViaplayPage.OVERVIEW_FIRSTNAME_INPUT_ID)).getAttribute(
				"value");
		String lastName = browser.waitForElement(Via.id(MyViaplayPage.OVERVIEW_LASTNAME_INPUT_ID))
				.getAttribute("value");
		assertEquals(user.getFirstName(), firstName);
		assertEquals(user.getLastName(), lastName);
	}*/

	/**
	 * This test maneuvers to all major pages on the Viaplay web site. 
	 */
	//@Test
	public void testGotoAllPages() {
		browser.get(RootPage.URL);
		browser.get(TvPage.URL);
		browser.get(FilmPage.URL);
		browser.get(SportPage.URL);
		browser.get(ChildrenPage.URL);
	}

}
