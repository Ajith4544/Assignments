package com.farmermanagementdemo1.registration;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmermanagementdemo1.appuser.AppUser;
import com.farmermanagementdemo1.appuser.AppUserRole;
import com.farmermanagementdemo1.appuser.AppUserService;

@Service
@AllArgsConstructor
public class UpdateService {
   @Autowired
	private  AppUserService appUserService;

    public String update(RegistrationRequest request,String email){
        return appUserService.updateUser(
                new AppUser(
                        request.getName(),
                        request.getContactNumber(),
                        request.getEmail(),
                        request.getPassword(),
                        request.getAddress(),
                        AppUserRole.FARMER
                ),
                email
        );
    }
}
