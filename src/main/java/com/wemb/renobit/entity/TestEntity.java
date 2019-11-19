package com.wemb.renobit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class TestEntity {

    @Id
    private @Column(name = "uid") Long uid;

    private @Column(name = "title") String title;

    public TestEntity(Long uid, String title) {
        this.uid = uid;
        this.title = title;
    }
}