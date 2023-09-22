package com.example.codeleader.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Access {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long userId;
    private long codeId;
    private Timestamp accessedAt;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCodeId() {
        return codeId;
    }
    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }

    public Timestamp getAccessedAt() {
        return accessedAt;
    }
    public void setAccessedAt(Timestamp accessedAt){
        this.accessedAt = accessedAt;
    }

}
