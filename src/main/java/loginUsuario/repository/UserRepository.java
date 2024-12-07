package loginUsuario.repository;

import loginUsuario.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);

    boolean existByName(String name);

    @Override
    Optional<User> findById(Long id);
}
