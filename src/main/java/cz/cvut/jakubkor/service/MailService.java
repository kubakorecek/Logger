package cz.cvut.jakubkor.service;

import cz.cvut.jakubkor.Level;

public class MailService implements LoggerService {

    public void log(String msg, Level level) {
        System.out.println("Email "+ level+ msg);
    }
}
