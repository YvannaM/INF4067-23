public class Client{

    public static void main(String[] args){
    FabriqueAbs fabriqueAbstraite1= new Fabrique1Conc();
    FabriqueAbs fabriqueAbstraite2= new Fabrique2Conc();

    ProduitA produitA=null;
    ProduitB produitB=null;
    ProduitC produitC=null;


    produitA=fabriqueAbstraite1.getProduitA();
    produitA.methodeA();

    produitA=fabriqueAbstraite2.getProduitA();
    produitA.methodeA();

    produitB=fabriqueAbstraite1.getProduitB();
    produitB.methodeB();

    produitB=fabriqueAbstraite2.getProduitB();
    produitB.methodeB();

    produitC=fabriqueAbstraite1.getProduitC();
    produitC.methodeC();

    produitC=fabriqueAbstraite2.getProduitC();
    produitC.methodeC();
    }

    


}