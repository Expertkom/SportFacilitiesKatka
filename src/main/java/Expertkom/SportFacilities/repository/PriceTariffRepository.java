package Expertkom.SportFacilities.repository;


import Expertkom.SportFacilities.model.PriceTariff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceTariffRepository extends JpaRepository<PriceTariff, Integer> {

}
