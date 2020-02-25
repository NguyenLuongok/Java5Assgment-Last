package AssJava5.Service;


import AssJava5.Model.Users;

import java.util.List;

public interface UserService {
    List<Users> findAll();
    Users finById(Long id);
    void save(Users users);
    void remove(Long id);
    boolean isUsers(String username, String password);

}
