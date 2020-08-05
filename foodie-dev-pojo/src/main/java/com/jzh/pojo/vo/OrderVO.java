package com.jzh.pojo.vo;

public class OrderVO {

    private String orderId;
    private com.jzh.pojo.vo.MerchantOrdersVO merchantOrdersVO;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public com.jzh.pojo.vo.MerchantOrdersVO getMerchantOrdersVO() {
        return merchantOrdersVO;
    }

    public void setMerchantOrdersVO(com.jzh.pojo.vo.MerchantOrdersVO merchantOrdersVO) {
        this.merchantOrdersVO = merchantOrdersVO;
    }
}