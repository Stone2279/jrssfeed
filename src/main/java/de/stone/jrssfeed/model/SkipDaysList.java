package de.stone.jrssfeed.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class SkipDaysList {

	private List<SkipDay> day = new ArrayList<SkipDay>();

	public List<SkipDay> getDay() {
		return this.day;
	}

	public void setDay(final List<SkipDay> day) {
		this.day = day;
	}

}
