package main.java.javabootcampgraduationproject.business;

import main.java.javabootcampgraduationproject.core.logging.Logger;
import main.java.javabootcampgraduationproject.entities.Users;

import java.util.List;

public class UsersManager {
    private List<Logger> loggers;

    public UsersManager(List<Logger> loggers) {
        this.loggers = loggers;

    }

    public void add (Users user){
        for (Logger logger: loggers) {
            logger.log(user.getUserName());
        }
    }



}

