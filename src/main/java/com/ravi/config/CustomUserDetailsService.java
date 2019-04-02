package com.ravi.config;

import com.ravi.dao.UserDao;
import com.ravi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optional = userDao.findByEmail(email);
        optional.orElseThrow(()-> new UsernameNotFoundException("Invalid credentials"));
        return optional
                .map(CustomUserDetails::new).get();
    }
}
