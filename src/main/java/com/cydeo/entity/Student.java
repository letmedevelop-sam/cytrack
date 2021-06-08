package com.cydeo.entity;

import com.cydeo.enums.StudentStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
@Where(clause = "is_deleted=false")
public class Student extends BaseEntity {

    //private User user;

    private Boolean studentWorkingStatus;

    @Enumerated(EnumType.STRING)
    private StudentStatus studentStatus;
}
