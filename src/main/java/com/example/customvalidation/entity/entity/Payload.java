package com.example.customvalidation.entity.entity;

import com.example.customvalidation.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.custom.ValidateType;
import lombok.Data;

@Data

public class Payload {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public com.example.customvalidation.entity.entity.RequestPayload RequestPayload;
}
