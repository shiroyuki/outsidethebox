package com.shiroyuki.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Based on https://blog.philipphauer.de/uuids-hibernate-mysql/
@Entity
public class Task {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long guid;

    private String summary;

    public long getGuid() {
        return this.guid;
    }

    public String getSummary() {
        return this.summary;
    }

    public String setSummary() {
        return this.summary;
    }
}
