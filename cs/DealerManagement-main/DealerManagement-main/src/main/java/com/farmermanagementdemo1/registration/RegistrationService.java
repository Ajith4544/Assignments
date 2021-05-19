package com.farmermanagementdemo1.registration;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farmermanagementdemo1.appuser.AppUser;
import com.farmermanagementdemo1.appuser.AppUserRole;
import com.farmermanagementdemo1.appuser.AppUserService;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegistrationService {
   @Autowired
	private  AppUserService appUserService;

    public String register(RegistrationRequest request) {
        return appUserService.signUpUser(
                new AppUser(
                        request.getName(),
                        request.getContactNumber(),
                        request.getEmail(),
                        request.getPassword(),
                        request.getAddress(),
                        AppUserRole.DEALER
                )
        );
    }

}
