package com.cydeo.entity;

import com.cydeo.enums.Country;
import com.cydeo.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
@Where(clause = "is_deleted=false")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
    private String phone;
    private boolean enabled;
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Enumerated(EnumType.STRING)
    private Role role;


    @ManyToOne
    @JoinColumn(name = "role_id")
    private com.cydeo.entity.Role role;

    @ManyToOne
    private  Group group;

    @ManyToMany(mappedBy = "studentSet")
    private Set<Lesson> lessonSet = new HashSet<>();

}
