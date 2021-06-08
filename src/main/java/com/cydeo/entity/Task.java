package com.cydeo.entity;

import com.cydeo.enums.Status;
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
@Table(name = "users")
@Where(clause = "is_deleted=false")
public class Task extends BaseEntity{

    private String taskName;
    private LocalDate taskAssignDate;
    private LocalDate taskDueDate;
    private String lessonType;

    @Enumerated(EnumType.STRING)
    private Status taskStatus;

}
