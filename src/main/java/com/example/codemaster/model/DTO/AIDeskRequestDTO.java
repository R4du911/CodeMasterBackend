package com.example.codemaster.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AIDeskRequestDTO {
    private float occupancy_rate;
    private int first_part_of_week;
    private int second_part_of_week;
    private int first_part_of_month;
    private int second_part_of_month;

}
