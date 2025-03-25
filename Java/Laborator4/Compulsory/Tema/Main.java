package com.robot;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();

        List<Location> locations = Arrays.asList(
                new FriendlyLocation(faker.name().firstName()),
                new EnemyLocation(faker.name().firstName()),
                new NeutralLocation(faker.name().firstName()),
                new FriendlyLocation(faker.name().firstName()),
                new EnemyLocation(faker.name().firstName()),
                new FriendlyLocation(faker.name().firstName()),
                new EnemyLocation(faker.name().firstName())
        );

        Set<Location> friendlyLocations = locations.stream().filter(loc -> loc.getType() == LocationType.FRIENDLY).collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Friendly Locations:");
        friendlyLocations.forEach(System.out::println);

        List<Location> enemyLocations = locations.stream().filter(loc -> loc.getType() == LocationType.ENEMY).sorted(Comparator.comparing(Location::getName)).collect(Collectors.toCollection(LinkedList::new));

        System.out.println("\n Enemy Locations:");
        enemyLocations.forEach(System.out::println);

        Map<LocationType, List<Location>> locationsByType = locations.stream().collect(Collectors.groupingBy(Location::getType));

        System.out.println("\n Locations by Type:");
        locationsByType.forEach((type, locs) -> {System.out.println(type + ": " + locs);
        });

        Location startLocation = locations.get(0);
        System.out.println("\n Starting location: " + startLocation);

        GraphManager graphManager = new GraphManager();
        graphManager.createGraph(locations);

        Map<Location, Double> shortestPaths = graphManager.computeShortestPaths(startLocation);

        System.out.println("\nShortest paths:");
        shortestPaths.entrySet().stream().sorted(Comparator.comparing(entry -> entry.getKey().getType())).forEach(entry -> System.out.println(entry.getKey() + " - Time: " + entry.getValue()));
    }
}