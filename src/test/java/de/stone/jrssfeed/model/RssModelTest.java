package de.stone.jrssfeed.model;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class RssModelTest {

	private final static String RSS_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><rss version=\"2.0\"><channel><title>Newsfeed</title><link>http://www.newsfeed.de</link><description>Test Newsfeed</description><language>DE-de</language><copyright>Copyright 2014</copyright><managingEditor>managing@test.com</managingEditor><webMaster>webmaster@test.com</webMaster><pubDate>Fri, 14 Mar 2014 03:11:43 +0100</pubDate><lastBuildDate>Fri, 14 Mar 2014 03:11:43 +0100</lastBuildDate><category>Newspapers</category><generator>Test generator</generator><docs>http://docs.de</docs><cloud domain=\"Cloud domain\" port=\"8888\" path=\"Cloud path\" registerProcedure=\"cloud register procedure\" protocol=\"http-post\"/><ttl>20</ttl><image><url>http://www.imageurl.de</url><title>Test image</title><link>http://www.imagelink.de</link><width>50</width><height>20</height><description>Image description</description></image><textInput><title>TextInout title</title><description>TextInput description</description><name>TextInput name</name><link>http://www.link.de</link></textInput><skipHours><hour>5</hour><hour>8</hour></skipHours><skipDays><day>Monday</day><day>Wednesday</day></skipDays><item><description>Item description</description><title>My news</title><author>author@test.de</author><link>http://www.mynews.de</link><comments>http://www.comments.com</comments><pubDate>Fri, 14 Mar 2014 03:11:43 +0100</pubDate><guid isPermaLink=\"false\">abcdefg</guid><enclosure url=\"http://www.scripting.com/mp3s/weatherReportSuite.mp3\" length=\"4\" type=\"audio/mpeg\"></enclosure><category>News</category><source url=\"http://www.source.de\">source value</source></item><item><description>Item description</description><title>My news</title><author>author@test.de</author><link>http://www.mynews.de</link><comments>http://www.comments.com</comments><pubDate>Fri, 14 Mar 2014 03:11:43 +0100</pubDate><guid isPermaLink=\"false\">abcdefh</guid><enclosure url=\"http://www.scripting.com/mp3s/weatherReportSuite.mp3\" length=\"4\" type=\"audio/mpeg\"></enclosure><category>News</category><source url=\"http://www.source.de\">source value</source></item></channel></rss>";

	@Test
	public void objectToXml() throws Exception {

		final Date testDate = new GregorianCalendar(2014, 2, 14, 3, 11, 43)
				.getTime();

		final Rss rss = new Rss();

		final Image image = new Image();
		image.setDescription("Image description");
		image.setHeight(20);
		image.setWidth(50);
		image.setLink("http://www.imagelink.de");
		image.setTitle("Test image");
		image.setUrl("http://www.imageurl.de");

		final TextInput textInput = new TextInput();
		textInput.setDescription("TextInput description");
		textInput.setLink("http://www.link.de");
		textInput.setName("TextInput name");
		textInput.setTitle("TextInout title");

		final Cloud cloud = new Cloud();
		cloud.setDomain("Cloud domain");
		cloud.setPath("Cloud path");
		cloud.setPort(8888);
		cloud.setProtocol(CloudProtocol.HTTP_POST);
		cloud.setRegisterProcedure("cloud register procedure");

		final Enclosure enclosure = new Enclosure();
		enclosure.setLength(4);
		enclosure.setType("audio/mpeg");
		enclosure
				.setUrl("http://www.scripting.com/mp3s/weatherReportSuite.mp3");
		enclosure.setValue("");

		final Guid guid = new Guid();
		guid.setIsPermaLink(false);
		guid.setValue("abcdefg");

		final Guid guid2 = new Guid();
		guid2.setIsPermaLink(false);
		guid2.setValue("abcdefh");

		final Source source = new Source();
		source.setUrl("http://www.source.de");
		source.setValue("source value");

		final RssItem firstItem = new RssItem();
		firstItem.setAuthor("author@test.de");
		firstItem.setCategory("News");
		firstItem.setComments("http://www.comments.com");
		firstItem.setDescription("Item description");
		firstItem.setEnclosure(enclosure);
		firstItem.setGuid(guid);
		firstItem.setLink("http://www.mynews.de");
		firstItem.setPubDate(testDate);
		firstItem.setSource(source);
		firstItem.setTitle("My news");

		final RssItem secondItem = new RssItem();
		secondItem.setAuthor("author@test.de");
		secondItem.setCategory("News");
		secondItem.setComments("http://www.comments.com");
		secondItem.setDescription("Item description");
		secondItem.setEnclosure(enclosure);
		secondItem.setGuid(guid2);
		secondItem.setLink("http://www.mynews.de");
		secondItem.setPubDate(testDate);
		secondItem.setSource(source);
		secondItem.setTitle("My news");

		final Channel channel = new Channel();
		channel.addCategory("Newspapers");
		channel.setCopyright("Copyright 2014");
		channel.setDescription("Test Newsfeed");
		channel.setDocs("http://docs.de");
		channel.setGenerator("Test generator");
		channel.setLanguage("DE-de");
		channel.setLastBuildDate(testDate);
		channel.setLink("http://www.newsfeed.de");
		channel.setManagingEditor("managing@test.com");
		channel.setPubDate(testDate);
		channel.addSkipDays(SkipDay.MONDAY);
		channel.addSkipDays(SkipDay.WEDNESDAY);
		channel.addSkipHours(5);
		channel.addSkipHours(8);
		channel.setTitle("Newsfeed");
		channel.setTtl(20);
		channel.setWebMaster("webmaster@test.com");
		channel.setImage(image);
		channel.setTextInput(textInput);
		channel.setCloud(cloud);
		channel.addItem(firstItem);
		channel.addItem(secondItem);

		rss.setChannel(channel);

		assertEquals(RSS_XML, rss.toXML());
	}

	@Test
	public void xmlToObject() throws Exception {

		final Date testDate = new GregorianCalendar(2014, 2, 14, 3, 11, 43)
				.getTime();

		final Rss rss = Rss.toObject(RSS_XML);

		assertEquals("2.0", rss.getVersion());
		assertEquals("Newsfeed", rss.getChannel().getTitle());
		assertEquals(testDate, rss.getChannel().getPubDate());
		assertEquals(2, rss.getChannel().getItem().size());

		// TODO: some more assertions
	}
}
