package ma.projet.them.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.projet.them.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}