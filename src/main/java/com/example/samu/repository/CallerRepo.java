package com.example.samu.repository;

import com.example.samu.model.Caller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallerRepo extends JpaRepository<Caller,Long> {
}
