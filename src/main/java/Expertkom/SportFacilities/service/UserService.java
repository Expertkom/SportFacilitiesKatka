package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.UserDto;
import Expertkom.SportFacilities.dto.UserRegisterDto;
import Expertkom.SportFacilities.model.User;
import Expertkom.SportFacilities.model.UserRole;
import Expertkom.SportFacilities.repository.UserRepository;
import Expertkom.SportFacilities.repository.UserRolesRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final UserRoleService userRoleService;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserRoleService userRoleRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userRoleService = userRoleRepository;
        this.userMapper = userMapper;
    }

    public List<UserDto> getAll() {
        /*List<UserDto> list = new ArrayList<>();
        for (User user : userRepository.findAll()){
            UserDto dto = userMapper.toDto(user);
            list.add(dto);
        }
        return list;*/
        log.info("#US&ga01: getAll called");
        //tento zapis je rychlejci nez ten nad tim, derlato to same a je to modernejsi
        return userRepository.findAll().stream().map(userMapper::toDto).toList();
    }

    public User registrUser(UserRegisterDto userRegisterDto) {
        log.info("#US&ru01: registerUser called, userRegisterDto={}", userRegisterDto);
        User user = new User();


        user.setPasswordHash(userRegisterDto.getPassword());
        user.setEmail(userRegisterDto.getEmail());
        user.setUsername(userRegisterDto.getUsername());

        UserRole ur = userRoleService.getById(userRegisterDto.getRoleId());
        user.setRoleId(ur);
        user.setCreatedAt(new Date());


        log.info("#US&ru02: user created, user={}", user);
        return userRepository.save(user);

        }

    }
