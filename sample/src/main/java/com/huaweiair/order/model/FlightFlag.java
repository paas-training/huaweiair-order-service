package com.huaweiair.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-10-31T21:11:32.501+08:00")

public class FlightFlag   {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("fromAirPortName")
  private String fromAirPortName = null;

  @JsonProperty("toAirPortName")
  private String toAirPortName = null;

  @JsonProperty("toFlightId")
  private String toFlightId = null;

  @JsonProperty("toFlightTime")
  private String toFlightTime = null;

  @JsonProperty("toFlightClass")
  private Integer toFlightClass = null;

  @JsonProperty("toFlightPrice")
  private Integer toFlightPrice = null;

  @JsonProperty("retFlightId")
  private String retFlightId = null;

  @JsonProperty("retFlightClass")
  private Integer retFlightClass = null;

  @JsonProperty("retFlightTime")
  private String retFlightTime = null;

  @JsonProperty("retFlightPrice")
  private Integer retFlightPrice = null;

  @JsonProperty("toFlightSegId")
  private String toFlightSegId = null;

  @JsonProperty("retFlightSegId")
  private String retFlightSegId = null;

  @JsonProperty("oneWayFlight")
  private Boolean oneWayFlight = null;

  @JsonProperty("toScheduledDepartureTime")
  private String toScheduledDepartureTime = null;

  @JsonProperty("toScheduledArrivalTime")
  private String toScheduledArrivalTime = null;

  @JsonProperty("retScheduledDepartureTime")
  private String retScheduledDepartureTime = null;

  @JsonProperty("retScheduledArrivalTime")
  private String retScheduledArrivalTime = null;

  public FlightFlag userId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public FlightFlag fromAirPortName(String fromAirPortName) {
    this.fromAirPortName = fromAirPortName;
    return this;
  }

  public String getFromAirPortName() {
    return fromAirPortName;
  }

  public void setFromAirPortName(String fromAirPortName) {
    this.fromAirPortName = fromAirPortName;
  }

  public FlightFlag toAirPortName(String toAirPortName) {
    this.toAirPortName = toAirPortName;
    return this;
  }

  public String getToAirPortName() {
    return toAirPortName;
  }

  public void setToAirPortName(String toAirPortName) {
    this.toAirPortName = toAirPortName;
  }

  public FlightFlag toFlightId(String toFlightId) {
    this.toFlightId = toFlightId;
    return this;
  }

  public String getToFlightId() {
    return toFlightId;
  }

  public void setToFlightId(String toFlightId) {
    this.toFlightId = toFlightId;
  }

  public FlightFlag toFlightTime(String toFlightTime) {
    this.toFlightTime = toFlightTime;
    return this;
  }

  public String getToFlightTime() {
    return toFlightTime;
  }

  public void setToFlightTime(String toFlightTime) {
    this.toFlightTime = toFlightTime;
  }

  public FlightFlag toFlightClass(Integer toFlightClass) {
    this.toFlightClass = toFlightClass;
    return this;
  }

  public Integer getToFlightClass() {
    return toFlightClass;
  }

  public void setToFlightClass(Integer toFlightClass) {
    this.toFlightClass = toFlightClass;
  }

  public FlightFlag toFlightPrice(Integer toFlightPrice) {
    this.toFlightPrice = toFlightPrice;
    return this;
  }

  public Integer getToFlightPrice() {
    return toFlightPrice;
  }

  public void setToFlightPrice(Integer toFlightPrice) {
    this.toFlightPrice = toFlightPrice;
  }

  public FlightFlag retFlightId(String retFlightId) {
    this.retFlightId = retFlightId;
    return this;
  }

  public String getRetFlightId() {
    return retFlightId;
  }

  public void setRetFlightId(String retFlightId) {
    this.retFlightId = retFlightId;
  }

  public FlightFlag retFlightClass(Integer retFlightClass) {
    this.retFlightClass = retFlightClass;
    return this;
  }

  public Integer getRetFlightClass() {
    return retFlightClass;
  }

  public void setRetFlightClass(Integer retFlightClass) {
    this.retFlightClass = retFlightClass;
  }

  public FlightFlag retFlightTime(String retFlightTime) {
    this.retFlightTime = retFlightTime;
    return this;
  }

  public String getRetFlightTime() {
    return retFlightTime;
  }

  public void setRetFlightTime(String retFlightTime) {
    this.retFlightTime = retFlightTime;
  }

  public FlightFlag retFlightPrice(Integer retFlightPrice) {
    this.retFlightPrice = retFlightPrice;
    return this;
  }

  public Integer getRetFlightPrice() {
    return retFlightPrice;
  }

  public void setRetFlightPrice(Integer retFlightPrice) {
    this.retFlightPrice = retFlightPrice;
  }

  public FlightFlag toFlightSegId(String toFlightSegId) {
    this.toFlightSegId = toFlightSegId;
    return this;
  }

  public String getToFlightSegId() {
    return toFlightSegId;
  }

  public void setToFlightSegId(String toFlightSegId) {
    this.toFlightSegId = toFlightSegId;
  }

  public FlightFlag retFlightSegId(String retFlightSegId) {
    this.retFlightSegId = retFlightSegId;
    return this;
  }

  public String getRetFlightSegId() {
    return retFlightSegId;
  }

  public void setRetFlightSegId(String retFlightSegId) {
    this.retFlightSegId = retFlightSegId;
  }

  public FlightFlag oneWayFlight(Boolean oneWayFlight) {
    this.oneWayFlight = oneWayFlight;
    return this;
  }

  public Boolean getOneWayFlight() {
    return oneWayFlight;
  }

  public void setOneWayFlight(Boolean oneWayFlight) {
    this.oneWayFlight = oneWayFlight;
  }

  public FlightFlag toScheduledDepartureTime(String toScheduledDepartureTime) {
    this.toScheduledDepartureTime = toScheduledDepartureTime;
    return this;
  }

  public String getToScheduledDepartureTime() {
    return toScheduledDepartureTime;
  }

  public void setToScheduledDepartureTime(String toScheduledDepartureTime) {
    this.toScheduledDepartureTime = toScheduledDepartureTime;
  }

  public FlightFlag toScheduledArrivalTime(String toScheduledArrivalTime) {
    this.toScheduledArrivalTime = toScheduledArrivalTime;
    return this;
  }

  public String getToScheduledArrivalTime() {
    return toScheduledArrivalTime;
  }

  public void setToScheduledArrivalTime(String toScheduledArrivalTime) {
    this.toScheduledArrivalTime = toScheduledArrivalTime;
  }

  public FlightFlag retScheduledDepartureTime(String retScheduledDepartureTime) {
    this.retScheduledDepartureTime = retScheduledDepartureTime;
    return this;
  }

  public String getRetScheduledDepartureTime() {
    return retScheduledDepartureTime;
  }

  public void setRetScheduledDepartureTime(String retScheduledDepartureTime) {
    this.retScheduledDepartureTime = retScheduledDepartureTime;
  }

  public FlightFlag retScheduledArrivalTime(String retScheduledArrivalTime) {
    this.retScheduledArrivalTime = retScheduledArrivalTime;
    return this;
  }

  public String getRetScheduledArrivalTime() {
    return retScheduledArrivalTime;
  }

  public void setRetScheduledArrivalTime(String retScheduledArrivalTime) {
    this.retScheduledArrivalTime = retScheduledArrivalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightFlag flightFlag = (FlightFlag) o;
    return Objects.equals(this.userId, flightFlag.userId) &&
        Objects.equals(this.fromAirPortName, flightFlag.fromAirPortName) &&
        Objects.equals(this.toAirPortName, flightFlag.toAirPortName) &&
        Objects.equals(this.toFlightId, flightFlag.toFlightId) &&
        Objects.equals(this.toFlightTime, flightFlag.toFlightTime) &&
        Objects.equals(this.toFlightClass, flightFlag.toFlightClass) &&
        Objects.equals(this.toFlightPrice, flightFlag.toFlightPrice) &&
        Objects.equals(this.retFlightId, flightFlag.retFlightId) &&
        Objects.equals(this.retFlightClass, flightFlag.retFlightClass) &&
        Objects.equals(this.retFlightTime, flightFlag.retFlightTime) &&
        Objects.equals(this.retFlightPrice, flightFlag.retFlightPrice) &&
        Objects.equals(this.toFlightSegId, flightFlag.toFlightSegId) &&
        Objects.equals(this.retFlightSegId, flightFlag.retFlightSegId) &&
        Objects.equals(this.oneWayFlight, flightFlag.oneWayFlight) &&
        Objects.equals(this.toScheduledDepartureTime, flightFlag.toScheduledDepartureTime) &&
        Objects.equals(this.toScheduledArrivalTime, flightFlag.toScheduledArrivalTime) &&
        Objects.equals(this.retScheduledDepartureTime, flightFlag.retScheduledDepartureTime) &&
        Objects.equals(this.retScheduledArrivalTime, flightFlag.retScheduledArrivalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fromAirPortName, toAirPortName, toFlightId, toFlightTime, toFlightClass, toFlightPrice, retFlightId, retFlightClass, retFlightTime, retFlightPrice, toFlightSegId, retFlightSegId, oneWayFlight, toScheduledDepartureTime, toScheduledArrivalTime, retScheduledDepartureTime, retScheduledArrivalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightFlag {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fromAirPortName: ").append(toIndentedString(fromAirPortName)).append("\n");
    sb.append("    toAirPortName: ").append(toIndentedString(toAirPortName)).append("\n");
    sb.append("    toFlightId: ").append(toIndentedString(toFlightId)).append("\n");
    sb.append("    toFlightTime: ").append(toIndentedString(toFlightTime)).append("\n");
    sb.append("    toFlightClass: ").append(toIndentedString(toFlightClass)).append("\n");
    sb.append("    toFlightPrice: ").append(toIndentedString(toFlightPrice)).append("\n");
    sb.append("    retFlightId: ").append(toIndentedString(retFlightId)).append("\n");
    sb.append("    retFlightClass: ").append(toIndentedString(retFlightClass)).append("\n");
    sb.append("    retFlightTime: ").append(toIndentedString(retFlightTime)).append("\n");
    sb.append("    retFlightPrice: ").append(toIndentedString(retFlightPrice)).append("\n");
    sb.append("    toFlightSegId: ").append(toIndentedString(toFlightSegId)).append("\n");
    sb.append("    retFlightSegId: ").append(toIndentedString(retFlightSegId)).append("\n");
    sb.append("    oneWayFlight: ").append(toIndentedString(oneWayFlight)).append("\n");
    sb.append("    toScheduledDepartureTime: ").append(toIndentedString(toScheduledDepartureTime)).append("\n");
    sb.append("    toScheduledArrivalTime: ").append(toIndentedString(toScheduledArrivalTime)).append("\n");
    sb.append("    retScheduledDepartureTime: ").append(toIndentedString(retScheduledDepartureTime)).append("\n");
    sb.append("    retScheduledArrivalTime: ").append(toIndentedString(retScheduledArrivalTime)).append("\n");
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

