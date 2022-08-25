package com.toy.pbletter.common.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.awt.*;
import java.math.BigDecimal;

@Getter
@Embeddable
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String address;

    // 위도
    @Column(precision = 10, scale = 7)
    private BigDecimal latitude;

    // 경도
    @Column(precision = 10, scale = 7)
    private BigDecimal longitude;

    @Column
    private Point locationPoint;

    public void setLocationPoint(Point locationPoint) {
        this.locationPoint = locationPoint;
    }
}
