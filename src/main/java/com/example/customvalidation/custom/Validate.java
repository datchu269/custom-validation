package com.example.customvalidation.custom;

import com.example.customvalidation.entity.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

@Component
public class Validate {
    public static final String CREATE_NAME  = "ActionCreate";
    public static Boolean validateCreate(Class<?> clazz, Object object, String nameSpace) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                String nameSpaceNew = nameSpace + "." + field.getName();

                System.err.println("name space -----> " + nameSpaceNew);

                Object fieldValue = field.get(object);

                if (fieldValue != null) {
                    Annotation[] fieldAnnotations = field.getDeclaredAnnotations();
                    for (Annotation annotation : fieldAnnotations) {
                        if (annotation.annotationType().equals(Hi1Validate.class)) {
                            Hi1Validate hi1Validate = (Hi1Validate) annotation;

                            if (hi1Validate.value().name().equals(ValidateType.OBJECT_DATA_TYPE.name())) {
                                // recursive
                                validateCreate(fieldValue.getClass(), fieldValue, nameSpaceNew);
                            }
                        }

                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    // create data test
    public static Create create() {
        Create create = new Create();
        HI1Object hi1Object = new HI1Object();
        AuthorisationTimespan authorisationTimespan = new AuthorisationTimespan();

        TargetIdentifier targetIdentifier = new TargetIdentifier();
        TargetIdentifierValues targetIdentifierValues = new TargetIdentifierValues();
        TargetIdentifierValue targetIdentifierValue = new TargetIdentifierValue();
        FormatType formatType = new FormatType();
        targetIdentifierValue.setFormatType(formatType);
        targetIdentifierValues.setTargetIdentifierValue(targetIdentifierValue);
        targetIdentifier.setTargetIdentifierValues(targetIdentifierValues);

        DeliveryType deliveryType = new DeliveryType();

        hi1Object.setDeliveryType(deliveryType);
        hi1Object.setTargetIdentifier(targetIdentifier);
        hi1Object.setAuthorisationTimespan(authorisationTimespan);
        create.setHI1Object(hi1Object);

        return create;
    }

    public static void main(String[] args) {
        Create create = create();

        validateCreate(create.getClass(), create, CREATE_NAME);

        System.out.println(create);
    }
}