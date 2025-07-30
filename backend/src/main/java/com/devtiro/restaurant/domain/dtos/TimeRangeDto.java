package com.devtiro.restaurant.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ParameterScriptAssert;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeRangeDto {

    @NotBlank(message = "Open time is required")
    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$", message = "Open time must be in HH:mm format")
    private String openTime;

    @NotBlank(message = "Close time is required")
    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$", message = "Open time must be in HH:mm format")
    private String closeTime;
}
