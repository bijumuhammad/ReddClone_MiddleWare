package com.example.ReddClone_Middleware.repo;

import com.example.ReddClone_Middleware.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User,Long> {
}
