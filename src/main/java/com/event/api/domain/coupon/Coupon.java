package com.event.api.domain.coupon;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private Integer discount;

    private Date valid;

    @ManyToMany
    @JoinColumn(name = "event_id")
    private String event;
}
