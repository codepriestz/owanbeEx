package com.codepriest.Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
@Table(name = "booking_status", schema = "dbo", catalog = "OwanbeDB")
public class BookingStatus {
    private int id;
    private String name;
    private String color;
    private String token;
    private Collection<EventCentreBookings> eventCentreBookingsById;

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
    @Column(name = "color", nullable = false, length = 50)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

        BookingStatus that = (BookingStatus) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        return token != null ? token.equals(that.token) : that.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "bookingStatusByBookingStatusId")
    public Collection<EventCentreBookings> getEventCentreBookingsById() {
        return eventCentreBookingsById;
    }

    public void setEventCentreBookingsById(Collection<EventCentreBookings> eventCentreBookingsById) {
        this.eventCentreBookingsById = eventCentreBookingsById;
    }
}
