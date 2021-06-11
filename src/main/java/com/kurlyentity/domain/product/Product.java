package com.kurlyentity.domain.product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Product {

    @Id
    private Long id;

    private String name;

    private int stockQuantity;

    private String thumbnailUrl;

    private String short_description;

    @Lob
    @Basic(fetch = LAZY)
    private String description;

    @Enumerated(STRING)
    private ProductType productType;

    @OneToOne(fetch = LAZY, mappedBy = "product")
    private Discount discount;

    @ManyToOne(fetch = LAZY)
    private Category category;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
