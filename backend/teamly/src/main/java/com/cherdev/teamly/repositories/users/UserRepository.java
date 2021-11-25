package com.cherdev.teamly.repositories.users;

import com.cherdev.teamly.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByName(String name);
}
