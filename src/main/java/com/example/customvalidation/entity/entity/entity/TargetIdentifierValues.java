package com.example.customvalidation.entity.entity.entity;

import com.example.customvalidation.entity.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.entity.custom.ValidateType;
import lombok.Data;

@Data

public class TargetIdentifierValues {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public TargetIdentifierValue targetIdentifierValue;
}