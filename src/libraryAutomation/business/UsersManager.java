package libraryAutomation.business;

import libraryAutomation.core.logging.Logger;
import libraryAutomation.entities.Users;

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
