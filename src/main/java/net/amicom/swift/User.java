package net.amicom.swift;

/**
 * Created by amicom on 2015. 5. 23..
 */
public class User {
    private String name;
    private String id;
    private String password;
    private Container container;

    User(String name, String id, String password, Container container) {
        this.setContainer(container);
        this.setId(id);
        this.setName(name);
        this.setContainer(container);
    }


    User(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}
