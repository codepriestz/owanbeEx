package com.codepriest.Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
@Table(name = "use_type", schema = "dbo", catalog = "OwanbeDB")
public class UseType {
    private int id;
    private String name;
    private String description;
    private String token;
    private Collection<User> usersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "token", nullable = false, length = 30)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UseType useType = (UseType) o;

        if (id != useType.id) return false;
        if (name != null ? !name.equals(useType.name) : useType.name != null) return false;
        if (description != null ? !description.equals(useType.description) : useType.description != null) return false;
        return token != null ? token.equals(useType.token) : useType.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "useTypeByUserType")
    public Collection<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(Collection<User> usersById) {
        this.usersById = usersById;
    }
}
