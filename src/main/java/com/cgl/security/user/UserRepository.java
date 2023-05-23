package com.cgl.security.user;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}
