package com.example.ahmed150236.newsapp1;

/**
 * Created by ahmed150236 on 22-Feb-18.
 */

public class News {

    private String title;
    private String mInformation;
    private String date;
    private String mUrl;
    private String mِAuthorName;

    public News(String mTitle, String mInformation, String mِAuthorName, String mTime, String mUrl) {
        this.title = mTitle;
        this.mInformation = mInformation;
        this.date = mTime;
        this.mUrl = mUrl;
        this.mِAuthorName = mِAuthorName;
    }

    public String getTitle() {
        return title;
    }

    public String getmInformation() {
        return mInformation;
    }

    public String getDate() {
        return date;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getAuthorName() {
        return mِAuthorName;
    }

}
