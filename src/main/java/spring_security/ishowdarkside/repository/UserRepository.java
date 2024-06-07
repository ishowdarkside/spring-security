package spring_security.ishowdarkside.repository;


import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring_security.ishowdarkside.entity.User;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager entityManager;


    public UserRepository(){};


    public User createUser(User user ){
        this.entityManager.persist(user);
        return  user;
    }
}
