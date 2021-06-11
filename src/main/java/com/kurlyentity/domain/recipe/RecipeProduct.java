package com.kurlyentity.domain.recipe;


import com.kurlyentity.domain.product.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter
@NoArgsConstructor
public class RecipeProduct {

    @Id
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Recipe recipe;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
