package com.codepriest.Model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by App Celestine on 8/1/2017.
 */
@Entity
public class Message {
    private int id;
    private int messageTypeId;
    private Integer fromUserId;
    private Integer toUserId;
    private String content;
    private boolean readStatus;
    private Timestamp dateSent;
    private Timestamp dateReceived;
    private boolean isActive;
    private String link;
    private MessageType messageTypeByMessageTypeId;
    private User userByFromUserId;
    private User userByToUserId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message_type_id", nullable = false)
    public int getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(int messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    @Basic
    @Column(name = "from_user_id", nullable = true)
    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    @Basic
    @Column(name = "to_user_id", nullable = true)
    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    @Basic
    @Column(name = "content", nullable = false, length = 2147483647)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "read_status", nullable = false)
    public boolean isReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }

    @Basic
    @Column(name = "date_sent", nullable = false)
    public Timestamp getDateSent() {
        return dateSent;
    }

    public void setDateSent(Timestamp dateSent) {
        this.dateSent = dateSent;
    }

    @Basic
    @Column(name = "date_received", nullable = false)
    public Timestamp getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Timestamp dateReceived) {
        this.dateReceived = dateReceived;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "link", nullable = false, length = 500)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (id != message.id) return false;
        if (messageTypeId != message.messageTypeId) return false;
        if (readStatus != message.readStatus) return false;
        if (isActive != message.isActive) return false;
        if (fromUserId != null ? !fromUserId.equals(message.fromUserId) : message.fromUserId != null) return false;
        if (toUserId != null ? !toUserId.equals(message.toUserId) : message.toUserId != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (dateSent != null ? !dateSent.equals(message.dateSent) : message.dateSent != null) return false;
        if (dateReceived != null ? !dateReceived.equals(message.dateReceived) : message.dateReceived != null)
            return false;
        return link != null ? link.equals(message.link) : message.link == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + messageTypeId;
        result = 31 * result + (fromUserId != null ? fromUserId.hashCode() : 0);
        result = 31 * result + (toUserId != null ? toUserId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (readStatus ? 1 : 0);
        result = 31 * result + (dateSent != null ? dateSent.hashCode() : 0);
        result = 31 * result + (dateReceived != null ? dateReceived.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "message_type_id", referencedColumnName = "id", nullable = false)
    public MessageType getMessageTypeByMessageTypeId() {
        return messageTypeByMessageTypeId;
    }

    public void setMessageTypeByMessageTypeId(MessageType messageTypeByMessageTypeId) {
        this.messageTypeByMessageTypeId = messageTypeByMessageTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "from_user_id", referencedColumnName = "id")
    public User getUserByFromUserId() {
        return userByFromUserId;
    }

    public void setUserByFromUserId(User userByFromUserId) {
        this.userByFromUserId = userByFromUserId;
    }

    @ManyToOne
    @JoinColumn(name = "to_user_id", referencedColumnName = "id")
    public User getUserByToUserId() {
        return userByToUserId;
    }

    public void setUserByToUserId(User userByToUserId) {
        this.userByToUserId = userByToUserId;
    }
}
