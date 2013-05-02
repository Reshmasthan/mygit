package com.viaplay.selector;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * This ViaId class is a wrapper of the selenium ById class. The reason for its existence is so that errors that
 * occur, and they do, can be easier to trace back.
 * 
 * @author mikael.p.larsson@afconsult.com
 * 
 */
public class ViaId extends Via {
	private String value = "";

	public ViaId(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	@Override
	public List<WebElement> findElements(SearchContext context) {
		return new ById(value).findElements(context);
	}
	
	@Override
	public String toString() {
		return String.format("<? id=\"%s\" />", value);
	}


}
