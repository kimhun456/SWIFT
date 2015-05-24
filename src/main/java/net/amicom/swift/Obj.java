package net.amicom.swift;

/**
 * Created by amicom on 2015. 5. 23..
 */
public class Obj {

    private String name;
    private int bytes;
    private String last_modified;

    public Obj() {

    }

    public Obj(String name, int bytes, String last_modified) {

        this.name = name;
        this.bytes = bytes;
        this.last_modified = last_modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

}
