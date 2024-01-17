package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private UserService userService;
    private NotificationService notificationService;
    private DataProcessingService dataProcessingService;

    @Autowired
    public RegistrationService(UserService userService, NotificationService notificationService, DataProcessingService dataProcessingService) {
        this.userService = userService;
        this.notificationService = notificationService;
        this.dataProcessingService = dataProcessingService;
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void processRegistration(String name,int age,String email){
        User user= userService.createUser(name,age,email);
        dataProcessingService.addUserToList(user);
     }
}
