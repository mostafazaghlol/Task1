package com.mostafazaghloul.task1.model;

public class order {

    int imageid;
    String mainMessage,time,peopletype,helptype,helpnumber;
    boolean isnew;
    public order(int imageid,String mainMessage,
                 String time,String peopletype,
                 String helptype,String helpnumber,
                 boolean isnew){
        this.imageid = imageid;
        this.mainMessage = mainMessage;
        this.time = time;
        this.peopletype = peopletype;
        this.helptype = helptype;
        this.helpnumber = helpnumber;
        this.isnew = isnew;
    }

    public int getImageid() {
        return imageid;
    }

    public String getHelpnumber() {
        return helpnumber;
    }

    public String getHelptype() {
        return helptype;
    }

    public String getMainMessage() {
        return mainMessage;
    }

    public String getPeopletype() {
        return peopletype;
    }

    public String getTime() {
        return time;
    }

    public boolean isIsnew() {
        return isnew;
    }
}

