package it.nextre.aut.service;

import it.nextre.aut.dto.LoginInfo;
import it.nextre.aut.dto.UserDTO;

public interface UserService {

    String login(LoginInfo loginInfo);

    String register(UserDTO userDTO);

    void update(UserDTO userDTO);

    void delete(UserDTO userDTO);
}
