package com.cydeo.implementation;

import com.cydeo.dto.LessonDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.mapper.MapperUtil;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.LessonService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    MapperUtil mapperUtil;
    LessonService lessonService;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil, LessonService lessonService) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
        this.lessonService = lessonService;
    }

    @Override
    public List<UserDTO> listAllUserByRole(String role) {
        List<User> userList = userRepository.findAllByRoleDescriptionIgnoreCase(role);
        return userList.stream().map(obj -> mapperUtil.convert(obj, new UserDTO())).collect(Collectors.toList());
    }

    @Override
    public Map<UserDTO, String> getInstructorsAndLessonsMap() {
        Map<UserDTO, String> instructorsLessonsMap = new HashMap<>(); //Get each instructor from DTO and add his lessons as String
        List<UserDTO> instructors = listAllUserByRole("Instructor"); //get all instructor in a list

        for(UserDTO instructor : instructors){
            List<LessonDTO> lessonsDTO = lessonService.listAllLessonsOfInstructor(instructor.getEmail());
            String lessons =lessonsDTO.stream().map(obj -> obj.getName()).reduce("", (x,y) -> x + y +" / ");
            lessons = lessons.substring(0, lessons.length()-2);

            instructorsLessonsMap.put(instructor, lessons);
        }

        return instructorsLessonsMap;
    }
}
