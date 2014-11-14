package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Source {

	@XmlValue
	private String value;

	@XmlAttribute(name = "url")
	private String url;

	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(final String value) {
		this.url = value;
	}

}
