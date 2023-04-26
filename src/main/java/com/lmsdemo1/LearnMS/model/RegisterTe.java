package com.lmsdemo1.LearnMS.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterTe {
    @NotBlank(message="First Name Must not be blank")
    @Size(min = 3, message = "First name must be at least 3 chars long")
    private String fnameT;

    @NotBlank(message = "Last Name Must not be blank")
    @Size(min = 3, message = " Last name must be at least 3 chars long" )
    private String lnameT;

    @NotBlank(message = " Teacher ID Must not be blank")
    @Size(min =6, message=" ID must be at least 6 digits long ")
    private String idT;

    @NotBlank(message = "Email ID Must not be blank")
    @Email(message = "please provide a valid email address")
    private String emailT;

    @NotBlank(message = "Mobile number must not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobT;

    private String rpT;

    @NotBlank(message = "Please select the gender")
    private String genderT;
}
