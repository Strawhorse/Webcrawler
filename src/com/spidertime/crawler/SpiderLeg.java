package com.spidertime.crawler;

import java.util.LinkedList;
import java.util.List;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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



        } catch (Exception e) {
            System.out.println("Error in our http request: " + e);
        }
    }



}
