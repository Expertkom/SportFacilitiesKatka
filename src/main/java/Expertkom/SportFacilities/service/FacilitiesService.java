package Expertkom.SportFacilities.service;


import Expertkom.SportFacilities.dto.FacilitiesDto;
import Expertkom.SportFacilities.repository.FacilitiesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FacilitiesService {
    private final FacilitiesRepository facilitiesRepository;
    private final UsersService usersService;
    private final FacilitiesMapper facilitiesMapper;

    @Autowired
    public FacilitiesService(FacilitiesRepository facilitiesRepository, UsersService usersService, FacilitiesMapper facilitiesMapper) {
        this.facilitiesRepository = facilitiesRepository;
        this.usersService = usersService;
        this.facilitiesMapper = facilitiesMapper;

    }
//tady jsem skoncila
    public List<FacilitiesDto> getAll() {
        log.info("#FS&ga01: getAll called");
        return facilitiesRepository.findAll().stream().map(facilitiesMapper::toDto).toList();
    }





}
