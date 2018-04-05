package br.ufjf.minicursospringboot.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.minicursospringboot.model.map.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findById(Integer id);
	
	public List<User> findAll();
	
	@SuppressWarnings("unchecked")
	public User save(User user);
	
	public User findByEmail(String email);
	
}
