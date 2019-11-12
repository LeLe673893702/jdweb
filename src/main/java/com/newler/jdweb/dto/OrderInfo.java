package com.newler.jdweb.dto;

public class OrderInfo {
    private long id;
    private String uid;
    private String carriageId;
    private String receiverInfo;
    private String status;
    private float settlementPrice;
    private String payWay;
    private String goodsInfo;
    private boolean registration;
    private float price;
    private int goodsNum;

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCarriageId() {
        return carriageId;
    }

    public void setCarriageId(String carriageId) {
        this.carriageId = carriageId;
    }

    public String getReceiverInfo() {
        return receiverInfo;
    }

    public void setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(float settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }
}
