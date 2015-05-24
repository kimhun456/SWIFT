package net.amicom.swift;

import java.util.ArrayList;

/**
 * Created by amicom on 2015. 5. 23..
 */
public class Container {

    private int MAXSIZE = 300 * (1024 * 1024); // 300mbyte

    private String name;
    private int size;
    private ArrayList<Obj> objectList;
    private int currentSize;

    public Container() {
        //currentSize= getCurrentSize(objectList);
    }

    public Container(String name, int size, ArrayList<Obj> objectList) {
        this.setName(name);
        this.setObjectList(objectList);
        this.setSize(size);
        this.setCurrentSize(getCurrentSize(objectList));
    }


    private int getCurrentSize(ArrayList<Obj> objectList) {
        int result = 0;
        for (Obj obj : objectList) {
            result += obj.getBytes();
        }
        return result;
    }


    public int getMAXSIZE() {
        return MAXSIZE;
    }

    public void setMAXSIZE(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Obj> getObjectList() {
        return objectList;
    }

    public void setObjectList(ArrayList<Obj> objectList) {
        this.objectList = objectList;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
