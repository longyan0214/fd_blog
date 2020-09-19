package store.longyan.dao;

import org.springframework.stereotype.Repository;
import store.longyan.domain.User;

@Repository
public interface UserDao {

    User findAll();
}
