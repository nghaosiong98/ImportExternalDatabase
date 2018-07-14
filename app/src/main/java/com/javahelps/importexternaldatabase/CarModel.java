package com.javahelps.importexternaldatabase;

public class CarModel {
    private String id;
    private String name;
    private String suffix;
    private String chassis;
    private String imgpath;
    private String spec;

    public CarModel(){
        this.id = "";
        this.name = "";
        this.suffix = "";
        this.chassis = "";
        this.imgpath = "";
        this.spec ="";
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getChassis() {
        return chassis;
    }

    public String getImgpath() {
        return imgpath;
    }

    public String getSpec() {
        return spec;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;

    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
