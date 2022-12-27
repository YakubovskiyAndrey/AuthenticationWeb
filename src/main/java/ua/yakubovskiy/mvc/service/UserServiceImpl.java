package ua.yakubovskiy.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.yakubovskiy.mvc.entity.User;
import ua.yakubovskiy.mvc.repository.UserRepository;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean checkUser(User user){
        return userRepository.checkUser(user);
    }

    @Override
    public List<User> showAll(){
        return userRepository.showAll();
    }
}
