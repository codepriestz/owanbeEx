package com.codepriest.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by App Celestine on 7/29/2017.
 */
@Entity
@Table(name = "event_centre", schema = "dbo", catalog = "OwanbeDB")
public class EventCentre {
    private int id;
    private String name;
    private String description;
    private Serializable mainFeature;
    private int managedById;
    private Serializable location;
    private String address;
    private Serializable availableDays;
    private int centreType;
    private String state;
    private String city;
    private int pricePerHr;
    private Serializable optionalFeatures;
    private boolean isNight;
    private Timestamp dateAdded;
    private String token;
    private User userByManagedById;
    private CentreType centreTypeByCentreType;
    private Collection<EventCentreBookings> eventCentreBookingsById;
    private int eventCentreStatusId;
    private EventCentreStatus eventCentreStatusByEventCentreStatusId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "main_feature", nullable = false)
    public Serializable getMainFeature() {
        return mainFeature;
    }

    public void setMainFeature(Serializable mainFeature) {
        this.mainFeature = mainFeature;
    }

    @Basic
    @Column(name = "managed_by_id", nullable = false)
    public int getManagedById() {
        return managedById;
    }

    public void setManagedById(int managedById) {
        this.managedById = managedById;
    }

    @Basic
    @Column(name = "location", nullable = false)
    public Serializable getLocation() {
        return location;
    }

    public void setLocation(Serializable location) {
        this.location = location;
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
    @Column(name = "available_days", nullable = false)
    public Serializable getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(Serializable availableDays) {
        this.availableDays = availableDays;
    }

    @Basic
    @Column(name = "centre_type", nullable = false)
    public int getCentreType() {
        return centreType;
    }

    public void setCentreType(int centreType) {
        this.centreType = centreType;
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
    @Column(name = "price_per_hr", nullable = false, precision = 0)
    public int getPricePerHr() {
        return pricePerHr;
    }

    public void setPricePerHr(int pricePerHr) {
        this.pricePerHr = pricePerHr;
    }

    @Basic
    @Column(name = "optional_features", nullable = false)
    public Serializable getOptionalFeatures() {
        return optionalFeatures;
    }

    public void setOptionalFeatures(Serializable optionalFeatures) {
        this.optionalFeatures = optionalFeatures;
    }

    @Basic
    @Column(name = "is_night", nullable = false)
    public boolean isNight() {
        return isNight;
    }

    public void setNight(boolean night) {
        isNight = night;
    }

    @Basic
    @Column(name = "date_added", nullable = false)
    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
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

        EventCentre that = (EventCentre) o;

        if (id != that.id) return false;
        if (managedById != that.managedById) return false;
        if (centreType != that.centreType) return false;
        if (pricePerHr != that.pricePerHr) return false;
        if (isNight != that.isNight) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (mainFeature != null ? !mainFeature.equals(that.mainFeature) : that.mainFeature != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (availableDays != null ? !availableDays.equals(that.availableDays) : that.availableDays != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (optionalFeatures != null ? !optionalFeatures.equals(that.optionalFeatures) : that.optionalFeatures != null)
            return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        return token != null ? token.equals(that.token) : that.token == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (mainFeature != null ? mainFeature.hashCode() : 0);
        result = 31 * result + managedById;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (availableDays != null ? availableDays.hashCode() : 0);
        result = 31 * result + centreType;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + pricePerHr;
        result = 31 * result + (optionalFeatures != null ? optionalFeatures.hashCode() : 0);
        result = 31 * result + (isNight ? 1 : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "managed_by_id", referencedColumnName = "id", nullable = false)
    public User getUserByManagedById() {
        return userByManagedById;
    }

    public void setUserByManagedById(User userByManagedById) {
        this.userByManagedById = userByManagedById;
    }

    @ManyToOne
    @JoinColumn(name = "centre_type", referencedColumnName = "id", nullable = false)
    public CentreType getCentreTypeByCentreType() {
        return centreTypeByCentreType;
    }

    public void setCentreTypeByCentreType(CentreType centreTypeByCentreType) {
        this.centreTypeByCentreType = centreTypeByCentreType;
    }

    @OneToMany(mappedBy = "eventCentreByEventCentreId")
    public Collection<EventCentreBookings> getEventCentreBookingsById() {
        return eventCentreBookingsById;
    }

    public void setEventCentreBookingsById(Collection<EventCentreBookings> eventCentreBookingsById) {
        this.eventCentreBookingsById = eventCentreBookingsById;
    }

    @Basic
    @Column(name = "event_centre_status_id", nullable = false)
    public int getEventCentreStatusId() {
        return eventCentreStatusId;
    }

    public void setEventCentreStatusId(int eventCentreStatusId) {
        this.eventCentreStatusId = eventCentreStatusId;
    }

    @ManyToOne
    @JoinColumn(name = "event_centre_status_id", referencedColumnName = "id", nullable = false)
    public EventCentreStatus getEventCentreStatusByEventCentreStatusId() {
        return eventCentreStatusByEventCentreStatusId;
    }

    public void setEventCentreStatusByEventCentreStatusId(EventCentreStatus eventCentreStatusByEventCentreStatusId) {
        this.eventCentreStatusByEventCentreStatusId = eventCentreStatusByEventCentreStatusId;
    }
}
