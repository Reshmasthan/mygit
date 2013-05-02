package com.viaplay.page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.viaplay.jcurl.JCurl;

/**
 * This test suite verifies that the viaconnect web service returns the expected JSON.
 * 
 * @author mikael.p.larsson@afconsult.com
 * 
 */
public class ViaconnectReadTest {
	/**
	 * This is the public url to the sitemap of the viaplay web site.
	 */
	public static final String VIACONNECT_SITEMAP_URL_AS_STRING = "http://viaconnect.viaplay.tv/api/sitemap/get?devicekey=de906cd4d373eb39e5be75120d4fd121";

	/**
	 * This test verifies that viaconnect is returning the sitemap for the .se site.
	 */
	@Test
	public void testReadSiteMap() {
		String response = JCurl.get(VIACONNECT_SITEMAP_URL_AS_STRING).toString();
		assertContains("categories", response);
	}

	/**
	 * This test verifies that viaconnect is returning the sitemap for the .se site.
	 * 
	 * @throws JSONException
	 */
	@Test
	public void testReadSiteMapAndConvertToJSON() throws JSONException {
		String response = JCurl.get(VIACONNECT_SITEMAP_URL_AS_STRING).toString();
		assertContains("categories", response);
		JSONObject sitemap = new JSONObject(response);
		JSONObject sections = sitemap.getJSONObject("sections");
		JSONObject start = sections.getJSONObject("start");
		String title = start.getString("title");
		assertEquals("Start", title);
	}

	/**
	 * Convenient helper method
	 * 
	 * @param expected
	 *            The value expected to be found in the was object
	 * @param was
	 *            The object that should contain the expected value.
	 */
	private void assertContains(String expected, Object was) {
		assertTrue("The expected " + expected + " string is not part of " + was, was.toString().indexOf(expected) != -1);
	}

}
