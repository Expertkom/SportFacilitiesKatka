package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.FacilitiesDto;
import Expertkom.SportFacilities.model.Facilities;
import org.springframework.stereotype.Component;

@Component
public class FacilitiesMapper {
    public FacilitiesDto toDto(Facilities facilities) {
        FacilitiesDto facilitiesDto = new FacilitiesDto();
        facilitiesDto.setFacilityID(facilities.getFacilityId());
        facilitiesDto.setStreet(facilities.getStreet());
        facilitiesDto.setCity(facilities.getCity());
        facilitiesDto.setZipCode(facilities.getZipCode());
        return facilitiesDto;
    }
}
