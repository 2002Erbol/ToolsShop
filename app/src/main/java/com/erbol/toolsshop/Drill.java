package com.erbol.toolsshop;

public class Drill {
    private String title;
    private String info;
    private int imageResourceId;

    public Drill(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

//    @Override
//    public String toString() {
//        return "Drill{" +
//                "title='" + title + '\'' +
//                ", info='" + info + '\'' +
//                ", imageResourceId=" + imageResourceId +
//                '}';
//    }
    @Override
    public String toString(){
        return title;
    }
}
