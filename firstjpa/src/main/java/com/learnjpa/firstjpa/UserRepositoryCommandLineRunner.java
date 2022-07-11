package com.learnjpa.firstjpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.learnjpa.entities.User;
import com.learnjpa.service.UserDAOService;
import com.learnjpa.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log =
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception{
		User user = new User("Jill","Admin");
		userRepository.save(user);
		log.info("new user is created "+user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("user Retrieved "+userWithIdOne);
		
		List<User> userList = userRepository.findAll();
		log.info("All users"+userList);
	}
	
}
