package Expertkom.SportFacilities.repository;

import Expertkom.SportFacilities.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRole, Integer> {
}
