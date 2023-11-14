public class MonteurPizzaMboa extends MonteurPizza {
    public void monterPate(){
        creerNouvellePizza();
        pizza.setpate("feuille de macabo");
    };
    public void monterSauce(){
        pizza.setsauce("sauce jaune");
    }
    public void monterGarniture(){
        pizza.setgarniture("escargo");
    }

}
