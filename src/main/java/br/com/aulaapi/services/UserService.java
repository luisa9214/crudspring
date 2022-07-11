package br.com.aulaapi.services;

import br.com.aulaapi.entities.User;
import br.com.aulaapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> searchUser(){
        return userRepository.findAll();
    }

    public User add (User user){return userRepository.save(user); }

    public void delete  (Long id){userRepository.deleteById(id);}

    public User update (Long id){

        User userId = find(id);
//        userRepository.findById(id).map(user -> {
//                user.setAge(user.getAge());
//                user.setName(user.getName());
//                user.setPhones(user.getPhones());
//
//                return add(user);
//            }
//        );
    }

    public Optional<User> find(Long id){
        return userRepository.findById(id);
    }
}
