package com.spidertime.crawler;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//import static jdk.internal.net.http.HttpRequestImpl.USER_AGENT;


//    Why the USER_AGENT imported above
//    This is because some web servers get confused when robots visit their page.
//    Some web servers return pages that are formatted for mobile devices if your
//    user agent says that you're requesting the web page from a mobile web browser.


public class SpiderLeg {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
    private List<String> hyperlinks = new LinkedList<String>();
    private Document htmlDocument;

//    The Document interface represents the entire HTML or XML document with methods to access each part
//    Now create functionality methods



    public boolean crawl(String url) {
        try {

            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            this.htmlDocument = connection.get();

            System.out.println("Received web page at: " + url);

//            A list of Elements, with methods that act on every element in the list.
//             To get an Elements object, use the Element.select(String) method.
//            a[href] captures all the URLs on the page

            Elements pageLinks = htmlDocument.select("a[href]");
            System.out.println("Found (" + pageLinks.size() + ") links");

            for (Element link: pageLinks){
                this.hyperlinks.add(link.absUrl("href"));
            }
            return true;

//            adds the href links to the hyperlinks String list instantiated at the start

        } catch (IOException e) {
            System.out.println("Error in our http request: " + e);
            return false;
        }
    }



//    method to search for a keyword
//    this method will be called after the pages have been retrieved - maybe as part of a loop through all the sites found
//  returns a boolean to say if the word was found on the site
//    Will need to make some improvements later as this is just telling us if the word was found or not

    public boolean wordSearch(String searchWord){
        System.out.println("Searching for keyword " + searchWord + " ...");
        String bodyText = this.htmlDocument.body().text();
        return bodyText.toLowerCase().contains(searchWord.toLowerCase());
    }


//finally a small method to return the links we stored in the String list
    public List<String> getLinks(){
        return this.hyperlinks;
    }

}
