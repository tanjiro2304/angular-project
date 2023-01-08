package com.vn.angulardemoproject.controller;

import com.vn.angulardemoproject.links.UserLink;
import com.vn.angulardemoproject.models.Users;
import com.vn.angulardemoproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = UserLink.LIST_USERS)
    public ResponseEntity<?> listUsers(){
        List<Users> resource = userService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = UserLink.ADD_USER)
    public ResponseEntity<Users> saveUser(@RequestBody Users user){
        log.info("UserController: list users");
        Users resource = userService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
