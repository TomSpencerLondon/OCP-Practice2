package com.tomspencerlondon.applyingfunctionalprogramming.applying;

import java.util.Optional;

public class Customer {
    private RewardPoints rewardPoints;

    public void setRewardPoints(RewardPoints rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public Optional<RewardPoints> getRewardPoints() {
        return Optional.ofNullable(rewardPoints);
    }
}
