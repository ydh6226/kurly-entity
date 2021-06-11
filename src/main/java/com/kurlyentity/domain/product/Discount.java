package com.kurlyentity.domain.product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Discount {

    @Id
    private Long id;

    private int discountRate;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
