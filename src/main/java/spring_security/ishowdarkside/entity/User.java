package spring_security.ishowdarkside.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email")
    private String email;

    public User(){};

    public User(String firstName,String email){
        this.firstName = firstName;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
