package com.viaplay.menu;

/**
 * This interface collects all the ids and css selector strings that are relevant for the MEGA MENU. The Mega Menu is
 * the top menu on all top level pages. It is called the Mega Menu since it is so extensively decorated and has so large
 * dropdowns with images of features.
 * 
 * @author mikael.p.larsson@epsilon.nu
 * 
 */
public interface TopMenu {

	public static final String TOPMENU_LOGO = "header.main-logo";

	public static final String TOPMENU_TV = "header.main-menu-tv-link";
	public static final String TOPMENU_TV_SUB_MENU_CSS = "header#header nav ul.main-menu li ul.sub-menu";
	public static final String TOPMENU_TV_MOST_POPULAR = "header.main-menu.sub-menu.tv.most_popular";

	public static final String TOPMENU_MOVIES = "header.main-menu-movies-link";

	public static final String TOPMENU_SPORT = "header.main-menu-sport-link";

	public static final String TOPMENU_GET_VIAPLAY = "header.main-menu-get-viaplay-link";
	public static final String TOPMENU_GET_VIAPLAY_SUB_MENU_CSS = ".main-menu li.get-viaplay ul";
	public static final String TOPMENU_GET_VIAPLAY_PACKAGE = "header.main-menu.get-viaplay.packages-link";
	public static final String TOPMENU_GET_VIAPLAY_SUPPORTED_DEVICES = "header.main-menu.get-viaplay.supported-devices-link";
	public static final String TOPMENU_GET_VIAPLAY_SUPPORTED_DEVICES_CONTENT_CSS = ".wrapper .article-wrapper article.supported-devices";

	public static final String TOPMENU_LOGIN = "header.main-menu.login-link";
	public static final String TOPMENU_MY_VIAPLAY = "header.main-menu.my-viaplay-link";
	public static final String TOPMENU_CREATE_ACCOUNT = "header.main-menu.not-logged-in.create-account";

	public static final String TOPMENU_LOGIN_DROPDOWN = "login-dropdown";
	public static final String TOPMENU_LOGIN_INPUT_LOGIN_NAME = "login-name";
	public static final String TOPMENU_LOGIN_INPUT_LOGIN_PASS = "login-pass";
	public static final String TOPMENU_LOGIN_SUBMIT = "header.main-menu.not-logged-in.submit-button";
	public static final String TOPMENU_LOGOUT_LINK = "header.main-menu.logged-in.log-out-link";

	public static final String TOPMENU_ACCOUNT_MENU = "account-menu";
	public static final String TOPMENU_USERNAME_P_CSS = "#account-menu p";
	public final static String TOPMENU_ACCOUNT_OVERVIEW = "header.main-menu.logged-in.account-link";
	public final static String TOPMENU_ACCOUNT_PAYMENT_DETAILS = "header.main-menu.logged-in.payment-details-link";
	public final static String TOPMENU_ACCOUNT_PURCHASE_HISTORY = "header.main-menu.logged-in.purchased-titles-link";
	public final static String TOPMENU_ACCOUNT_PARENTAL_CONTROL = "header.main-menu.logged-in.parental-control-link";
	public final static String TOPMENU_ACCOUNT_FAQ = "header.main-menu.logged-in.faq-link";

	public static final String TOPMENU_CONTENT_SORTING_CSS = "div.content ul.section-sorting li.active";

	public final static String TOPMENU_SEARCH_FIELD = "header.main-menu-search-field";
	public final static String TOPMENU_SEARCH_BUTTON = "header.main-menu-search-submit-button";
	public final static String TOPMENU_QUICKSEARCH = "quicksearch";
	public final static String TOPMENU_QUICKSEARCH_RESULT_0 = "search_item_1";
	public final static String TOPMENU_QUICKSEARCH_SEE_ALL = "search.get-all-results-link";

}

