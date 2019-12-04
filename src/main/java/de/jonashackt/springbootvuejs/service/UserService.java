package de.jonashackt.springbootvuejs.service;

import de.jonashackt.springbootvuejs.domain.User;
import de.jonashackt.springbootvuejs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    //TODO Service business logic functions :
}
