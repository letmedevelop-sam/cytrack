package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lessons")
@Where(clause = "is_deleted=false")
public class Lesson extends BaseEntity{

    private String name;

    @ManyToOne
    private Batch batch;

    @ManyToMany
    @JoinTable(name = "lesson_instructor_rel",
            joinColumns = {@JoinColumn(name = "lesson_id")},
            inverseJoinColumns = {@JoinColumn(name = "instructor_id")})
    private Set<User> instructorSet = new HashSet<>();

}
