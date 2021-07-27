package com.example.samu.repository;

import com.example.samu.model.Parm;
import com.example.samu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParmRepos extends JpaRepository<Parm,Long> {
    Optional<User> findAdminByLogin(String login);
}
