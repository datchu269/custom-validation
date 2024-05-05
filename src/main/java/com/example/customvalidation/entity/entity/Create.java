package com.example.customvalidation.entity.entity;

import com.example.customvalidation.entity.custom.Hi1Validate;
import com.example.customvalidation.entity.custom.ValidateType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Create {
	@Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
	public HI1Object hi1Object;
}
