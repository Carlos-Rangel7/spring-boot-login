package loginUsuario.service;

import loginUsuario.model.User;
import loginUsuario.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public boolean existByName(String name) {
        return userRepository.existByName(name);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


}
