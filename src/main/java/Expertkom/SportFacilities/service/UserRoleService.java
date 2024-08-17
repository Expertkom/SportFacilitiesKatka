package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.model.UserRole;
import Expertkom.SportFacilities.repository.UserRolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    private final UserRolesRepository userRoleRepository;

    public UserRoleService(UserRolesRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    public UserRole getById(Integer id) {
        return userRoleRepository.findById(id).orElse(null);
    }
}
