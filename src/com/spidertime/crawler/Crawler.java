package com.spidertime.crawler;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Crawler {

    private static final int MAX_SEARCH_PAGES = 10;
    private Set<String> pagesVisited = new HashSet<String>();
    private List<String> pagesToVisit = new LinkedList<String>();

//    use a Set to store pages visited because it only stores one copy of each item
//  Lists have special methods such as adding an entry to the end of a list or adding an entry to the beginning



    /**
     * Our main launching point for the Spider's functionality. It creates spider legs
     * that make an HTTP request and parse the response (the page).
     *
     * @param url
     *            - The starting point of the spider
     * @param searchTerm
     *            - The word or string that you are searching for
     */


//    method to choose the next site to visit based on what's stored in the set and list above

    /*We get the first entry from pagesToVisit, check that URL isn't in our set of URLs we visited, and then return it. If for some reason we've already visited the URL (meaning it's in our set pagesVisited) we keep looping through the list of pagesToVisit and returning the next URL.*/

    private String nextURLToVisit() {
        String nextURLToVisit;
        do {
            nextURLToVisit = this.pagesToVisit.remove(0);
        } while (this.pagesVisited.contains(nextURLToVisit));
        return nextURLToVisit;
    }



//    search method with two inputs - the initial URL and the search word/s

    public void search(String url, String searchTerm) {
        

    }
    


}
