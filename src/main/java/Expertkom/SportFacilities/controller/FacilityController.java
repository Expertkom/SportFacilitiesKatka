package Expertkom.SportFacilities.controller;

import Expertkom.SportFacilities.dto.FacilityDto;
import Expertkom.SportFacilities.dto.UserDto;
import Expertkom.SportFacilities.model.Facility;
import Expertkom.SportFacilities.service.FacilityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/facilities")
public class FacilityController {

    private final FacilityService facilityService;

    @Autowired
    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }



    @PostMapping()
    public Facility registerFacilities(@RequestBody FacilityDto facilityDto) {
        log.info("FC&rf01: registerFacilities() called, FacilityDto: {}", facilityDto);
    }


    public Facility facility (){
        return facilityService;
    }


    @GetMapping()
    public List<FacilityDto> getAllFacilities() {
        log.info("FA&fa01: getAllFacilities called");
        return facilityService.getAll();
    }





}

