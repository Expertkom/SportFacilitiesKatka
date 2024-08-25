package Expertkom.SportFacilities.controller;

import Expertkom.SportFacilities.dto.FacilitiesDto;
import Expertkom.SportFacilities.dto.UsersDto;
import Expertkom.SportFacilities.service.FacilitiesService;
import Expertkom.SportFacilities.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/facilities")
public class FacilitiesController {

    private final FacilitiesService facilitiesService;

    @Autowired
    public FacilitiesController(FacilitiesService facilitiesService) {
        this.facilitiesService = facilitiesService;
    }

    @GetMapping()
    public List<FacilitiesDto> getAllFacilities() {
        log.info("UC&ru01: getAllFacilities called");
        return facilitiesService.getAll();

    }

}
