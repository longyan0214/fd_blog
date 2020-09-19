package store.longyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.longyan.dao.UserDao;
import store.longyan.domain.User;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public List<User> findAll(){
        return userDao.findAll();
    }
}
