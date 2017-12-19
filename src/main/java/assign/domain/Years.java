package assign.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

	
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Years {
	
	private List<Year> year = new ArrayList<Year>();
	
	public Years() {
		
	}
	
	public void addYear(Year year) {
		this.year.add(year);
	}
	
	public List<Year> getYears() {
		return this.year;
	}
	
}
