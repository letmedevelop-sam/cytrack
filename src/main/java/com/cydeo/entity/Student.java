package com.cydeo.entity;

import com.cydeo.enums.Country;
import com.cydeo.enums.Gender;
import com.cydeo.enums.StudentStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "students")
@Where(clause = "is_deleted=false")
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Boolean enabled;
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private Country country;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean studentWorkingStatus;

    @Enumerated(EnumType.STRING)
    private StudentStatus studentStatus;

    //group
}
