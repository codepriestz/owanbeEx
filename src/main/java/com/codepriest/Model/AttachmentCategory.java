package com.codepriest.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by App Celestine on 8/1/2017.
 */
@Entity
@Table(name = "attachment_category", schema = "dbo", catalog = "OwanbeDB")
public class AttachmentCategory {
    private int id;
    private String name;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private Collection<EventCentreAttachment> eventCentreAttachmentsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttachmentCategory that = (AttachmentCategory) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        return updatedTime != null ? updatedTime.equals(that.updatedTime) : that.updatedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "attachmentCategoryByAttachmentCategoryId")
    public Collection<EventCentreAttachment> getEventCentreAttachmentsById() {
        return eventCentreAttachmentsById;
    }

    public void setEventCentreAttachmentsById(Collection<EventCentreAttachment> eventCentreAttachmentsById) {
        this.eventCentreAttachmentsById = eventCentreAttachmentsById;
    }
}
