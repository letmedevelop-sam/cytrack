package com.cydeo.dto;

import com.cydeo.entity.Batch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LessonDTO {

    private Long id;
    private String name;

    private Batch batch;
}
