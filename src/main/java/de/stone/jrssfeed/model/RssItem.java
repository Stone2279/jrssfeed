package de.stone.jrssfeed.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class RssItem {

	@XmlElement(required = false)
	private String description;

	@XmlElement(required = false)
	private String title;

	@XmlElement(required = false)
	private String author;

	@XmlElement(required = false)
	private String link;

	@XmlElement(required = false)
	private String comments;

	@XmlElement(required = false)
	private Date pubDate;

	@XmlElement(required = false)
	private Guid guid;

	@XmlElement(required = false)
	private Enclosure enclosure;

	@XmlElement(required = false)
	private String category;

	@XmlElement(required = false)
	private Source source;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(final Date pubDate) {
		this.pubDate = pubDate;
	}

	public Guid getGuid() {
		return this.guid;
	}

	public void setGuid(final Guid guid) {
		this.guid = guid;
	}

	public Enclosure getEnclosure() {
		return this.enclosure;
	}

	public void setEnclosure(final Enclosure enclosure) {
		this.enclosure = enclosure;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public Source getSource() {
		return this.source;
	}

	public void setSource(final Source source) {
		this.source = source;
	}

}
