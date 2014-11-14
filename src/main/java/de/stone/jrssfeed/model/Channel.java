package de.stone.jrssfeed.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Channel {

	@XmlElement(required = true)
	private String title;

	@XmlElement(required = true)
	private String link;

	@XmlElement(required = true)
	private String description;

	@XmlElement(required = false)
	private String language;

	@XmlElement(required = false)
	private String copyright;

	@XmlElement(required = false)
	private String managingEditor;

	@XmlElement(required = false)
	private String webMaster;

	@XmlElement(required = false)
	private Date pubDate;

	@XmlElement(required = false)
	private Date lastBuildDate;

	@XmlElement(required = false)
	private List<String> category;

	@XmlElement(required = false)
	private String generator;

	@XmlElement(required = false)
	private String docs;

	@XmlElement(required = false)
	private Cloud cloud;

	@XmlElement(required = false)
	private int ttl;

	@XmlElement(required = false)
	private Image image;

	@XmlElement(required = false)
	private TextInput textInput;

	@XmlElement(required = false)
	private List<Integer> skipHours = new ArrayList<>();

	@XmlElement(required = false)
	private List<SkipDay> skipDays = new ArrayList<>();

	@XmlElement(required = true)
	private List<RssItem> item = new ArrayList<>();

	public void addSkipHours(final int skipHour) {
		this.skipHours.add(skipHour);
	}

	public void addSkipDays(final SkipDay skipDay) {
		this.skipDays.add(skipDay);
	}

	public void addItem(final RssItem item) {
		this.item.add(item);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(final String language) {
		this.language = language;
	}

	public String getCopyright() {
		return this.copyright;
	}

	public void setCopyright(final String copyright) {
		this.copyright = copyright;
	}

	public String getManagingEditor() {
		return this.managingEditor;
	}

	public void setManagingEditor(final String managingEditor) {
		this.managingEditor = managingEditor;
	}

	public String getWebMaster() {
		return this.webMaster;
	}

	public void setWebMaster(final String webMaster) {
		this.webMaster = webMaster;
	}

	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(final Date pubDate) {
		this.pubDate = pubDate;
	}

	public Date getLastBuildDate() {
		return this.lastBuildDate;
	}

	public void setLastBuildDate(final Date lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public List<String> getCategory() {
		return this.category;
	}

	public void setCategory(final List<String> category) {
		this.category = category;
	}

	public String getGenerator() {
		return this.generator;
	}

	public void setGenerator(final String generator) {
		this.generator = generator;
	}

	public String getDocs() {
		return this.docs;
	}

	public void setDocs(final String docs) {
		this.docs = docs;
	}

	public Cloud getCloud() {
		return this.cloud;
	}

	public void setCloud(final Cloud cloud) {
		this.cloud = cloud;
	}

	public int getTtl() {
		return this.ttl;
	}

	public void setTtl(final int ttl) {
		this.ttl = ttl;
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(final Image image) {
		this.image = image;
	}

	public TextInput getTextInput() {
		return this.textInput;
	}

	public void setTextInput(final TextInput textInput) {
		this.textInput = textInput;
	}

	public List<Integer> getSkipHours() {
		return this.skipHours;
	}

	public void setSkipHours(final List<Integer> skipHours) {
		this.skipHours = skipHours;
	}

	public List<SkipDay> getSkipDays() {
		return this.skipDays;
	}

	public void setSkipDays(final List<SkipDay> skipDays) {
		this.skipDays = skipDays;
	}

	public List<RssItem> getItem() {
		return this.item;
	}

	public void setItem(final List<RssItem> item) {
		this.item = item;
	}
}
