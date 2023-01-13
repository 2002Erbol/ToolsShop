package com.erbol.toolsshop;

public class Perforator {
private String title;
private String info;
private int ResId;

    public Perforator(String title, String info, int resId) {
        this.title = title;
        this.info = info;
        ResId = resId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getResId() {
        return ResId;
    }
    @Override
    public String toString(){
        return title;
    }

}
