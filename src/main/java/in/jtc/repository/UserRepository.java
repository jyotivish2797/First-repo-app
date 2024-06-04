package in.jtc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jtc.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
public List<User>findByUserCountry(String cname);
public List<User>findByUserName(String name);



}
