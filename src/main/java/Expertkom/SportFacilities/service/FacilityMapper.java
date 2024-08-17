package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.FacilityDto;
import Expertkom.SportFacilities.model.Facility;
import org.springframework.stereotype.Component;

@Component
public class FacilityMapper {
    public FacilityDto toDto(Facility facility) {
        FacilityDto facilityDto = new FacilityDto();
        facilityDto.setFacilityId(facility.getFacilityId());

        return facilityDto;
    }

    public Facility toEntity(FacilityDto facilityDto) {
        Facility facility = new Facility();

        return facility;
    }
}
