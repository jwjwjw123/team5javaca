package sg.iss.team5.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import sg.iss.team5.model.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User u = (User) target;
		ValidationUtils.rejectIfEmpty(errors, "userID", "error.user.userID.empty");
		ValidationUtils.rejectIfEmpty(errors, "accessLevel", "error.user.accessLevel.empty");
		ValidationUtils.rejectIfEmpty(errors, "emailAddress", "error.user.emailAddress.empty");
		ValidationUtils.rejectIfEmpty(errors, "firstName", "error.user.firstName.empty");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "error.user.lastName.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.user.password.empty");
		System.out.println(u.toString());
	}

}
