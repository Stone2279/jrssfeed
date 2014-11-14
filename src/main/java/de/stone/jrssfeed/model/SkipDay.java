package de.stone.jrssfeed.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SkipDay")
@XmlEnum
public enum SkipDay {

	@XmlEnumValue("Monday")
	MONDAY("Monday"), @XmlEnumValue("Tuesday")
	TUESDAY("Tuesday"), @XmlEnumValue("Wednesday")
	WEDNESDAY("Wednesday"), @XmlEnumValue("Thursday")
	THURSDAY("Thursday"), @XmlEnumValue("Friday")
	FRIDAY("Friday"), @XmlEnumValue("Saturday")
	SATURDAY("Saturday"), @XmlEnumValue("Sunday")
	SUNDAY("Sunday");
	private final String value;

	SkipDay(final String v) {
		this.value = v;
	}

	public String value() {
		return this.value;
	}

	public static SkipDay fromValue(final String v) {
		for (final SkipDay c : SkipDay.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
