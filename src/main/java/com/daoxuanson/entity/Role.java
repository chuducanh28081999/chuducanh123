package com.daoxuanson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role extends Base {
    @Column
    private String name;
    @Column
    private String description;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

//    public Role(long id,String name, String description) {
//        super(id);
//        this.name = name;
//        this.description = description;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
