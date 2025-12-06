package com.abstractclass;

public class CreatureBuild {
    public static void main(String[] args) {
        Creature creature;

        creature = new Dog();
        creature.legs();
        creature.createBy();

        creature = new Human();
        creature.legs();
        creature.createBy();
    }
}
