package bluecode.tech.interview.services;

import bluecode.tech.interview.dtos.UserDTO;
import bluecode.tech.interview.exceptions.UserNotFoundException;
import bluecode.tech.interview.models.User;
import bluecode.tech.interview.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Long createUser(User user) {
        User newUser = userRepository.save(user);
        return newUser.getId();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User updateUser(Long id, UserDTO userDTO) {
        User user = getUser(id);
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

    public void deleteUser(Long id) {
        userRepository.delete(getUser(id));
    }

}
