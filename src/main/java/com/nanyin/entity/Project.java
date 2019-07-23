package com.nanyin.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "project")
public class Project implements Serializable {
    @Id
    @Column(columnDefinition = "INT(11)")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(length = 512)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Project parentId;

    @Column(length = 11)
    private Integer ord;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private ProjectStatus status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private ProjectType type;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "level_id")
    private ProjectLevel level;
    @Column(length = 512)
    private String code;

    @Temporal(value=TemporalType.TIMESTAMP)
    private Date planStart;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date planFinish;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date actualStart;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date actualFinish;

    @Column(name = "is_deleted",columnDefinition = "TINYINT(4)")
    private Boolean isDeleted;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date gmtCreate;
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date gmtModify;

    @ManyToMany()
    @JoinTable(name = "r_project_user",joinColumns =
            {@JoinColumn(name = "project_id")},
            inverseJoinColumns = @JoinColumn(name = "users_id"))
    private List<User> users;
}