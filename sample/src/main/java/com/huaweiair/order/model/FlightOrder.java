package com.huaweiair.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-10-31T21:11:32.501+08:00")

public class FlightOrder   {
  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("flightId")
  private String flightId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("flightTime")
  private String flightTime = null;

  @JsonProperty("flightClass")
  private Integer flightClass = null;

  @JsonProperty("flightPrice")
  private Integer flightPrice = null;

  @JsonProperty("orderTime")
  private String orderTime = null;

  @JsonProperty("orderStatus")
  private Integer orderStatus = null;

  @JsonProperty("scheduledDepartureTime")
  private String scheduledDepartureTime = null;

  @JsonProperty("scheduledArrivalTime")
  private String scheduledArrivalTime = null;

  public FlightOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public FlightOrder userId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public FlightOrder flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public FlightOrder name(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlightOrder flightTime(String flightTime) {
    this.flightTime = flightTime;
    return this;
  }

  public String getFlightTime() {
    return flightTime;
  }

  public void setFlightTime(String flightTime) {
    this.flightTime = flightTime;
  }

  public FlightOrder flightClass(Integer flightClass) {
    this.flightClass = flightClass;
    return this;
  }

  public Integer getFlightClass() {
    return flightClass;
  }

  public void setFlightClass(Integer flightClass) {
    this.flightClass = flightClass;
  }

  public FlightOrder flightPrice(Integer flightPrice) {
    this.flightPrice = flightPrice;
    return this;
  }

  public Integer getFlightPrice() {
    return flightPrice;
  }

  public void setFlightPrice(Integer flightPrice) {
    this.flightPrice = flightPrice;
  }

  public FlightOrder orderTime(String orderTime) {
    this.orderTime = orderTime;
    return this;
  }

  public String getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(String orderTime) {
    this.orderTime = orderTime;
  }

  public FlightOrder orderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

  public FlightOrder scheduledDepartureTime(String scheduledDepartureTime) {
    this.scheduledDepartureTime = scheduledDepartureTime;
    return this;
  }

  public String getScheduledDepartureTime() {
    return scheduledDepartureTime;
  }

  public void setScheduledDepartureTime(String scheduledDepartureTime) {
    this.scheduledDepartureTime = scheduledDepartureTime;
  }

  public FlightOrder scheduledArrivalTime(String scheduledArrivalTime) {
    this.scheduledArrivalTime = scheduledArrivalTime;
    return this;
  }

  public String getScheduledArrivalTime() {
    return scheduledArrivalTime;
  }

  public void setScheduledArrivalTime(String scheduledArrivalTime) {
    this.scheduledArrivalTime = scheduledArrivalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightOrder flightOrder = (FlightOrder) o;
    return Objects.equals(this.orderId, flightOrder.orderId) &&
        Objects.equals(this.userId, flightOrder.userId) &&
        Objects.equals(this.flightId, flightOrder.flightId) &&
        Objects.equals(this.name, flightOrder.name) &&
        Objects.equals(this.flightTime, flightOrder.flightTime) &&
        Objects.equals(this.flightClass, flightOrder.flightClass) &&
        Objects.equals(this.flightPrice, flightOrder.flightPrice) &&
        Objects.equals(this.orderTime, flightOrder.orderTime) &&
        Objects.equals(this.orderStatus, flightOrder.orderStatus) &&
        Objects.equals(this.scheduledDepartureTime, flightOrder.scheduledDepartureTime) &&
        Objects.equals(this.scheduledArrivalTime, flightOrder.scheduledArrivalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, flightId, name, flightTime, flightClass, flightPrice, orderTime, orderStatus, scheduledDepartureTime, scheduledArrivalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flightTime: ").append(toIndentedString(flightTime)).append("\n");
    sb.append("    flightClass: ").append(toIndentedString(flightClass)).append("\n");
    sb.append("    flightPrice: ").append(toIndentedString(flightPrice)).append("\n");
    sb.append("    orderTime: ").append(toIndentedString(orderTime)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    scheduledDepartureTime: ").append(toIndentedString(scheduledDepartureTime)).append("\n");
    sb.append("    scheduledArrivalTime: ").append(toIndentedString(scheduledArrivalTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

