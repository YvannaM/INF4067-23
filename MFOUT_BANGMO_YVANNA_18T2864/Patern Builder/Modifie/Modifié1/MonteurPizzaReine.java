public class MonteurPizzaReine extends MonteurPizza {
    public void monterPate(){
        creerNouvellePizza();
        pizza.setpate("croisée");
    };
    public void monterSauce(){
        pizza.setsauce("douce");
    }
    public void monterGarniture(){       
        pizza.setgarniture("jambon+Champignon");
    }

}
