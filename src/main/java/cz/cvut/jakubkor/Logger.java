package cz.cvut.jakubkor;

import cz.cvut.jakubkor.service.LoggerService;

public class Logger {

    private LoggerService service;

    public LoggerService getService() {
        return service;
    }

    public void setService(LoggerService service) {
        this.service = service;
    }

    Logger(LoggerService loggerService){
        this.setService(loggerService);
    }

    public void log(String msg, Level level){

        service.log(msg,level);
    }
}
