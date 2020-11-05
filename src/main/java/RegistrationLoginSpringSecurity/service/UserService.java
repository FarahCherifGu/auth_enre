package RegistrationLoginSpringSecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import RegistrationLoginSpringSecurity.model.User;
import RegistrationLoginSpringSecurity.web.dto.UserRegistrationDto;
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
