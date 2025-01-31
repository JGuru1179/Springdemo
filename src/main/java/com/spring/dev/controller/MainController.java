package com.spring.dev.controller;

import com.spring.dev.entity.User;
import com.spring.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class MainController {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public  String addNewUser(@RequestParam(name = "name") String name
            , @RequestParam(name = "email") String email, @RequestParam(name = "age") String age) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        n.setAge(Integer.parseInt(age));
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public  Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path= "/userbyid/{id}")
    public  User getUserById(@PathVariable(name = "id") int id) {

        System.out.println("start");
        User user = userRepository.findById(id).get();
        return user;
    }
    /*
    @GetMapping(path = "/userbyemail/{email}")
 public @ResponseBody User getUserByEmail(@PathVariable(name = "email") String email) {
        User user = userRepository.findByEmail(email);
        return user;
 } */

    @GetMapping(path= "/deletebyid/{id}")
    public  void deleteById(@PathVariable(name = "id") int id) {

        System.out.println("start");
        userRepository.deleteById(id);
    }
}


