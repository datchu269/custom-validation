package com.example.customvalidation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AuthorisationTimespan {
	public LocalDateTime StartTime = LocalDateTime.now();
	public LocalDateTime EndTime = LocalDateTime.now();
}
