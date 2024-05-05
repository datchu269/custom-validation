package com.example.customvalidation.entity.entity;

import com.example.customvalidation.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.custom.ValidateType;
import lombok.Data;

@Data

public class HI1Message {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public com.example.customvalidation.entity.entity.Header Header;
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public com.example.customvalidation.entity.entity.Payload Payload;
	public String xmlns;
	public String xsi;
	public String common;
	public String task;
	public String auth;
	public String text;
}
