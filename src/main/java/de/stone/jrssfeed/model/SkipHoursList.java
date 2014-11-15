package de.stone.jrssfeed.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SkipHoursList", propOrder = { "hour" })
public class SkipHoursList {

	@XmlElement(type = Integer.class)
	private List<Integer> hour = new ArrayList<Integer>();

	public List<Integer> getHour() {
		return this.hour;
	}

	public void setHour(final List<Integer> hour) {
		this.hour = hour;
	}

}
