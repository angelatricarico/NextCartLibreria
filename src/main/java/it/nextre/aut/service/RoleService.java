package it.nextre.aut.service;

import it.nextre.aut.dto.RoleDTO;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    void create(RoleDTO roleDTO);

    void update(RoleDTO roleDTO);

    void delete(RoleDTO roleDTO);

    Optional<RoleDTO> findById(Long id);

    List<RoleDTO> getAllRoles();
}
