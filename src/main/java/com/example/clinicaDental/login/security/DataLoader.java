package com.example.clinicaDental.login.security;

import com.example.clinicaDental.login.AppUser;
import com.example.clinicaDental.login.AppUserRole;
import com.example.clinicaDental.login.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode("admin");
        BCryptPasswordEncoder passwordEncoder2 = new BCryptPasswordEncoder();
        String hashedPassword2 = passwordEncoder2.encode("user");

        userRepository.save(new AppUser("Admin","admin","admin@clinica.com", hashedPassword, AppUserRole.ADMIN));
        userRepository.save(new AppUser("User","user","user@clinica.com",  hashedPassword2, AppUserRole.USER));

    }
}