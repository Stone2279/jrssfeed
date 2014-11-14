package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class TextInput {

	@XmlElement(required = true)
	private String title;

	@XmlElement(required = true)
	private String description;

	@XmlElement(required = true)
	private String name;

	@XmlElement(required = true)
	private String link;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String value) {
		this.title = value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String value) {
		this.description = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String value) {
		this.name = value;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(final String value) {
		this.link = value;
	}

}
