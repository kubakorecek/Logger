package cz.cvut.jakubkor;

public enum Level {
    DEBUG("DEBUG"),
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR");

    private final String name;

    private Level(String name){
        this.name = name;

    }

    public String toStrin(){
        return "[" + this.name + "]:";
    }
}
