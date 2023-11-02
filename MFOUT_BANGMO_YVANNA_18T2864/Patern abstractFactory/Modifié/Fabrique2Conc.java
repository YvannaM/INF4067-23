public class Fabrique2Conc implements FabriqueAbs {
    public ProduitA getProduitA(){
        return new ProduitA2() ;
    }
    public ProduitB getProduitB(){
        return new ProduitB2() ;
    }
    public ProduitC getProduitC(){
        return new ProduitC2() ;
    }
}
