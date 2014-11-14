package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Cloud {

	@XmlAttribute(name = "domain", required = true)
	private String domain;

	@XmlAttribute(name = "port", required = true)
	private int port;

	@XmlAttribute(name = "path", required = true)
	private String path;

	@XmlAttribute(name = "registerProcedure", required = true)
	private String registerProcedure;

	@XmlAttribute(name = "protocol", required = true)
	private CloudProtocol protocol;

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(final String value) {
		this.domain = value;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(final int value) {
		this.port = value;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(final String value) {
		this.path = value;
	}

	public String getRegisterProcedure() {
		return this.registerProcedure;
	}

	public void setRegisterProcedure(final String value) {
		this.registerProcedure = value;
	}

	public CloudProtocol getProtocol() {
		return this.protocol;
	}

	public void setProtocol(final CloudProtocol value) {
		this.protocol = value;
	}

}
