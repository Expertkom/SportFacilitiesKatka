package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.FacilityDto;
import Expertkom.SportFacilities.dto.UserDto;
import Expertkom.SportFacilities.model.Facility;
import Expertkom.SportFacilities.model.UserRole;
import Expertkom.SportFacilities.repository.FacilityRepository;
import Expertkom.SportFacilities.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import static java.util.stream.Collectors.toList;

@Service
@Slf4j
public class FacilityService {
    private final FacilityRepository facilityRepository;
    private final UserService userService;
    private final FacilityMapper facilityMapper;

    @Autowired
    public FacilityService(FacilityRepository facilityRepository, UserService userService, FacilityMapper facilityMapper) {
        this.facilityRepository = facilityRepository;
        this.userService = userService;
        this.facilityMapper = facilityMapper;
    }

    public List<FacilityDto> getAll() {
        log.info("#FA&fa01: getAll called");
        return facilityRepository.findAll().stream().map(facilityMapper::toDto).toList();
    }
    public Facility registerFacilities(UserDto userDto) {
        log.info("#FA&fa01: registerFacility  called");
    }

}
