
public class Client {
    public static void main(String[] args) {
        int som=Arithmethique.getInstance().somme(2,5);

        System.out.printf("la somme est %d ", som);

        Arithmethique s1= Arithmethique.getInstance(8,3);
        s1.affiche();

        Arithmethique s2= Arithmethique.getInstance(8,3);
        s2.affiche();

        Arithmethique s3= Arithmethique.getInstance("Arith", 8, 3);
        s3.affiche();

                


    }
    
}
