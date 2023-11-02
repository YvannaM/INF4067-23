public class FabriqueConcrete2 implements FabriqueAbstraite{
    public ProduitA getProduitA(){
        return new ProduitA2() ;
    }
    public ProduitB getProduitB(){
        return new ProduitB2() ;
    }
}
