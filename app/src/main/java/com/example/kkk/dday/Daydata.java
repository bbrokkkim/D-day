package com.example.kkk.dday;

/**
 * Created by KKK on 2018-03-24.
 */

public class Daydata {

    String title;
    String date;
    String type;
    String cover;
    String cover_uri;
    boolean fix;
    boolean hundred;
    boolean year;


    public Daydata(String title, String date, String type, String cover, String cover_uri, boolean fix, boolean hundred, boolean year){
        this.title = title;
        this.date = date;
        this.type = type;
        this.cover = cover;
        this.cover_uri = cover_uri;
        this.fix = fix;
        this.hundred = hundred;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCover_uri() {
        return cover_uri;
    }

    public void setCover_uri(String cover_uri) {
        this.cover_uri = cover_uri;
    }

    public boolean isFix() {
        return fix;
    }

    public void setFix(boolean fix) {
        this.fix = fix;
    }

    public boolean isHundred() {
        return hundred;
    }

    public void setHundred(boolean hundred) {
        this.hundred = hundred;
    }

    public boolean isYear() {
        return year;
    }

    public void setYear(boolean year) {
        this.year = year;
    }
}
