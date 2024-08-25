package Expertkom.SportFacilities.repository;

import Expertkom.SportFacilities.model.Facilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesRepository extends JpaRepository <Facilities, Integer> {
}
