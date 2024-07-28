package com.gl.demoproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostiory extends JpaRepository<User,Integer> {
}
