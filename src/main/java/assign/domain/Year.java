package assign.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

	
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Year {
	
	private int year;
	private int meetings_count;
	
	public Year() {
		year = -1;
		meetings_count = -1;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear(int year) {
		return this.year;
	}
	
	public void setCount(int count) {
		this.meetings_count = count;
	}
	
	public int getCount() {
		return this.meetings_count;
	}
	
}
