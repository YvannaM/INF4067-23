public class Client{
    public static void main(String[] args) {
        Fabrique fabrique=new Fabrique();

        ProduitA produitA=null;

        produitA=fabrique.getProduit(Fabrique.TYPE_PRODUIT1);
        produitA.methodeA();

        produitA=fabrique.getProduit(Fabrique.TYPE_PRODUIT2);
        produitA.methodeA();

        produitA=fabrique.getProduit(3);
        produitA.methodeA();
    }
}