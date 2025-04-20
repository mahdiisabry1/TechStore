package com.store.techstore_backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestDataObject {
    @Id
    private String Id;
    @Column
    private String userName;

    public TestDataObject(String id, String userName) {
        this.Id = id;
        this.userName = userName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
