public class Client {
    public static void main(String[] args) {
        MonteurPizza monteurPizzaMboa=new MonteurPizzaMboa();
        Directeur directeur=new Directeur(monteurPizzaMboa);
        directeur.construire();
        monteurPizzaMboa.getPizza().print();

        // MonteurPizza monteurPizzaReine=new MonteurPizzaReine();
        // Directeur directeur=new Directeur(monteurPizzaReine);
        // directeur.construire();
        // monteurPizzaReine.getPizza().print();

        };


}

