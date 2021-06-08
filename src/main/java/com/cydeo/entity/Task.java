package com.cydeo.entity;

import com.cydeo.enums.StudentStatus;
import com.cydeo.enums.TaskStatus;
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
    private String taskLessonType;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

}
