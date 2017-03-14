/**
 * 
 */
package com.springvalidator.app;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Mahendra
 *
 */
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors error) {
	
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "name", "NotEmpty.name", "Please enter your name");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "id", "NotNull.id", "id cannot be negative");
		
		User user = (User)obj;
		if(user.getId() <= 0){
			error.rejectValue("id", "negativeValue", new Object[] {"id"}, "id cannot be negative");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "subject", "NotEmpty.subject", "Student subject is required");
		
		
		
	}

}
