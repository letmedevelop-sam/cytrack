package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserDTO> listAllUserByRole(String role);

    Map<UserDTO, String> getInstructorsAndLessonsMap(); //this map will bring assigned lessons for each instructor

    Map<UserDTO, String> getCybertekMentorsAndGroupsMap(); // this map will bring assigned groups for each Cybertek Mentor
}
