package it.nextre.aut.service;

import it.nextre.aut.dto.GroupDTO;

import java.util.List;
import java.util.Optional;

public interface GroupService {

    void create(GroupDTO group);

    void update(GroupDTO group);

    void delete(GroupDTO group);

    Optional<GroupDTO> findById(Long id);

    List<GroupDTO> getAllGroups();
}
