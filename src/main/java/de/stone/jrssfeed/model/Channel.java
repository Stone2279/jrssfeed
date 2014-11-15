package de.stone.jrssfeed.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
	private String pubDate;

	@XmlElement(required = false)
	private String lastBuildDate;

	@XmlElement(required = false)
	private List<String> category = new ArrayList<>();

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
	private SkipHoursList skipHours = new SkipHoursList();

	@XmlElement(required = false)
	private SkipDaysList skipDays = new SkipDaysList();

	@XmlElement(required = true)
	private List<RssItem> item = new ArrayList<>();

	public void addCategory(final String category) {
		this.category.add(category);
	}

	public void addSkipHours(final int skipHour) {
		this.skipHours.getHour().add(skipHour);
	}

	public void addSkipDays(final SkipDay skipDay) {
		this.skipDays.getDay().add(skipDay);
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
		try {
			return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z",
					Locale.ENGLISH).parse(this.pubDate);
		} catch (final ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public void setPubDate(final Date pubDate) {
		this.pubDate = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z",
				Locale.ENGLISH).format(pubDate);
	}

	public Date getLastBuildDate() {
		try {
			return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z",
					Locale.ENGLISH).parse(this.lastBuildDate);
		} catch (final ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public void setLastBuildDate(final Date lastBuildDate) {
		this.lastBuildDate = new SimpleDateFormat(
				"EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH)
				.format(lastBuildDate);
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

	public SkipHoursList getSkipHours() {
		return this.skipHours;
	}

	public void setSkipHours(final SkipHoursList skipHours) {
		this.skipHours = skipHours;
	}

	public SkipDaysList getSkipDays() {
		return this.skipDays;
	}

	public void setSkipDays(final SkipDaysList skipDays) {
		this.skipDays = skipDays;
	}

	public List<RssItem> getItem() {
		return this.item;
	}

	public void setItem(final List<RssItem> item) {
		this.item = item;
	}
}
