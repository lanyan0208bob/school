package com.jy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jy.pojo.UserLogin;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/users")
public class UserController {
	/*
     *  http://localhost:8080/swagger/index.html
     */
 
    @ApiOperation(value="Get all users",notes="requires noting")
    @RequestMapping(method=RequestMethod.GET)
    public List<UserLogin> getUsers(){
        List<UserLogin> list=new ArrayList<UserLogin>();
 
        UserLogin user=new UserLogin();
        user.setAccount("asds");
        list.add(user);
 
        UserLogin user2=new UserLogin();
        user.setAccount("world");
        list.add(user2);
        return list;
    }
 
    @ApiOperation(value="Get user with id",notes="requires the id of user")
    @RequestMapping(value="/{name}",method=RequestMethod.GET)
    public UserLogin getUserById(@PathVariable String name){
    	UserLogin user=new UserLogin	();
        user.setAccount("hello world");
        return user;
    }
}
