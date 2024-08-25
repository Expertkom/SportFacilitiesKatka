package Expertkom.SportFacilities.controller;


import Expertkom.SportFacilities.model.Users;
import Expertkom.SportFacilities.dto.UsersDto;
import Expertkom.SportFacilities.dto.UserRegisterDto;
import Expertkom.SportFacilities.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    private final UsersService userService;

    @Autowired
    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    //Dto specialni objekty pro posilani dat- budou davat takzvane nalepky
    @PostMapping()
    public Users registerUser(@RequestBody UserRegisterDto userRegisterDto){
        log.info("UC&ru01: registerUser called");
        return userService.registrUser(userRegisterDto);
    }

    @GetMapping()
    public List<UsersDto> getAllUser() {
        log.info("UC&ru01: getAllUser called");
        return userService.getAll();

    }


}
