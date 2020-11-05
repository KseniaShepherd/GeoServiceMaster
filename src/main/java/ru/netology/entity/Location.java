package ru.netology.entity;

public class Location {

    private final String city;

    private final Country country;

    private final String street;

    private final int builing;

    public Location(String city, Country country, String street, int builing) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.builing = builing;
    }

    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getBuiling() {
        return builing;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Location) {
            Location otherLocation = (Location) other;
            result = city.equals(otherLocation.city) && country.equals(otherLocation.country)
                    && street.equals(otherLocation.street) && builing == otherLocation.builing;
        }
        return result;
    }
}
