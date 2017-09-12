package fr.tuto.java.objectoriented;

public class MainClass {

    public static void main(String[] args) {
        City city = new City();
        System.out.println("Le nombre d'instances de la classe Ville est : " + city.instanceNb);
        System.out.println("Le nombre d'instances de la classe Ville est : " + city.getInstanceNbBis());
        City city1 = new City("Toulouse", 466297, "France");
        System.out.println("Le nombre d'instances de la classe Ville est : " + city1.instanceNb);
        System.out.println("Le nombre d'instances de la classe Ville est : " + city1.getInstanceNbBis());
        City city2 = new City("Los Angeles", 3976000, "USA");
        System.out.println("Le nombre d'instances de la classe Ville est : " + city2.instanceNb);
        System.out.println("Le nombre d'instances de la classe Ville est : " + city2.getInstanceNbBis());

        System.out.println(city1.toString());
        System.out.println(city2.toString());
        System.out.println(city1.compare(city2));

        Capital cap = new Capital("Paris", 2220445, "France", "Eiffel Tour");
        System.out.println(cap.toString());

        City[] table = new City[6];

        String[] tab = { "Toulouse", "Nantes", "Bordeaux", "Brest", "Lyon", "Paris" };
        int[] tab2 = { 12345, 78456, 654987, 75832165, 2594, 347 };

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                City c = new City(tab[i], tab2[i], "France");
                table[i] = c;
            } else {
                Capital c = new Capital(tab[i], tab2[i], "France", "Eiffel Tour");
                table[i] = c;
            }
        }

        for (City c : table) {
            System.out.println(c.toString() + "\n");
        }
    }
}
