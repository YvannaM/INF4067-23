public class Fabrique1Conc implements FabriqueAbs {
    public ProduitA getProduitA(){
        return new ProduitA1() ;
    }
    public ProduitB getProduitB(){
        return new ProduitB1() ;
    }
    public ProduitC getProduitC(){
        return new ProduitC1() ;
    }
    
}
