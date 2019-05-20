package com.controller;

import com.pojo.Paper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.controller
 * @date 2019/5/20 10:25
 * @Copyright © 华据
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/allUser")
    public String list(Model model) {
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        return "user/allUser";
    }

    @RequestMapping("toAddUser")
    public String toAddPaper() {
        return "user/addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/user/allUser";
    }
    @RequestMapping("/del/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "redirect:/user/allUser";
    }

    @RequestMapping("toUpdateUser")
    public String toUpdatePaper(Model model, Long id) {
        model.addAttribute("user", userService.queryById(id));
        return "user/updateUser";
    }

    @RequestMapping("/updateUser")
    public String updatePaper(Model model, User user) {
        userService.updateUser(user);
        user = userService.queryById(user.getId());
        model.addAttribute("user", user);
        return "redirect:/user/allUser";
    }
}
