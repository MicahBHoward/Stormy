package com.micahbhoward.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentWeather {

    private String locationLabel;
    private String icon;
    private long time;
    private double temperature;
    private double humidity;
    private double precipChance;
    private String summary;


    public CurrentWeather() {
    }

    public CurrentWeather(String locationLabel, String icon, long time, double temperature, double humidity,
                          double precipChance, String summary, String timeZone) {
        this.locationLabel = locationLabel;
        this.icon = icon;
        this.time = time;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipChance = precipChance;
        this.summary = summary;
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    private String timeZone;

    public String getLocationLabel() {
        return locationLabel;
    }

    public void setLocationLabel(String locationLabel) {
        this.locationLabel = locationLabel;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getIconId() {
        int iconID = R.drawable.clear_day;

        switch(icon) {
            case "clear-day":
                iconID = R.drawable.clear_day;
                break;
            case "clear-night":
                iconID = R.drawable.clear_day;
                break;
            case "rain":
                iconID = R.drawable.rain;
                break;
            case "snow":
                iconID = R.drawable.snow;
                break;
            case "sleet":
                iconID = R.drawable.sleet;
                break;
            case "wind":
                iconID = R.drawable.wind;
                break;
            case "fog":
                iconID = R.drawable.fog;
                break;
            case "cloudy":
                iconID = R.drawable.cloudy;
                break;
            case "partly-cloudy-day":
                iconID = R.drawable.partly_cloudy;
                break;
            case "partly-cloudy-night":
                iconID = R.drawable.cloudy_night;
                break;
        }
        return iconID;
    }

    public long getTime() {
        return time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");

        formatter.setTimeZone(TimeZone.getTimeZone(timeZone));

        Date dateTime = new Date(time * 1000);

        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipChance() {
        return precipChance;
    }

    public void setPrecipChance(double precipChance) {
        this.precipChance = precipChance;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
