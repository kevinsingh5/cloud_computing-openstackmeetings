package assign.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import assign.domain.Solum_Team_Meeting;
import assign.domain.Year;
import assign.services.Counter;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

@Path("/solum")
public class SolumResource {
	
	Counter counter = new Counter();
	
	public SolumResource() {
		
	}

	@GET
	@Path("/api")
	@Produces("application/xml")
	public Solum_Team_Meeting buildAPI() {
		
		Solum_Team_Meeting solum = new Solum_Team_Meeting();
		
		for(int i = 2013; i <= 2017; i++) {
			Year year = new Year();
			int count = -1;
			year.setYear(i);
			count = counter.counter(String.valueOf(i));
			year.setCount(count);
			solum.addYear(year);
		}
		return solum;
	}
	
	@GET
	@Path("/count")
	@Produces("text/html")
	public String count() throws Exception {
		String path = "http://localhost:8080/assignment6/assignment6/solum/api";
		
		XPath xpath = XPathFactory.newInstance().newXPath();
		String expression = "/solumTeamMeeting/years/year/meetings_count";
		
		InputSource inputSource = new InputSource(path);
		NodeList nodes = (NodeList) xpath.evaluate(expression, inputSource, XPathConstants.NODESET);
		
		String result = "";
		for(int i=0; i<nodes.getLength(); i++) {
			Node n = nodes.item(i);
			result += n.getTextContent() + " ";
			System.out.println("Node value:" + n.getTextContent());
		}
		return result;
	}
	
	@GET
	@Path("/helloworld-austin")
	@Produces("text/html")
	public String helloAustin() {
		System.out.println("Inside helloAustin");
		return "Hello Austin ";
	}

}
