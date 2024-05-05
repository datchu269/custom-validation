package com.example.customvalidation.entity.entity;

import lombok.Data;

import java.util.Date;

@Data

public class Header {
	public com.example.customvalidation.entity.entity.SenderIdentifier SenderIdentifier;
	public com.example.customvalidation.entity.entity.ReceiverIdentifier ReceiverIdentifier;
	public String TransactionIdentifier;
	public Date Timestamp;
	public com.example.customvalidation.entity.entity.Version Version;
}
