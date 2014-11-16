package de.stone.jrssfeed;

import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXBException;

import de.stone.jrssfeed.model.Rss;

public class RssCache {

	private final ConcurrentHashMap<String, Rss> rssCache = new ConcurrentHashMap<>();

	public void putRssObject(final String key, final Rss rss) {
		this.rssCache.put(key, rss);
	}

	public void putRssText(final String key, final String rss)
			throws JAXBException {

		Rss object = null;
		if (rss != null && rss.length() > 0) {
			object = Rss.toObject(rss);
		}
		this.rssCache.put(key, object);
	}

	public Rss getRssObject(final String key) {
		return this.rssCache.get(key);
	}

	public String getRssXml(final String key) throws JAXBException {

		final Rss object = this.rssCache.get(key);
		if (object != null) {
			return object.toXML();
		}

		return null;
	}

	public boolean contains(final String key) {
		return this.rssCache.keySet().contains(key);
	}
}
