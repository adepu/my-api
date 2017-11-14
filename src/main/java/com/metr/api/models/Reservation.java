package com.metr.api.models;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class Reservation {

    private Long reservationId;
    private LocalDate bookingDate;
    private DateTime reservationStartTime;
    private DateTime reservationEndTime;
    private BigDecimal paymentTotal;
    private Location location;
    private Customer customer;
    private Rating rating;
    private Boolean surge;
    private BigDecimal surgePrecentage;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public DateTime getReservationStartTime() {
        return reservationStartTime;
    }

    public void setReservationStartTime(DateTime reservationStartTime) {
        this.reservationStartTime = reservationStartTime;
    }

    public DateTime getReservationEndTime() {
        return reservationEndTime;
    }

    public void setReservationEndTime(DateTime reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }

    public BigDecimal getPaymentTotal() {
        return paymentTotal;
    }

    public void setPaymentTotal(BigDecimal paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Boolean getSurge() {
        return surge;
    }

    public void setSurge(Boolean surge) {
        this.surge = surge;
    }

    public BigDecimal getSurgePrecentage() {
        return surgePrecentage;
    }

    public void setSurgePrecentage(BigDecimal surgePrecentage) {
        this.surgePrecentage = surgePrecentage;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", bookingDate=" + bookingDate +
                ", reservationStartTime=" + reservationStartTime +
                ", reservationEndTime=" + reservationEndTime +
                ", paymentTotal=" + paymentTotal +
                ", location=" + location +
                ", customer=" + customer +
                ", rating=" + rating +
                ", surge=" + surge +
                ", surgePrecentage=" + surgePrecentage +
                '}';
    }
}
