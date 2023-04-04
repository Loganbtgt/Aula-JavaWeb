package com.devsuperior;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
    


}
