package kr.gracelove.modern.ch02.parameterization;


import kr.gracelove.modern.ch02.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
