package it.nextre.aut.service;

import it.nextre.aut.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserAdminService extends UserService {
    void createUser(UserDTO userDTO);

    List<UserDTO> getAllUsers();

    Optional<UserDTO> findById(Long id);
}
