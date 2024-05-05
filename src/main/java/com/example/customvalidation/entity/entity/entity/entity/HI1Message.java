package com.example.customvalidation.entity.entity.entity.entity;

import com.example.customvalidation.entity.entity.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.entity.entity.custom.ValidateType;
import lombok.Data;

@Data

public class HI1Message {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public com.example.customvalidation.entity.entity.entity.entity.Header Header;
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public com.example.customvalidation.entity.entity.entity.entity.Payload Payload;
	public String xmlns;
	public String xsi;
	public String common;
	public String task;
	public String auth;
	public String text;
}
