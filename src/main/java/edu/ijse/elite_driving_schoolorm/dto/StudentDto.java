package edu.ijse.elite_driving_schoolorm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder


public class StudentDto {
    private String studentId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String registrationDate;
    private List<String> courseId;
    @Builder.Default
    private ArrayList<PaymentDto>payments = new ArrayList<>();

}
