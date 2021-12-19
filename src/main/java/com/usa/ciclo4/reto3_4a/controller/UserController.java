package com.usa.ciclo4.reto3_4a.controller;

import com.usa.ciclo4.reto3_4a.model.User;
import com.usa.ciclo4.reto3_4a.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return  userService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public  void save(@RequestBody User user){
        userService.save(user);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public  User update(@RequestBody User user){
        return  userService.update(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  boolean delete(@PathVariable("id")int id){
        return userService.delete(id);
    }

    @GetMapping("/{email}/{password}")
    public  User authenticateUser(@PathVariable("email")String email,@PathVariable("password")String password){
        return  userService.authenticateUser(email,password);
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }
    @GetMapping("/emailexist/{email}")
    public  boolean emailExists(@PathVariable("email")String email){
        return  userService.emailExists(email);
    }
    @GetMapping("/birthtday/{month}")
    public List<User> getByMonthBirthtDay(@PathVariable("month") String month){
        return userService.getByMonthBirthtDay(month);
    }
}
