package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum CloudProtocol {

	@XmlEnumValue("xml-rpc")
	XML_RPC("xml-rpc"), @XmlEnumValue("http-post")
	HTTP_POST("http-post"), @XmlEnumValue("soap")
	SOAP("soap");
	private final String value;

	CloudProtocol(final String v) {
		this.value = v;
	}

	public String value() {
		return this.value;
	}

	public static CloudProtocol fromValue(final String v) {
		for (final CloudProtocol c : CloudProtocol.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
