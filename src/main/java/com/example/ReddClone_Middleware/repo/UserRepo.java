package com.example.ReddClone_Middleware.repo;

import com.example.ReddClone_Middleware.appuser.AppUser;
import com.example.ReddClone_Middleware.model.User;
//import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.Optional;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findByEmail(String email);
    @Transactional
    @Modifying
    @Query("UPDATE AppUser a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")
    int enableAppUser(String email);
}

