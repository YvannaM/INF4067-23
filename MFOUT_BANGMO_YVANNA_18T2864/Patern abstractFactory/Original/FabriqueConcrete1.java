public class FabriqueConcrete1 implements FabriqueAbstraite {
    public ProduitA getProduitA(){
        return new ProduitA1() ;
    }
    public ProduitB getProduitB(){
        return new ProduitB1() ;
    }
}
