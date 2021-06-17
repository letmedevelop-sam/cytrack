package com.cydeo.repository;

import com.cydeo.entity.Lesson;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> findAllByInstructorSet(User user);

}
