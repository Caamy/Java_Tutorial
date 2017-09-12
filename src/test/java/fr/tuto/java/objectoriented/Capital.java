package fr.tuto.java.objectoriented;

public class Capital extends City {

    private String monument;

    public Capital() {
        super();
        this.monument = "none";
    }

    public Capital(String name, int habitants, String country, String monument) {
        super(name, habitants, country);
        this.monument = monument;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString() {
        String str = super.toString() + "\n \t ==>>" + this.monument + " is one monument.";
        return str;
    }

}
