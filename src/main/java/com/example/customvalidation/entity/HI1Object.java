package com.example.customvalidation.entity;

import com.example.customvalidation.custom.Hi1Validate;
import com.example.customvalidation.custom.ValidateType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HI1Object {
    public String ObjectIdentifier = "test";
    public String CountryCode = "test";
    public String OwnerIdentifier = "test";
    public String AuthorisationReference = "test";
    @Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
    public AuthorisationTimespan AuthorisationTimespan;
    public String type = "test";
    public String text = "test";
    @Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
    public AssociatedObjects AssociatedObjects;
    public String Reference = "test";
    @Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
    public TargetIdentifier TargetIdentifier;
    @Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
    public DeliveryType DeliveryType;
    @Hi1Validate(ValidateType.OBJECT_DATA_TYPE)
    public DeliveryDetails DeliveryDetails;
    public CSPID CSPID;
}
