package com.kurlyentity.domain.cart;

import com.kurlyentity.domain.product.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class CartProduct {

    @Id
    private Long id;

    private int count;

    @ManyToOne(fetch = LAZY)
    private Cart cart;

    @ManyToOne(fetch = LAZY)
    private Product product;
}
