package com.spidertime.crawler;

public class CrawlerTest {


    public static void main(String[] args) {
        Crawler crawler = new Crawler();
        crawler.search("https://en.wikipedia.org/wiki/Manchester_United_F.C.", "Roy Keane");
        crawler.search("https://en.wikipedia.org/wiki/China", "China");
    }

}
