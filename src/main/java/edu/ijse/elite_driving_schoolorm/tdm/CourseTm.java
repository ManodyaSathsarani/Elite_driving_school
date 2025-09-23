package edu.ijse.elite_driving_schoolorm.tdm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class CourseTm {
    private String courseId;
    private  String course_name;
    private String duration;
    private double fee;
    private String description;
    private String instructorId;

}
