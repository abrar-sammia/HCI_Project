package com.example.sammiaabrar.timber_agardeningguide;

/**
 * Created by sho on 26/11/16.
 */

public class FlowerProvider {

    private int flower_Picture;
    private String name;

    public FlowerProvider(int flower_Picture, String name) {

        this.setFlower_Picture(flower_Picture);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlower_Picture() {
        return flower_Picture;
    }

    public void setFlower_Picture(int flower_Picture) {
        this.flower_Picture = flower_Picture;
    }



}
