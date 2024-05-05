package com.example.customvalidation.entity.entity.entity.entity;

import com.example.customvalidation.entity.entity.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.entity.entity.custom.ValidateType;
import lombok.Data;

@Data

public class TargetIdentifier {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public TargetIdentifierValues targetIdentifierValues;
}
