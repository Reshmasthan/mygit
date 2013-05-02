

# Welcome to Viaplay Job Test Assignment

This project is designed to be a boiler plate for the Viaplay Job Test Assignment, below JTA.
The project is available to you at the bitbucket-url you got when you where invited to this JTA.

>	Before you go any further please note that all information you gather from this 
	document and the code you are supplied is available to you according to a NDA, 
	Non Disclosure Agreement, set up between you as an individual and the MTG corporation. 
	You may not disclosure any of this information to anyone and you are expected to manage
	the material only by your own self.



## The JTA details

Your assignment is to create a test that verifies that the Viaplay web site has the correct set of categories in the
categories drop-down on the pages TV, MOVIES and SPORTS. You should also verify that the links in the drop-down works
and returns the expected page.

To view the drop-down go to the url http://viaplay.se/tv, 
below the feature box with interesting and/or new TV series you will find a drop-down directly to the right of the word TV.
If you let your mouse pointer hover of the text "Samtliga" the content of the drop-down will appear.

Our back-end service viaconnect do supply the web-page-generator with the facts for this drop-down. 
You are assigned to verify that the actual content of the drop-down is equal, in as many aspects as you can find, 
with the content you will receive from the viaconnect back-end service.

The viaconnect back-end service sitemap details can be inspected using any normal web browser. 
Just enter this url into the address field of your favorite web browser:

	http://viaconnect.viaplay.tv/api/sitemap/get?devicekey=de906cd4d373eb39e5be75120d4fd121


### Prerequisites

To be able to proceed with this JTA these are the knowledges you are expected to have:

* Good Java knowledge
* Medium JSON knowledge
* Good HTTP knowledge
* Good HTML knowledge
* Medium Maven 3 experience
* Good Git knowledge
* Medium Selenium Suite knowledge
* Java IDE of choice knowledge

These are the tools you must have installed and in working order before you start:

* Maven 3
* Git
* At least one of the major web browsers available. 
Firefox and Chrome have been used to verify this particular project soo far. 
Chrome is mandatory to be able to get the tests to succeed as they are in the repository.
* A debugger for the web browser. E.g. firebug for firefox or plain Chrome.
* A Java IDE of choice (Eclipse, IntelliJ or other) 


### Your JTA step by step

1. Clone the repository from bitbucket to your local computer.
2. Also clone the public repository for jCurl since that is used in this project: https://bitbucket.org/admin_viaplay/jcurl.
3. Build both the projects using Maven. Make sure they get installed to your local repository. 
See also the TipsAndTricks.md file. Tip: Click on the Source tab on this page and then TipsAndTricks.md.
4. Import both projects to your IDE of choice.
5. Study the JavaDoc of the Java sources in the project and we recommend you to start with the LoginTest.java class.
6. Continue to create the CategoryDropDownTest.java. A stub is there for you to use.
	* Feel free to alter any of the other classes as you find needed to improve the project although it strictly shouldn't be necessary.
7. Make a pull request of your code in bitbucket when you are done. Add user viaplay as reviewer of your pull request.



## JTA evaluation

Your performance in this JTA will be evaluated according to these rules:

* Code purity and the conformity to the Java standard.
* Code readability and ability to be reused.
* Code readiness for hand over purpose, to someone else than yourself.
* JavaDoc quality.




Best of luck

The Viaplay QA Team
