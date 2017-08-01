package com.codepriest.Model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by App Celestine on 8/1/2017.
 */
@Entity
@Table(name = "event_centre_attachment", schema = "dbo", catalog = "OwanbeDB")
public class EventCentreAttachment {
    private int id;
    private String url;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private int attachmentCategoryId;
    private AttachmentCategory attachmentCategoryByAttachmentCategoryId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 2147483647)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "attachment_category_id", nullable = false)
    public int getAttachmentCategoryId() {
        return attachmentCategoryId;
    }

    public void setAttachmentCategoryId(int attachmentCategoryId) {
        this.attachmentCategoryId = attachmentCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventCentreAttachment that = (EventCentreAttachment) o;

        if (id != that.id) return false;
        if (attachmentCategoryId != that.attachmentCategoryId) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        return updatedTime != null ? updatedTime.equals(that.updatedTime) : that.updatedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + attachmentCategoryId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "attachment_category_id", referencedColumnName = "id", nullable = false)
    public AttachmentCategory getAttachmentCategoryByAttachmentCategoryId() {
        return attachmentCategoryByAttachmentCategoryId;
    }

    public void setAttachmentCategoryByAttachmentCategoryId(AttachmentCategory attachmentCategoryByAttachmentCategoryId) {
        this.attachmentCategoryByAttachmentCategoryId = attachmentCategoryByAttachmentCategoryId;
    }
}
