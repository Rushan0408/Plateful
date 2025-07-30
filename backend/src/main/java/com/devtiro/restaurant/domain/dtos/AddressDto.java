package com.devtiro.restaurant.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
    @NotBlank(message = "Street address is required")
    @Pattern(regexp = "^[0-9]{1,5}", message = "Invalid street address format")
    private String streetNumber;

    @NotBlank(message = "City is required")
    private String streetName;

    private String unit;
    @NotBlank(message = "City is required")

    private String city;
    @NotBlank(message = "State is required")

    private String state;
    @NotBlank(message = "Postal code is required")

    private String postalCode;
    @NotBlank(message = "Country is required")
    private String country;
}

