package ua.yakubovskiy.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.yakubovskiy.mvc.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean checkUser(String login, String password){
        return userRepository.checkUser(login, password);
    }
}
