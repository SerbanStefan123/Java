package com.robot;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Location> locations = Arrays.asList(
                new FriendlyLocation("Baza1"),
                new EnemyLocation("Baza2"),
                new NeutralLocation("Baza3"),
                new FriendlyLocation("Baza4"),
                new EnemyLocation("Baza5"),
                new FriendlyLocation("Baza6"),
                new EnemyLocation("Baza7")
        );

        Set<Location> friendlyLocations = locations.stream().filter(loc -> loc.getType() == LocationType.FRIENDLY).collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Friendly Locations");
        for (Location loc : friendlyLocations) {
            System.out.println(loc);
        }

        List<Location> enemyLocations = locations.stream().filter(loc -> loc.getType() == LocationType.ENEMY).sorted(Comparator.comparing(Location::getType).thenComparing(Location::getName)).collect(Collectors.toCollection(LinkedList::new));

        System.out.println("\nEnemy Locations");
        for (Location loc : enemyLocations) {
            System.out.println(loc);
        }
    }
}
