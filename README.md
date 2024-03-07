# Webcrawler
 Webcrawler with simple search function for keywords and hyperlinks built in Java 17 and jsoup package

No workaround for site protection from spiders, something that could be dealt with later

To be done:
- Retrieve a web page (we'll call it a document) from a website
- Collect all the links on that document
- Collect all the words on that document
- See if the word we're looking for is contained in the list of words
- Visit the next link
- Keep track of pages visited
- Limit the number of pages to search


Found good information at:
- https://docs.oracle.com/javase/8/docs/api/org/w3c/dom/Document.html
- http://www.netinstructions.com/how-to-make-a-simple-web-crawler-in-java/#google_vignette


Experiencing some issues with the imports of jsoup - resolved issue by working on docs:
https://jsoup.org/apidocs/org/jsoup/select/Elements.html
https://jsoup.org/cookbook/input/load-document-from-url

Imported Jsoup jar file and added on Intellij

Still need to take a closer look at the inner functionality; it really is just taking a search term and a URL
and then creating a document for each site with a URL found and then extracting all the links from it and adding them
to a String list; from there it runs a separate method to see if it can find the word on each of these pages.


BUG RESOLVED: Resolved bugs with the USER_AGENT - the imported class for this didn't work and had problems with a String USER_AGENT I got
from another website so I found a better String for this and used it and it worked.

This is not really full functionality, though. It's quite basic and can be improved on:
- 
- 
- 









