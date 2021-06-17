package com.cydeo.implementation;

import com.cydeo.dto.GroupDTO;
import com.cydeo.dto.LessonDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.mapper.MapperUtil;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.GroupService;
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
    GroupService groupService;

    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil, LessonService lessonService, GroupService groupService) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
        this.lessonService = lessonService;
        this.groupService = groupService;
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

    @Override
    public Map<UserDTO, String> getCybertekMentorsAndGroupsMap() {

        Map<UserDTO, String> cybertekMentorGroupsMap = new HashMap<>();
        List<UserDTO> cybertekMentors = listAllUserByRole("CybertekMentor");

        for (UserDTO mentor : cybertekMentors){
            List<GroupDTO> groupDTOS = groupService.listAllGroupsOfCybertekMentor(mentor.getEmail());

            String groups = groupDTOS.stream().map(obj -> (obj.getBatch().getName() + " " + obj.getName())).reduce("",(x,y)-> x + y + " / ");
            groups = groups.substring(0, groups.length()-2);

            cybertekMentorGroupsMap.put(mentor, groups);
        }

        return cybertekMentorGroupsMap;
    }
}
