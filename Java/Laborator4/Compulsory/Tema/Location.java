    package com.robot;

    public abstract class Location implements Comparable<Location> {
        public String name;
        public LocationType type;

        public Location(String name, LocationType type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public LocationType getType() {
            return type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(LocationType type) {
            this.type = type;
        }

        @Override
        public int compareTo(Location other) {
            return this.name.compareTo(other.name);
        }

        @Override
        public String toString() {
            return "Location{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }
