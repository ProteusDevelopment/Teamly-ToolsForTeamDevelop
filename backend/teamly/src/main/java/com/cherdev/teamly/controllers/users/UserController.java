package com.cherdev.teamly.controllers.users;

import com.cherdev.teamly.entities.users.User;
import com.cherdev.teamly.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EntityManager entityManager;

    @GetMapping
    public List<User> list()
    {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User user(@PathVariable long id)
    {
        return userRepository.findById(id).orElse(null);
    }

    @GetMapping(value = "/login")
    public ResponseEntity<String> login(@RequestParam String name,
                                        @RequestParam String password)
    {
        User user = userRepository.findByName(name);

        if (user != null)
        {
            if (!password.equals(user.getPassword()))
            {
                return new ResponseEntity<>("Invalid password", HttpStatus.BAD_REQUEST);
            }
        }
        else
        {
            return new ResponseEntity<>("User doesn't exists", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PostMapping(value = "/register", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public ResponseEntity<String> register(User user)
    {
        User findedUser = userRepository.findByName(user.getName());

        if (findedUser != null)
        {
            return new ResponseEntity<>("User already contains", HttpStatus.BAD_REQUEST);
        }
        else
        {
            userRepository.saveAndFlush(user);
        }

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
