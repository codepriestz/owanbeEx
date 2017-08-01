package com.codepriest.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by App Celestine on 8/1/2017.
 */
@Entity
@Table(name = "event_centre_status", schema = "dbo", catalog = "OwanbeDB")
public class EventCentreStatus {
    private int id;
    private String token;
    private String name;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private boolean isActive;
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
    @Column(name = "token", nullable = false, length = 30)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "created_time", nullable = false)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "updated_time", nullable = true)
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventCentreStatus that = (EventCentreStatus) o;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        return updatedTime != null ? updatedTime.equals(that.updatedTime) : that.updatedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "eventCentreStatusByEventCentreStatusId")
    public Collection<EventCentre> getEventCentresById() {
        return eventCentresById;
    }

    public void setEventCentresById(Collection<EventCentre> eventCentresById) {
        this.eventCentresById = eventCentresById;
    }
}
