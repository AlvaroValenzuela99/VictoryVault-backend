package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.UserDTO;
import org.springframework.stereotype.Service;

public interface UserService {
    String addUser(UserDTO userDTO);
}
