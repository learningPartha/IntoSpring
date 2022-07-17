package com.learnjpa.firstjpa;

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
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log =
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... arg0) throws Exception{
		User user = new User("Jack","Admin");
		long retUserId = userDaoService.insertUserRecord(user);
		log.info("new user is created "+retUserId);
	}
	
}
