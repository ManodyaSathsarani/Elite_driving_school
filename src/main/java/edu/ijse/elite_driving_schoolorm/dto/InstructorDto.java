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

public class InstructorDto {
    private String instructorIs;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String specialization;
    private String availability;
    @Builder.Default
    private ArrayList<LessonDto> lessons = new ArrayList<>();
    @Builder.Default
    private ArrayList<CourseDto> courses = new ArrayList<>();
}
