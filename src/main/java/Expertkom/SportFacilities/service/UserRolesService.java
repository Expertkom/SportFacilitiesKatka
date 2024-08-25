package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.model.UserRoles;
import Expertkom.SportFacilities.repository.UserRolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolesService {
    private final UserRolesRepository userRoleRepository;

    public UserRolesService(UserRolesRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRoles> findAll() {
        return userRoleRepository.findAll();
    }

    public UserRoles getById(Integer id) {
        return userRoleRepository.findById(id).orElse(null);
    }
}
