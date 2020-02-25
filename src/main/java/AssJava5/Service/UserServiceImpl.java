package AssJava5.Service;


import AssJava5.Model.Users;
import AssJava5.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users finById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(Users users) {
        userRepository.save(users);
    }

    @Override
    public void remove(Long id) {
        userRepository.remove(id);
    }

    @Override
    public boolean isUsers(String username, String password) {
        Users user = userRepository.findByUsername(username);
        if (user != null && user.getMatKhau().equals(password)) {
            return true;
        }
        return false;
    }
}
