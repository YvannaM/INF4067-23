public class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate(){
        creerNouvellePizza();
        pizza.setpate("feuilletée");
    };
    public void monterSauce(){
        pizza.setsauce("piquante");
    }
    public void monterGarniture(){
        pizza.setgarniture("Pepperoni+salami");
    }

}
