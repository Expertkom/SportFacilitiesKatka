package Expertkom.SportFacilities.service;

import Expertkom.SportFacilities.dto.UserDto;
import Expertkom.SportFacilities.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getUserEmail());
        userDto.setPassword(user.getPasswordHash());
        userDto.setUserId(user.getRoleId().getRoleId());

        return userDto;
    }

    public User toEntity(UserDto userDto) {
        User user = new User();
//        user.setEmail(userDto.getEmail());
        user.setPasswordHash(userDto.getPassword());
//        user.setUserRole());
        return user;
    }
}
