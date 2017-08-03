package com.jnshu.pojo;

/**
 * Created by PC on 2017/7/31.
 */
public class Student {
    private long id;
    private String update_at;
    private String create_at;
    private String name;
    private String qq;
    private String jobs;
    private String join_time;
    private String school;
    private String online_id;
    private String data_url;
    private String declaration;
    private String teacher;
    private String sources;

    public Student(long id, String update_at, String create_at, String name, String qq, String jobs, String join_time, String school, String online_id, String data_url, String declaration, String teacher, String sources) {
        this.id = id;
        this.update_at = update_at;
        this.create_at = create_at;
        this.name = name;
        this.qq = qq;
        this.jobs = jobs;
        this.join_time = join_time;
        this.school = school;
        this.online_id = online_id;
        this.data_url = data_url;
        this.declaration = declaration;
        this.teacher = teacher;
        this.sources = sources;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getJoin_time() {
        return join_time;
    }

    public void setJoin_time(String join_time) {
        this.join_time = join_time;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getOnline_id() {
        return online_id;
    }

    public void setOnline_id(String online_id) {
        this.online_id = online_id;
    }

    public String getData_url() {
        return data_url;
    }

    public void setData_url(String data_url) {
        this.data_url = data_url;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public Student() {
        super( );
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", update_at='" + update_at + '\'' +
                ", create_at='" + create_at + '\'' +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", jobs='" + jobs + '\'' +
                ", join_time='" + join_time + '\'' +
                ", school='" + school + '\'' +
                ", online_id='" + online_id + '\'' +
                ", data_url='" + data_url + '\'' +
                ", declaration='" + declaration + '\'' +
                ", teacher='" + teacher + '\'' +
                ", sources='" + sources + '\'' +
                '}';
    }
}
