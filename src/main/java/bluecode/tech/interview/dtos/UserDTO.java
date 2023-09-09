package bluecode.tech.interview.dtos;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is malformed")
    private String email;

    @NotNull(message = "Age is required")
    @Positive(message = "Age must be a positive number")
    private Integer age;

}
