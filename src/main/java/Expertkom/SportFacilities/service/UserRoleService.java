package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.model.UserRole;
import Expertkom.SportFacilities.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {
    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    public UserRole getById(Integer id) {
        return userRoleRepository.findById(id).orElse(null);
    }
}
