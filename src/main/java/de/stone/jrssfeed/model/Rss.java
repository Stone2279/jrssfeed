package de.stone.jrssfeed.model;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name = "rss")
public class Rss {

	@XmlElement(required = true)
	private Channel channel;

	@XmlAttribute(name = "version", required = true)
	private String version = "2.0";

	public Channel getChannel() {
		return this.channel;
	}

	public void setChannel(final Channel value) {
		this.channel = value;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(final String value) {
		this.version = value;
	}

	public String toXML() throws JAXBException {
		final StringWriter writer = new StringWriter();
		this.toXML(writer);

		return writer.toString();
	}

	public void toXML(final Writer writer) throws JAXBException {
		final JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);
		final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.marshal(this, writer);
	}

	public static Rss toObject(final String rssXml) throws JAXBException {
		return (Rss) JAXBContext.newInstance(Rss.class).createUnmarshaller()
				.unmarshal(new StringReader(rssXml));
	}
}
