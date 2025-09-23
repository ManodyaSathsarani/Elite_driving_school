package edu.ijse.elite_driving_schoolorm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CourseDto {
    private String courseId;
    private String Course_name;
    private String duration;
    private double fee;
    private String description;
    private String instructorId;
    @Builder.Default
    private ArrayList<LessonDto> lesson = new ArrayList<>();
}
