package de.stone.jrssfeed.model;

import org.junit.Test;

public class RssModelTest {

	@Test
	public void objectToXml() {

		final Rss rss = new Rss();

		final Channel channel = new Channel();
		channel.setCategory(category);
		channel.setCloud(cloud);
		channel.setCopyright(copyright);
		channel.setDescription(description);
		channel.setDocs(docs);
		channel.setGenerator(generator);
		channel.setImage(image);
		channel.setLanguage(language);
		channel.setLastBuildDate(lastBuildDate);
		channel.setLink(link);
		channel.setManagingEditor(managingEditor);
		channel.setPubDate(pubDate);
		channel.addSkipDays(skipDay);
		channel.addSkipHours(skipHour);
		channel.addItem(item);
		channel.setTextInput(textInput);
		channel.setTitle(title);
		channel.setTtl(ttl);
		channel.setWebMaster(webMaster);

	}
}
