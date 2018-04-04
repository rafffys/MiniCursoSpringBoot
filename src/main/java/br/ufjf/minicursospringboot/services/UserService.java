package br.ufjf.minicursospringboot.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufjf.minicursospringboot.model.map.User;
import br.ufjf.minicursospringboot.model.repository.UserRepository;

@RestController
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/user")
	public User save(@RequestBody @Valid User user) {
		return userRepository.save(user);
	}
	
}
