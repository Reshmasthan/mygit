package com.viaplay.page;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import com.viaplay.helper.Browser;
import com.viaplay.jcurl.JCurl;
import com.viaplay.selector.Via;
import org.json.JSONException;
import org.json.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.text.Normalizer;

import java.util.*;


public class CategoryDropDownTest {

    /**
     * This is the public url to the sitemap of the viaplay web site.
     */
    public static final String VIACONNECT_SITEMAP_URL_AS_STRING = "http://viaconnect.viaplay.tv/api/sitemap/get?devicekey=de906cd4d373eb39e5be75120d4fd121";
    public static final String BASE_URL = "http://viaplay.se";
 //  private static String response = JCurl.get(VIACONNECT_SITEMAP_URL_AS_STRING).toString();
    /**
     * Standard slf4j logger instantiation
     */
    Logger log = LoggerFactory.getLogger(CategoryDropDownTest.class);
    /**
     * Our browser object
     */
    Browser browser = null;


	public CategoryDropDownTest() {

	}

	@Before
	public void setUp() throws Exception {
        log.info("Setup of test run");
        browser = new Browser(Browser.HEADLESS);
        browser.setBaseUrl(BASE_URL);
	}

	@After
	public void tearDown() throws Exception {
        browser.logoutAndQuit();
    }


	/*@Test
	public void testCategoryDropDownOnAllPages() throws JSONException, Exception {
        String expectedURL = BASE_URL;
        HashMap tvList = getCategorySpec("sections/tv/categories");
        HashMap moviesList = getCategorySpec("sections/movies/categories");
        HashMap sportList = getCategorySpec("sections/sport/categories");
        assertEquals(browser, "tv", tvList);
        assertEquals(browser, "sport", sportList);
        assertEquals(browser, "movies", moviesList);
	}*/

    /**
     * Convenient helper method
     *
     * @param browser
     *            The Browser
     * @param section
     *            The wanted section to test(tv ,sport etc.)
     * @param categories
     *            The categories map under the wanted section to test
     *
     */
   /* private void assertEquals(Browser browser, String section, HashMap categories) throws JSONException, Exception{
        String currentUrl, siteMapUrl, catId, catName, pageCatId, pageCatName, pageCatAttr, catNameLink;
        String url = BASE_URL;
        if(section.toLowerCase().equals("tv")) {url = TvPage.URL;}
        if(section.toLowerCase().equals("movies")) {url = FilmPage.URL;}
        if(section.toLowerCase().equals("sport")) {url = SportPage.URL;}
        //System.out.println(url);
        for (Object key : categories.keySet()) {
            browser.get(url);
            browser.waitForElement(Via.id("genre-title")).click();
            catId = (String)key;
            catName = (String)categories.get(catId);
            catName = catName.split(":")[0];
            catNameLink = Normalizer.normalize(catName.toLowerCase().replaceAll("\\s", "-").replaceAll("\\.",""), Normalizer.Form.NFKD).replaceAll("\\p{M}", "");
            siteMapUrl = getUrlFromSiteMap("sections/"+section+"/tabsortings", "/"+section.toLowerCase()+"/"+catNameLink+"/"+catId+"/");
            pageCatName =  browser.waitForElement(Via.xpath("//*[contains(@id, 'category-dropdown."+catId+"\')]")).getText();
            pageCatAttr =  browser.waitForElement(Via.xpath("//*[contains(@id, 'category-dropdown."+catId+"\')]")).getAttribute("href");
            browser.waitForElement(Via.xpath("//*[contains(@id, 'category-dropdown."+catId+"\')]")).click();
            Thread.sleep(1000);
            currentUrl= browser.getWebDriver().getCurrentUrl();
            //System.out.println(currentUrl);
            //System.out.println(siteMapUrl);
            //System.out.println(pageCatAttr);
            assert(catName.equals(pageCatName));
            assert(siteMapUrl.equals(pageCatAttr));
            //assert(pageCatAttr.contains(currentUrl));
        }
        browser.get(BASE_URL);
    } */

    /**
     * Convenient helper method
     *
     * @param path
     *            The path to the tab categories
     * @return The map of all categories under the section
     */
   /* private HashMap getCategorySpec(String path) throws JSONException {
        String[] categoryPath = path.split("/");
        HashMap myMap = new HashMap<String, String>();
        String catId, catTitle, subCatId, subCatTitle;
        JSONObject sitemap = new JSONObject(response);
        JSONObject sections = sitemap.getJSONObject(categoryPath[0]);
        JSONObject section = sections.getJSONObject(categoryPath[1]);
        JSONObject categories = section.getJSONObject(categoryPath[2]);
        JSONArray categoryNames = categories.names();
        for (int i = 0; i < categoryNames.length(); i++) {
            catId = categoryNames.get(i).toString();
            JSONObject category = categories.getJSONObject(catId);
            catTitle = category.getString("title");
            if(catTitle.equals("Erotik")) {
                JSONObject subCategories = category.getJSONObject("subCategories");
                JSONArray subCategoryNames = subCategories.names();
                for (int j = 0; j < subCategoryNames.length(); j++) {
                    subCatId = subCategoryNames.get(j).toString();
                    JSONObject subCategory = subCategories.getJSONObject(subCatId);
                    subCatTitle = subCategory.getString("title");
                    myMap.put(catId, catTitle+subCatId+subCatId);
                    catTitle = catTitle+ ":"+subCatId+"-"+subCatTitle;
                }
            }
            myMap.put(catId, catTitle);
        }
        return myMap;
    }         */

    /**
     * Convenient helper method
     *
     * @param path
     *            The path to the tab tabsortings
     * @return The map of all tabsortings
     */
  /*  private TreeMap getTabSort(String path) throws JSONException {
        String[] categoryPath = path.split("/");
        HashMap myMap = new HashMap<String, String>();
        String catId, catTitle, subCatId, subCatTitle;
        JSONObject sitemap = new JSONObject(response);
        JSONObject sections = sitemap.getJSONObject(categoryPath[0]);
        JSONObject section = sections.getJSONObject(categoryPath[1]);
        String tabSortName = section.getString(categoryPath[2]);
        tabSortName= tabSortName.substring(1,tabSortName.length()-1);
        TreeMap tabSortMap = parseMap(tabSortName.substring(1,tabSortName.length()-1));
        return tabSortMap;
    }                   */

    /**
     * Convenient helper method
     *
     * @param input
     *            The string to converted to map
     * @return THe Map
     */
    /*
    private TreeMap<Integer, String> parseMap(String input) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        for (String pair : input.split(",")) {
            String[] kv = pair.split(":");
            map.put(Integer.parseInt(kv[1].replaceAll("\\W", "")), kv[0].replaceAll("\\W", ""));
        }
        return map;
    }   */

    /**
     * Convenient helper method
     *
     * @param path
     *            The path to the tab categories
     * @param sectionUrl
     *            The url from the section
     * @return THe URL to the page
     */
    /*private String getUrlFromSiteMap(String path, String sectionUrl) throws  JSONException {
        String url = BASE_URL+sectionUrl;
        TreeMap tvTabSort = getTabSort(path);
        url = url+tvTabSort.get(1);
        if(path.contains("/sport/")){url = url+"/all";}
        if(path.contains("/movies/")){
            String newURL = url.replace("movies", "film");
            url = newURL;
        }
        return url;
    }     */

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
