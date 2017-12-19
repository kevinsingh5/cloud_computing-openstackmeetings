package assign.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

	
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Solum_Team_Meeting {

	private Years years;
	//@XmlElementWrapper(name="solum_team_meeting")

	public Solum_Team_Meeting() {
		years = new Years();
	}
	
	public Years getYears() {
		return years;
	}
	
	public void addYear(Year year) {
		this.years.addYear(year);
	}
	
}
