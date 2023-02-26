package com.eventtest.dto;

import com.eventtest.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventDto {
    @NotBlank
    private String title;
    @NotNull
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private String date;
    @NotBlank
    @Length(min = 20, message = "Please insert minimum 20 characters")
    private String description;
    @NotBlank
    private User createdBy;


}