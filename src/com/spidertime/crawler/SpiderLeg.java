package com.spidertime.crawler;

import java.util.LinkedList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static jdk.internal.net.http.HttpRequestImpl.USER_AGENT;


public class SpiderLeg {

    private List<String> hyperlinks = new LinkedList<String>();
    private Document htmlDocument;

//    The Document interface represents the entire HTML or XML document with methods to access each part


//    Now create functionality methods

    public void crawl(String url) {
        try {

            Connection conn = Jsoup.connect(url).userAgent(USER_AGENT);
            this.htmlDocument = conn.get();

            System.out.println("Received web page at: " + url);

//            A list of Elements, with methods that act on every element in the list.
//             To get an Elements object, use the Element.select(String) method.
//            a[href] captures all the URLs on the page

            Elements pageLinks = htmlDocument.select("a[href]");
            System.out.println("Found (" + pageLinks.size() + ") links");

            for (Element link: pageLinks){
                this.hyperlinks.add(link.absUrl("href"));
            }

//            adds the href links to the hyperlinks String list instantiated at the start

        } catch (Exception e) {
            System.out.println("Error in our http request: " + e);
        }
    }



//    method to search for a keyword
    public boolean wordSearch(String searchWord){
        
    }

}
