package br.ufjf.minicursospringboot.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/users")
	public List<User> findAll(){
		return userRepository.findAll();
	}	
	
	@GetMapping("/getByEmail")
	public User getByEmail(@RequestBody User user) throws Exception {
		User u = userRepository.findByEmail(user.getEmail()); 
		if (u==null) {
			throw new Exception("Usuário não encontrado!"); 
		}
		return u;
	}	
	
	
	
}
