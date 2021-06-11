package com.kurlyentity;


import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@AnalyzeClasses(packages = "com.kurlyentity.domain")
public class PackageDependencyTest {

    private static final String INQUIRY = "..inquiry..";
    private static final String CART = "..cart..";
    private static final String MEMBER = "..member..";
    private static final String ORDER = "..order..";
    private static final String PAYMENT = "..payment..";
    private static final String PRODUCT = "..product..";
    private static final String RECIPE = "..recipe..";
    private static final String BOARD = "..board..";

    @ArchTest
    ArchRule cartRule = classes()
            .that().resideInAnyPackage(CART)
            .should().onlyHaveDependentClassesThat().resideInAnyPackage(CART, ORDER);

    @ArchTest
    ArchRule recipeRule = classes()
            .that().resideInAnyPackage(RECIPE)
            .should().onlyHaveDependentClassesThat().resideInAnyPackage(RECIPE);

    @ArchTest
    ArchRule cycleRule = slices()
            .matching("com.kurlyentity.domain.(*)..")
            .should().beFreeOfCycles();
}
