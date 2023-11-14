public class Client {
    public static void main(String[] args) {
        MonteurPizza monteurPizzaReine=new MonteurPizzaReine();
        Directeur directeur=new Directeur(monteurPizzaReine);
        directeur.construire();
        monteurPizzaReine.getPizza().print();

        };


}

