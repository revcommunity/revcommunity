package org.revcommunity.model;

import org.codehaus.jackson.annotate.JsonValue;

public enum CategoryFilterType {

	STRING("string"), INTEGER("integer"), DATE("date"), LIST("list"), FLOAT("float");

	private String value;

	CategoryFilterType(String val) {
		this.setValue(val);
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
