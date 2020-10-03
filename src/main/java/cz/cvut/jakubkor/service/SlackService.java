package cz.cvut.jakubkor.service;

import cz.cvut.jakubkor.Level;

public class SlackService implements LoggerService {

    public void log(String msg, Level level) {
        System.out.println("SLACK "+ level+ msg);
    }
}
