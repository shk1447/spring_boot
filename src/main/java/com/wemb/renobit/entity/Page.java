package com.wemb.renobit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="page")
@Setter
@Getter
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    public Long uid;

    @Column(name = "page_id")
    public String page_id;

    @Column(name = "page_name")
    public String page_name;

    public Page() {}

    public Page(String page_id, String page_name) {
        this.page_id = page_id;
        this.page_name = page_name;
    }
}