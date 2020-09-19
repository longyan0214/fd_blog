package store.longyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import store.longyan.domain.User;
import store.longyan.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public List<User> findAll(){
        return userService.findAll();
    }
}
