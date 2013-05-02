package com.viaplay.selector;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * This ViaName class is a wrapper of the selenium ByName class family. The reason for its existence is so that errors that
 * occur, and they do, can be easier to trace back.
 * 
 * @author mikael.p.larsson@afconsult.com
 * 
 */
public class ViaName extends Via {
	String value = "";
	
	public ViaName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public List<WebElement> findElements(SearchContext context) {
		return new ByName(value).findElements(context);
	}

	@Override
	public String toString() {
		return String.format("<%s />", value);
	}


}
