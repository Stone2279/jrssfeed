package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Image {

	@XmlElement(required = true)
	private String url;

	@XmlElement(required = true)
	private String title;

	@XmlElement(required = true)
	private String link;

	@XmlElement(defaultValue = "88")
	private Integer width;

	@XmlElement(defaultValue = "31")
	private Integer height;

	@XmlElement
	private String description;

	public String getUrl() {
		return this.url;
	}

	public void setUrl(final String value) {
		this.url = value;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String value) {
		this.title = value;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(final String value) {
		this.link = value;
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(final Integer value) {
		this.width = value;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(final Integer value) {
		this.height = value;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String value) {
		this.description = value;
	}

}
