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


//    method to choose the next site to visit based on what's stored in the set and list above

    private String nextURLToVisit() {
        String nextURLToVisit;
        do {
            nextURLToVisit = this.pagesToVisit.remove(0);

        }
    }
    


}
