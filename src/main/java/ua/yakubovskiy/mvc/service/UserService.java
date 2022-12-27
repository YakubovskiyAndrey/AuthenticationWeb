package ua.yakubovskiy.mvc.service;

import ua.yakubovskiy.mvc.entity.User;
import java.util.List;

public interface UserService {

    boolean checkUser(User user);

    List<User> showAll();
}
