package ua.yakubovskiy.mvc.repository;

import org.springframework.stereotype.Repository;
import ua.yakubovskiy.mvc.entity.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>(Arrays.asList(
            new User("Mike", "Mike_Jones", "f21aa"),
            new User("John", "John_Brown", "22vbs"),
            new User("Chuck", "Chuck_Norris", "awesome11")
    )
    );

    public boolean checkUser(User verifiedUser){
        return users.stream()
                .anyMatch(user -> user.getUserName().equals(verifiedUser.getUserName())
                        && user.getPassword().equals(verifiedUser.getPassword()));
    }

    public List<User> showAll(){
        return users;
    }
}
