package bluecode.tech.interview.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {

    private String name;
    private String email;
    private Integer age;

}
