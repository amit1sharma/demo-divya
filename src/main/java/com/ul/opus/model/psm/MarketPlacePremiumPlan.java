package com.ul.opus.model.psm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "market_place_premium_plan")
public class MarketPlacePremiumPlan implements Serializable {

    private static final long serialVersionUID = -8176734400590516628L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Boolean display;

    @Column(nullable = false, columnDefinition = "decimal", precision = 19, scale = 2)
    private BigDecimal price;

    private Boolean isActive;

    private Boolean isBundle;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer planTypeId;
}
