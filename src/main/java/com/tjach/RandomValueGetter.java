package com.tjach;

import java.util.Random;

public class RandomValueGetter {
    private int lower_bounds = Integer.MIN_VALUE;
    private int upper_boud = Integer.MAX_VALUE;
    private static Random r;
    static {
        r = new Random();
    }

    public int getLower_bounds() {
        return lower_bounds;
    }

    public void setLower_bounds(int lower_bounds) {
        this.lower_bounds = lower_bounds;
    }

    public int getUpper_boud() {
        return upper_boud;
    }

    public void setUpper_boud(int upper_boud) {
        this.upper_boud = upper_boud;
    }

    public int getRandomValue() {
        return r.nextInt(upper_boud-lower_bounds)+lower_bounds;
    }
}
