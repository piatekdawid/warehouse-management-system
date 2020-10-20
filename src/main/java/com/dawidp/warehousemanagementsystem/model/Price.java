package com.dawidp.warehousemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Price {
    @Id
    @Column(name = "price_id")
    private Long priceId;
    @Column(name = "buy_price")
    private double buyPrice;
    @Column(name = "retail_price")
    private double retailPrice;
    @Column(name = "wholesale_price")
    private double wholesalePrice;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Product product;
}
