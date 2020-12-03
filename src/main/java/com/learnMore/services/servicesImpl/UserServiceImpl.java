package com.learnMore.services.servicesImpl;

import com.learnMore.dto.SignUpDTO;
import com.learnMore.entity.User;
import com.learnMore.repository.UserRepository;
import com.learnMore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void signUp(SignUpDTO dto) {
        User user = new User();
        user.setUserHandle(dto.getHandle());
        user.setUserFname(dto.getFname());
        user.setUserLname(dto.getLname());
        user.setUserEmail(dto.getEmail());
        userRepository.save(user);
    }
}
