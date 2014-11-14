package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Guid {

	@XmlValue
	private String value;

	@XmlAttribute(name = "isPermaLink")
	private boolean isPermaLink = true;

	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public boolean isIsPermaLink() {
		return this.isPermaLink;
	}

	public void setIsPermaLink(final boolean value) {
		this.isPermaLink = value;
	}

}
