package assign.services;

import java.io.IOException;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Counter {
	
	public Counter () {
		
	}
	
	public int counter(String year) {
		String link = "http://eavesdrop.openstack.org/meetings/solum_team_meeting/";
		Document doc = null;
		int count = 0;
		
		// try to load the project page
		try {
			doc = Jsoup.connect(link + "/" + year).get();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		
		// get the web page's elements
		Elements items = null;
		if (doc != null) {
			items = doc.select("tr td a[href]");		
		} else {
			return -1;
		}
		
		// extract the elements and update the counter

		ListIterator<Element> iterator = items.listIterator();		    	
		while(iterator.hasNext()) {
	    	Element e = (Element) iterator.next();
    		String s = e.html();
    		if (s.equalsIgnoreCase("Parent Directory"))
    			continue;
    		else
    			count++;
	    }
		return count/4;
	}

}
