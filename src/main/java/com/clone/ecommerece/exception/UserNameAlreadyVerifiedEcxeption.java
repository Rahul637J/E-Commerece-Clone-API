package com.clone.ecommerece.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class UserNameAlreadyVerifiedEcxeption extends RuntimeException {
	private String message;
}
