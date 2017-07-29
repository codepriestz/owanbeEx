package com.codepriest.Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
@Table(name = "centre_type", schema = "dbo", catalog = "OwanbeDB")
public class CentreType {
    private int id;
    private String name;
    private String token;
    private Collection<EventCentre> eventCentresById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        CentreType that = (CentreType) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return token != null ? token.equals(that.token) : that.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "centreTypeByCentreType")
    public Collection<EventCentre> getEventCentresById() {
        return eventCentresById;
    }

    public void setEventCentresById(Collection<EventCentre> eventCentresById) {
        this.eventCentresById = eventCentresById;
    }
}
