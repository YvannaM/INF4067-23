
public class Fabrique {
    public static final int TYPE_PRODUIT1=1;
    public static final int TYPE_PRODUIT2=2;

    public ProduitA getProduit(int typeProduit){
        ProduitA produitA=null;

        switch (typeProduit) {
            case TYPE_PRODUIT1:
                produitA= new ProduitA1();
                break;
            case TYPE_PRODUIT2:
                produitA= new ProduitA2();

                break;
        
            default:
                throw new IllegalArgumentException("Type de Produit inconnu");
        }
        return produitA;

    }



    
}
