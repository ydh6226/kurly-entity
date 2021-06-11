package com.kurlyentity.domain.payment;

import com.kurlyentity.domain.order.Order;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Payment {

    @Id
    private Long id;

    private int pointAmount;

    private int cashAmount;

    @Enumerated(STRING)
    private PaymentStatus status;

    @OneToOne(fetch = LAZY)
    private Order order;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
