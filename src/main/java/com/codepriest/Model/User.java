package com.codepriest.Model;

import com.codepriest.utilities.OutputExclude;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
public class User {
    @OutputExclude
    private int id;
    private String email;
    @OutputExclude
    private String password;
    @OutputExclude
    private String tempPassword;
    @OutputExclude
    private String approvalCode;
    private String address;
    private String phoneNumbers;
    private Timestamp dateJoined;
    private String state;
    private String city;
    private boolean isActive;
    private int userType;
    @OutputExclude
    private String token;
    private Collection<EventCentre> eventCentresById;
    private Collection<EventCentreBookings> eventCentreBookingsById;
    private UseType useTypeByUserType;
    private Collection<Message> messagesById;
    private Collection<Message> messagesById_0;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "temp_password", nullable = true, length = 10)
    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    @Basic
    @Column(name = "approval_code", nullable = true, length = 6)
    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 2147483647)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone_numbers", nullable = false, length = 100)
    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Basic
    @Column(name = "date_joined", nullable = false)
    public Timestamp getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Timestamp dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Basic
    @Column(name = "state", nullable = false, length = 50)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    @Column(name = "user_type", nullable = false)
    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
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

        User user = (User) o;

        if (id != user.id) return false;
        if (isActive != user.isActive) return false;
        if (userType != user.userType) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (tempPassword != null ? !tempPassword.equals(user.tempPassword) : user.tempPassword != null) return false;
        if (approvalCode != null ? !approvalCode.equals(user.approvalCode) : user.approvalCode != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (phoneNumbers != null ? !phoneNumbers.equals(user.phoneNumbers) : user.phoneNumbers != null) return false;
        if (dateJoined != null ? !dateJoined.equals(user.dateJoined) : user.dateJoined != null) return false;
        if (state != null ? !state.equals(user.state) : user.state != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        return token != null ? token.equals(user.token) : user.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (tempPassword != null ? tempPassword.hashCode() : 0);
        result = 31 * result + (approvalCode != null ? approvalCode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumbers != null ? phoneNumbers.hashCode() : 0);
        result = 31 * result + (dateJoined != null ? dateJoined.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + userType;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByManagedById")
    public Collection<EventCentre> getEventCentresById() {
        return eventCentresById;
    }

    public void setEventCentresById(Collection<EventCentre> eventCentresById) {
        this.eventCentresById = eventCentresById;
    }

    @OneToMany(mappedBy = "userByBookerId")
    public Collection<EventCentreBookings> getEventCentreBookingsById() {
        return eventCentreBookingsById;
    }

    public void setEventCentreBookingsById(Collection<EventCentreBookings> eventCentreBookingsById) {
        this.eventCentreBookingsById = eventCentreBookingsById;
    }

    @ManyToOne
    @JoinColumn(name = "user_type", referencedColumnName = "id", nullable = false)
    public UseType getUseTypeByUserType() {
        return useTypeByUserType;
    }

    public void setUseTypeByUserType(UseType useTypeByUserType) {
        this.useTypeByUserType = useTypeByUserType;
    }

    @OneToMany(mappedBy = "userByFromUserId")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }

    @OneToMany(mappedBy = "userByToUserId")
    public Collection<Message> getMessagesById_0() {
        return messagesById_0;
    }

    public void setMessagesById_0(Collection<Message> messagesById_0) {
        this.messagesById_0 = messagesById_0;
    }
}
