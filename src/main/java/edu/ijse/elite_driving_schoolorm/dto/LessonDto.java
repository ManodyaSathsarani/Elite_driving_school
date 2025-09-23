package edu.ijse.elite_driving_schoolorm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class LessonDto {
    private String lessonId;
    private  String studentId;
    private String courseId;
    private  String instructorId;
    private  String lessonDate;
    private  String startTime;
    private String endTime;
    private String status;


}
