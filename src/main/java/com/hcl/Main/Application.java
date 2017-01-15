package com.hcl.Main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hcl.mongodb.repository.User;
import com.hcl.mongodb.repository.UserRepository;
import com.hcl.mongodb.repository.UserRole;

@SpringBootApplication(scanBasePackages={"com.hcl"})
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        
        
    }
    
 /* @Bean
	public CommandLineRunner demo(UserRepository userRepository) {
		return (args) -> {
			// save a couple of customers
			User user=new User();
			user.setEmail("ss@gsrihari");
			user.setEnabled(1);
			user.setPassword("mypassword");
			user.setUserId((long) 1);
			user.setUserName("srihari");
			List<UserRole> list=new ArrayList<UserRole>();
			UserRole role=new UserRole();
			role.setRole("admin");
			role.setUserid((long) 1);
			role.setUserroleid((long) 1);
			list.add(role);
			user.setUserRoles(list);
			userRepository.save(user);	
			
			///
			User user1=new User();
			user1.setEmail("ss@gsrihari");
			user1.setEnabled(1);
			user1.setPassword("password123");
			user1.setUserId((long) 2);
			user1.setUserName("gshp");
			List<UserRole> list1=new ArrayList<UserRole>();
			UserRole role1=new UserRole();
			role1.setRole("admin");
			role1.setUserid((long) 2);
			role1.setUserroleid((long) 1);
			list1.add(role1);
			user1.setUserRoles(list1);
			userRepository.save(user1);	
			
			
		};
	}
*/
}
