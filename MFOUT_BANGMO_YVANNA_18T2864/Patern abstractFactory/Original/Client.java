public class Client{

    public static void main(String[] args){
    FabriqueAbstraite fabriqueAbstraite1= new FabriqueConcrete1();
    FabriqueAbstraite fabriqueAbstraite2= new FabriqueConcrete2();

    ProduitA produitA=null;
    ProduitB produitB=null;


    produitA=fabriqueAbstraite1.getProduitA();
    produitA.methodeA();

    produitA=fabriqueAbstraite2.getProduitA();
    produitA.methodeA();

    produitB=fabriqueAbstraite1.getProduitB();
    produitB.methodeB();

    produitB=fabriqueAbstraite2.getProduitB();
    produitB.methodeB();
    }

    


}