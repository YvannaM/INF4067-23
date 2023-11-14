public class Directeur {
    private MonteurPizza monteurPizza;

    public Directeur(MonteurPizza monteurPizza){
        this.monteurPizza=monteurPizza;
    }

    public void construire(){
        monteurPizza.monterPate();
        monteurPizza.monterGarniture();
        monteurPizza.monterSauce();
        monteurPizza.getPizza();
    }
}
