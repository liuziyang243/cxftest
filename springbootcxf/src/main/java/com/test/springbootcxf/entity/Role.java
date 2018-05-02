package com.test.springbootcxf.entity;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-17 上午10:16
 */
public class Role {
    private long id;
    private String name;
    private String note;

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
