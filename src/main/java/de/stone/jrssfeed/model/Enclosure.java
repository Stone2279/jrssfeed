package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Enclosure {

	@XmlValue
	private String value;

	@XmlAttribute(name = "url", required = true)
	private String url;

	@XmlAttribute(name = "length", required = true)
	private int length;

	@XmlAttribute(name = "type", required = true)
	private String type;

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

	public int getLength() {
		return this.length;
	}

	public void setLength(final int value) {
		this.length = value;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String value) {
		this.type = value;
	}

}
