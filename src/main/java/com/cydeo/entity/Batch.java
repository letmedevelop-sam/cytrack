package com.cydeo.entity;

import com.cydeo.enums.BatchStatus;
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
public class Batch extends BaseEntity{

    private String batchName;
    private LocalDate batchStartDate;
    private LocalDate batchEndDate;
    private String batchNotes;

    @Enumerated(EnumType.STRING)
    private BatchStatus batchStatus;

    //Instructor

    //Mentor

    //Student

}
