package com.madhusudhan.jh.domain;

import javax.persistence.*;

/**
 * Created by головченко on 15.05.2016.
 */
@Entity
@Table(name="TRADES")
public class Trade {
    private long tradeId = -1;
    private double quantity = 0;
    private String security = null;

    @Id
    @GeneratedValue
    @Column(name="tradeId",unique = true)
    public long getTradeId() {
        return tradeId;
    }

    public void setTradeId(long tradeId) {
        this.tradeId = tradeId;
    }

    @Column(name="quantity",nullable = false)
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        if (Double.compare(trade.quantity, quantity) != 0) return false;
        if (tradeId != trade.tradeId) return false;
        if (security != null ? !security.equals(trade.security) : trade.security != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (tradeId ^ (tradeId >>> 32));
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (security != null ? security.hashCode() : 0);
        return result;
    }
}
