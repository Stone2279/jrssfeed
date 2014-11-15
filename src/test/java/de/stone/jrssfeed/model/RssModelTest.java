package de.stone.jrssfeed.model;

import java.util.Date;

import org.junit.Test;

public class RssModelTest {

	@Test
	public void objectToXml() throws Exception {

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
		firstItem.setPubDate(new Date());
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
		secondItem.setPubDate(new Date());
		secondItem.setSource(source);
		secondItem.setTitle("My news");

		final Channel channel = new Channel();
		channel.addCategory("Newspapers");
		channel.setCopyright("Copyright 2014");
		channel.setDescription("Test Newsfeed");
		channel.setDocs("http://docs.de");
		channel.setGenerator("Test generator");
		channel.setLanguage("DE-de");
		channel.setLastBuildDate(new Date());
		channel.setLink("http://www.newsfeed.de");
		channel.setManagingEditor("managing@test.com");
		channel.setPubDate(new Date());
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

		System.out.println(rss.toXML());
	}
}
