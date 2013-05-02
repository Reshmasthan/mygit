package com.viaplay.page;


public class MyViaplayPage {
	
	/**
	 * Future ID field to be used to identify a page.
	 */
	public static final String ID = "";
	/**
	 * ID field shown when not logged in
	 */
	public static final String BUTTON_LOG_IN ="account-register.login-button";

    public static final String MYVIAPLAY_LOGIN_USERNAME ="form.account-login .login-name";
    public static final String MYVIAPLAY_LOGIN_PASSWORD ="form.account-login .login-pass";

	/**
	 * The url that, appended to to base url, will lead you to this page.
	 */
	public static final String URL = "/account";

    /**
     * The url that, appended to to base url, will lead you to account sub-pages.
     */
    public static final String URL_PARENTAL ="/account/view/parental";
    public static final String URL_PURCHASE_HISTORY = "/account/view/titles";
	
	/**
	 * This is the title text that is displayed in the browsers title row.
	 */
	public static final String TITLE = "Viaplay - Kontoöversikt";
	
	/**
	 * Submit button that saves changes to the user information form on the 
	 * MyViaplayPage and return to the previous page.
	 */
	public static final String SAVE_USER_INFO_SUBMIT = "account.user-information.submit-button";
	
	/**
	 * This is the CSS selector to the success frame that is shown after user info save.
	 */
	public static final String SAVE_USER_INFO_SUCCESS_INFO_CSS = "form#profile-info div.general-success";

	/**
	 * Submit button that saves changes in the account notification and update 
	 * form on the MyViaplayPage and return to the previous page.
	 */
	public static final String SAVE_ACCOUNT_NOTIFICATION_SUBMIT = "account.notification-settings.submit-button";

	/**
	 * This is the CCS selector to the success frame that is shown after user account information save.
	 */
	public static final String SAVE_ACCOUNT_NOTIFICATION_SUCCESS_INFO_CSS = "div.general-success";

	public static final String OVERVIEW_FIRSTNAME_INPUT_ID = "first-name";
	public static final String OVERVIEW_LASTNAME_INPUT_ID = "last-name";

	/**
	 * This is the input ID for current password on overview page.
	 */
	public static final String OVERVIEW_CURRENT_PASSWORD = "currentpassword";
	/**
	 * This is the input ID for new password on overview page.
	 */
	public static final String OVERVIEW_INPUT_NEW_PASSWORD = "newpassword";
	/**
	 * This is the input ID for confirm new password on overview page.
	 */
	public static final String OVERVIEW_INPUT_CONFIRM_PASSWORD = "confirmnew-password";
	/**
	 * Submit button that saves changes in the account overview and update
	 * form on the MyViaplayPage.
	 */
	public static final String OVERVIEW_SUBMIT_BUTTON ="account.user-information.submit-button";
	/**
	 * This is the CSS selector for purchase history page.
	 */
	public static final String PURCHASE_HISTORY_INFO_CSS = ".purchase-history";
	public static final String MENU_PURCHASE_HISTORY = ".titles_step";
	/**
	 * ID fields for Parental control.
	 */
	public static final String PARENTAL_INPUT = "pg-pin";
	public static final String PARENTAL_PIN_BUTTON = "account.parental-control.submit-button-parental-pin";
	public static final String PARENTAL_PIN_DROPDOWN = "account.parental-control.current-age-limit-dropdown";
	public static final String PARENTAL_INPUT_NEW_PIN = "pg-new-pin";
	public static final String PARENTAL_INPUT_CONFIRM_PIN = "pg-new-repeat-pin";
	public static final String PARENTAL_NEW_PIN_SUBMIT_BUTTON = "account.parental-control.submit-new-pin-code";
	
	public static final String ACCOUNT_SUBSCRIPTION_TITLE = "account.subscription-title";
	public static final String PACKAGE_TITLE_TV_FILM_SPORT = "TV + Film + Sport";
	
	
}
