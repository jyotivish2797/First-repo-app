package in.jtc;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.jtc.entity.User;
import in.jtc.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		UserRepository repository = run.getBean(UserRepository.class);

		User u1 = new User(101, "Jyoti", "Female", 27, "India");
		User u2 = new User(102, "Mannara", "Female", 35, "India");
		User u3 = new User(103, "Munavar", "male", 38, "Afgan");
		User u4 = new User(104, "Satendra", "male", 32, "India");
		User u5 = new User(105, "Samantha", "Female", 31, "Usa");
		User u6 = new User(106, "Smith", "male", 24, "Usa");

		repository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
		/*
		 * List<User> country = repository.findByUserCountry("India");
		 * 
		 * country.forEach(user->{System.out.println(user);});
		 * 
		 * 
		 * List<User> name = repository.findByUserName("Satendra");
		 * 
		 * name.forEach(user->{System.out.println(user);});
		 */
		
		  //sorting in jpa 
		List<User> name =
		  repository.findAll(Sort.by("userName").descending());
		  name.forEach(user->{System.out.println(user);});
		  
		  List<User> age = repository.findAll(Sort.by("userAge").descending());
		  age.forEach(userage->{System.out.println(userage);});
		  
		  List<User> males = repository.findAll(Sort.by("").descending());
		 
		  males.forEach(male->{System.out.println(male);});
		/* 
		 * Pagination PageRequest pageRequest = PageRequest.of(1, 2); Page<User>
		 * pageData = repository.findAll(pageRequest);
		 * 
		 * int totalPages=pageData.getTotalPages();
		 * System.out.println("Total pages are:: "+totalPages);
		 * 
		 * int pageSize=pageData.getSize(); System.out.println("PageSize : "+pageSize);
		 * 
		 * 
		 * List<User>users=pageData.getContent();
		 * users.forEach(user->{System.out.println(user);});
		 * 
		 */
		// QBE
		/*
		 * User entity=new User(); //entity.setuId(102); entity.setUserAge(25);
		 * Example<User> example = Example.of(entity);
		 * List<User>users=repository.findAll(example);
		 * users.forEach(user->{System.out.println(user);});
		 */
	}

}
