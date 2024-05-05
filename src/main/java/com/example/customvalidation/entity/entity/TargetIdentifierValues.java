package com.example.customvalidation.entity.entity;

import com.example.customvalidation.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.custom.ValidateType;
import lombok.Data;

@Data

public class TargetIdentifierValues {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public TargetIdentifierValue targetIdentifierValue;
}
