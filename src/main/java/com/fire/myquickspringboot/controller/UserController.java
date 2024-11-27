package com.fire.myquickspringboot.controller;

import com.fire.myquickspringboot.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

/**
 * RESTful API
 */
@RestController()
public class UserController {

    @Operation(summary = "获取用户")
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        System.out.println(id);
        return "根据ID获取用户信息";
    }

    @PostMapping("/user")
    public String save(User user) {
        return "更新用户";
    }

    @PutMapping("/user")
    public String update(User user) {
        return "更新用户";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id) {
        System.out.println(id);
        return "根据ID删除用户";
    }


}
