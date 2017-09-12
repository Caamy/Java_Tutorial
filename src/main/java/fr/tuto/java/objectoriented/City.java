package fr.tuto.java.objectoriented;

import java.util.Objects;

public class City {

    public static int instanceNb = 0;

    protected static int instanceNbBis = 0;

    protected String cityName;
    protected String countryName;
    protected int habitantsNb;
    protected char category;

    public City() {
        System.out.println("Creation of a new city !");
        cityName = "Unknown";
        countryName = "Unknown";
        habitantsNb = 0;
        this.setCategory();
        instanceNb++;
        instanceNbBis++;
    }

    public City(String cityName, int habitantsNb, String countryName) {
        System.out.println("Creation of a new city with parameters !");
        this.cityName = cityName;
        this.countryName = countryName;
        this.habitantsNb = habitantsNb;
        this.setCategory();
        instanceNb++;
        instanceNbBis++;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getHabitantsNb() {
        return habitantsNb;
    }

    public void setHabitantsNb(int habitantsNb) {
        this.habitantsNb = habitantsNb;
    }

    public static int getInstanceNbBis() {
        return instanceNbBis;
    }

    public char getCategory() {
        return category;
    }

    private void setCategory() {
        int[] populationLimits = { 0, 1000, 10000, 100000, 1000000, 5000000, 10000000 };
        char[] categories = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

        int i = 0;
        while (i < populationLimits.length && this.habitantsNb > populationLimits[i])
            i++;

        this.category = categories[i];
    }

    @Override
    public String toString() {
        return "\t" + this.cityName + " is a city of " + this.countryName + " with " + this.habitantsNb + " habitants. Thus, the category is "
                + this.category;
    }

    public String compare(City c1) {
        String str;

        if (c1.habitantsNb > this.habitantsNb)
            str = c1.getCityName() + " is more populated than " + this.cityName;
        else
            str = c1.getCityName() + " is less populated than " + this.cityName;

        return str;
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, habitantsNb, countryName, cityName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (getClass() != obj.getClass())
            return false;

        City other = (City) obj;

        return Objects.equals(other.getCategory(), this.getCategory()) && Objects.equals(other.getCityName(), this.getCityName())
                && Objects.equals(other.getCountryName(), this.getCountryName()) && Objects.equals(other.getHabitantsNb(),
                                                                                                   this.getHabitantsNb());
    }

}
