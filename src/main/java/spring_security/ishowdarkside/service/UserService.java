package spring_security.ishowdarkside.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_security.ishowdarkside.entity.User;
import spring_security.ishowdarkside.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(User user){
        return this.userRepository.createUser(user);
    }

}
