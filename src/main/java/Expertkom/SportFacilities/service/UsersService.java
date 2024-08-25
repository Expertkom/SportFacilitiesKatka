package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.UsersDto;
import Expertkom.SportFacilities.dto.UserRegisterDto;
import Expertkom.SportFacilities.model.Users;
import Expertkom.SportFacilities.model.UserRoles;
import Expertkom.SportFacilities.repository.UsersRepository;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class UsersService {
    private final UsersRepository userRepository;
    private final UserRolesService userRoleService;
    private final UsersMapper userMapper;

    @Autowired
    public UsersService(UsersRepository userRepository, UserRolesService userRolesService, UsersMapper userMapper) {
        this.userRepository = userRepository;
        this.userRoleService = userRolesService;
        this.userMapper = userMapper;
    }

    public List<UsersDto> getAll() {
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

    public Users registrUser(UserRegisterDto userRegisterDto) {
        log.info("#US&ru01: registerUser called, userRegisterDto={}", userRegisterDto);
        Users user = new Users();


        user.setPasswordHash(userRegisterDto.getPassword());
        user.setUserEmail(userRegisterDto.getEmail());
        user.setUsername(userRegisterDto.getUsername());
        user.setUserPhone(userRegisterDto.getPhone());
        user.setUserStreet(userRegisterDto.getStreet());
        user.setUserCity(userRegisterDto.getCity());
        user.setUserZipCode(userRegisterDto.getZipCode());

        UserRoles ur = userRoleService.getById(userRegisterDto.getRoleId());
        user.setRoleId(ur);
        user.setUserCreatedAt(new Date());
        user.setUserUpdatedAt(new Date());


        log.info("#US&ru02: user created, user={}", user);
        return userRepository.save(user);

        }

    }
