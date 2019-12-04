package de.jonashackt.springbootvuejs.repository;


import de.jonashackt.springbootvuejs.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    //TODO Data access ORM functions :

}
