

## Tips and Tricks

This page gives you clues on how to get passed some of the hurdles on your way when doing this assignment.


### Maven hiccups and remedies

When building a project that has the Google Selenium ChromeDriver as a resource in the project the ChromeDriver will 
not be executable in the target folder. The remedy is to change the executable bit of the ChromeDriver manually after 
the build. You might want to exclude tests when building the first time with `-DskipTests=true`.

	chmod 555 target/classes/externaltools/chromedriver
	
After this the test can be run with `mvn test` or `mvn install`.


### Showing elements in the browser without clicking on them.

Modern technologies for a rich UI in a web browser often uses JavaScript to make the experience nice and smooth.
Things are downloaded and turn up just as you move the cursor above a web element. 
This places the automated tests a bit in the shades and calls for special behavior.
Fortunately we have encountered this already and found the remedy. 

The Browser class has a method called `showElement(Via via)` that runs a small javascript in the web browser to make 
the element appear. It also returns the element it shows which can come very handy.


### The Via class and subclasses

Selenium has a selector class family that is called By. This is used to find elements on the current web page.
For logging and error reporting reasons we have wrapped them in a family that we call Via. 

The complete family has these members:

* Via - This is the mother class that has methods for each of its family members. You can enter `Via.css(value)` and
will get a ViaCss object in return.

* ViaCss - When in doubt use this since it is the by far most versatile way to find elements. 
You can for instance write `WebElement ul = browser.showElement(Via.css("ul.section-navigation"))`.
This method will show the element and return it in the same method. 

* ViaId - When there is an id on the element you are interested in this is the fastest method to access it.

* ViaName - This method uses the name attribute of an element to retrieve it. Useful when dealing with forms.


### Get deep and dirty with direct access to the Selenium WebDriver

The Browser class has a lot of neat methods to access pages and elements on those pages but its not a complete wrapper
of the Selenium WebDriver. 
To be able to do tricks the Selenium WebDriver is accessible in this way: 

	org.openqa.selenium.WebDriver webDriver = browser.getWebDriver();

Although this shouldn't be needed to succeed with this JTA it is available. 
Also keep in mind that if you feel the need to enhance the Browser class you are completely free to do so.
 
  
