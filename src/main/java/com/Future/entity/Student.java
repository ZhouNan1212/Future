package com.Future.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * 学生实体
 */
@Entity
@Table(name = "student")
public class Student implements Serializable{

    private static final long serialVersionUID = 2120869894112984147L;

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "score_sum")
    private String sumScore;

    @Column(name = "score_avg")
    private String avgScore;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
