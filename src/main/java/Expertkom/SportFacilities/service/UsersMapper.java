package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.UsersDto;
import Expertkom.SportFacilities.model.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersMapper {
    public UsersDto toDto(Users user) {
        UsersDto userDto = new UsersDto();
        userDto.setEmail(user.getUserEmail());
        userDto.setPassword(user.getPasswordHash());
        userDto.setUserId(user.getRoleId().getRoleId());

        return userDto;
    }

    public Users toEntity(UsersDto userDto) {
        Users user = new Users();
//        user.setEmail(userDto.getEmail());
        user.setPasswordHash(userDto.getPassword());
//        user.setUserRole());
        return user;
    }
}
