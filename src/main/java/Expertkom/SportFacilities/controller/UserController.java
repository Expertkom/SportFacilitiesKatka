package Expertkom.SportFacilities.controller;


import Expertkom.SportFacilities.model.User;
import Expertkom.SportFacilities.dto.UserDto;
import Expertkom.SportFacilities.dto.UserRegisterDto;
import Expertkom.SportFacilities.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
//request mapping bude pro webovky, možná
@RequestMapping("/api/v1/users")

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @PostMapping()

    //Dto specialni objekty pro posilani dat- budou davat takzvane nalepky
    public User registerUser(@RequestBody UserRegisterDto userRegisterDto){

        log.info("UC&ru01: registerUser called");

        return userService.registrUser(userRegisterDto);
    }

    @GetMapping()
    public List<UserDto> getAllUser(){
        log.info("UC&ru01: getAllUser called");
        return userService.getAll();

    }


}
