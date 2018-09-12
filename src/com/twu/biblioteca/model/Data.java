package com.twu.biblioteca.model;

public class Data {

    private Long id;
    private String name;
    private String producerName;
    private String year;
    private boolean isCheckOut;

    public Data(Long id, String name, String producerName, String year) {
        this.id = id;
        this.name = name;
        this.producerName = producerName;
        this.year = year;
        this.isCheckOut = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

}
