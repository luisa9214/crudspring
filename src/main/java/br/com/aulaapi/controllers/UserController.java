package br.com.aulaapi.controllers;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> searchUser(){return userService.searchUser();}

    @PostMapping
    public User add(@RequestBody User user){
        userService.add(user);
        return user;

    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable Long userId){
        userService.delete(userId);
    }

    @GetMapping("/{id}")
    public Optional<User> findUser(@PathVariable Long id){
        return userService.find(id);

    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id,@RequestBody User user){
        userService.update(id);
        return user;
    }
}
