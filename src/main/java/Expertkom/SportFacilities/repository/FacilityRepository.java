package Expertkom.SportFacilities.repository;

import Expertkom.SportFacilities.model.Facility;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer> {
}