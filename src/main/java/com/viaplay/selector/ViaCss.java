package com.viaplay.selector;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * This is the preferred way to address an element on a web page.
 * This ViaCss class is a wrapper of the selenium ByCssSelector class. The reason for its existence is so that errors that
 * occur, and they do, can be easier to trace back.
 * 
 * @author mikael.p.larsson@afconsult.com
 * 
 */
public class ViaCss extends Via {
	String value = "";
	
	public ViaCss(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}
	
	@Override
	public List<WebElement> findElements(SearchContext context) {
		return new ByCssSelector(value).findElements(context);
	}
	
	@Override
	public String toString() {
		return String.format("that match css=\"%s\"", value);
	}

}
