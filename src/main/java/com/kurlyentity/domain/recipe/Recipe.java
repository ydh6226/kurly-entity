package com.kurlyentity.domain.recipe;


import com.kurlyentity.domain.member.Member;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Entity
@EqualsAndHashCode(of = "id")
@Getter @NoArgsConstructor
public class Recipe {

    @Id
    private Long id;

    private String title;

    private int views = 0;

    @Lob
    @Basic(fetch = LAZY)
    private String description;

    @ManyToOne(fetch = LAZY)
    private Member member;

    @OneToMany(mappedBy = "recipe", cascade = ALL, orphanRemoval = true)
    private List<RecipeProduct> includedProducts = new ArrayList<>();

    private LocalDateTime createDate;

    private LocalDateTime modifiedDate;
}
