package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "groups")
@Where(clause = "is_deleted=false")
public class Group extends BaseEntity{

    private String groupName;
    private String groupMascot;

    //batch

    //mentor

    //student
}
