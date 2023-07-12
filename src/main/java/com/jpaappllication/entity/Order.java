package com.jpaappllication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "order_payment")
    private Double orderPayment;
    @Column(name = "order_time")
    private Order dateTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(Double orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Order getDateTime() {
        return dateTime;
    }

    public void setDateTime(Order dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderPayment=" + orderPayment +
                ", dateTime=" + dateTime +
                '}';
    }
}
