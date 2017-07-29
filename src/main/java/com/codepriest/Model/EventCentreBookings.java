package com.codepriest.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
@Table(name = "event_centre_bookings", schema = "dbo", catalog = "OwanbeDB")
public class EventCentreBookings {
    private int id;
    private int bookerId;
    private int eventCentreId;
    private String purpose;
    private Serializable period;
    private Timestamp dateBooked;
    private Timestamp lastUpdated;
    private int bookingStatusId;
    private Serializable optionalFeaturesBooked;
    private int basicPrice;
    private Serializable featuredPriceWithFeatures;
    private String token;
    private User userByBookerId;
    private EventCentre eventCentreByEventCentreId;
    private BookingStatus bookingStatusByBookingStatusId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "booker_id", nullable = false)
    public int getBookerId() {
        return bookerId;
    }

    public void setBookerId(int bookerId) {
        this.bookerId = bookerId;
    }

    @Basic
    @Column(name = "event_centre_id", nullable = false)
    public int getEventCentreId() {
        return eventCentreId;
    }

    public void setEventCentreId(int eventCentreId) {
        this.eventCentreId = eventCentreId;
    }

    @Basic
    @Column(name = "purpose", nullable = false, length = 50)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "period", nullable = false)
    public Serializable getPeriod() {
        return period;
    }

    public void setPeriod(Serializable period) {
        this.period = period;
    }

    @Basic
    @Column(name = "date_booked", nullable = false)
    public Timestamp getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(Timestamp dateBooked) {
        this.dateBooked = dateBooked;
    }

    @Basic
    @Column(name = "last_updated", nullable = false)
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Basic
    @Column(name = "booking_status_id", nullable = false)
    public int getBookingStatusId() {
        return bookingStatusId;
    }

    public void setBookingStatusId(int bookingStatusId) {
        this.bookingStatusId = bookingStatusId;
    }

    @Basic
    @Column(name = "optional_features_booked", nullable = false)
    public Serializable getOptionalFeaturesBooked() {
        return optionalFeaturesBooked;
    }

    public void setOptionalFeaturesBooked(Serializable optionalFeaturesBooked) {
        this.optionalFeaturesBooked = optionalFeaturesBooked;
    }

    @Basic
    @Column(name = "basic_price", nullable = false, precision = 0)
    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Basic
    @Column(name = "featured_price_with_features", nullable = true)
    public Serializable getFeaturedPriceWithFeatures() {
        return featuredPriceWithFeatures;
    }

    public void setFeaturedPriceWithFeatures(Serializable featuredPriceWithFeatures) {
        this.featuredPriceWithFeatures = featuredPriceWithFeatures;
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

        EventCentreBookings that = (EventCentreBookings) o;

        if (id != that.id) return false;
        if (bookerId != that.bookerId) return false;
        if (eventCentreId != that.eventCentreId) return false;
        if (bookingStatusId != that.bookingStatusId) return false;
        if (basicPrice != that.basicPrice) return false;
        if (purpose != null ? !purpose.equals(that.purpose) : that.purpose != null) return false;
        if (period != null ? !period.equals(that.period) : that.period != null) return false;
        if (dateBooked != null ? !dateBooked.equals(that.dateBooked) : that.dateBooked != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (optionalFeaturesBooked != null ? !optionalFeaturesBooked.equals(that.optionalFeaturesBooked) : that.optionalFeaturesBooked != null)
            return false;
        if (featuredPriceWithFeatures != null ? !featuredPriceWithFeatures.equals(that.featuredPriceWithFeatures) : that.featuredPriceWithFeatures != null)
            return false;
        return token != null ? token.equals(that.token) : that.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + bookerId;
        result = 31 * result + eventCentreId;
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        result = 31 * result + (period != null ? period.hashCode() : 0);
        result = 31 * result + (dateBooked != null ? dateBooked.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + bookingStatusId;
        result = 31 * result + (optionalFeaturesBooked != null ? optionalFeaturesBooked.hashCode() : 0);
        result = 31 * result + basicPrice;
        result = 31 * result + (featuredPriceWithFeatures != null ? featuredPriceWithFeatures.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "booker_id", referencedColumnName = "id", nullable = false)
    public User getUserByBookerId() {
        return userByBookerId;
    }

    public void setUserByBookerId(User userByBookerId) {
        this.userByBookerId = userByBookerId;
    }

    @ManyToOne
    @JoinColumn(name = "event_centre_id", referencedColumnName = "id", nullable = false)
    public EventCentre getEventCentreByEventCentreId() {
        return eventCentreByEventCentreId;
    }

    public void setEventCentreByEventCentreId(EventCentre eventCentreByEventCentreId) {
        this.eventCentreByEventCentreId = eventCentreByEventCentreId;
    }

    @ManyToOne
    @JoinColumn(name = "booking_status_id", referencedColumnName = "id", nullable = false)
    public BookingStatus getBookingStatusByBookingStatusId() {
        return bookingStatusByBookingStatusId;
    }

    public void setBookingStatusByBookingStatusId(BookingStatus bookingStatusByBookingStatusId) {
        this.bookingStatusByBookingStatusId = bookingStatusByBookingStatusId;
    }
}
