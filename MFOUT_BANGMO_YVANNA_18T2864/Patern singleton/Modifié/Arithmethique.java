public final class Arithmethique {
    private static Arithmethique instance= null;

    private int x;
    private int y;
    private String string = "nom";


    private Arithmethique(){

        super();
    }

    private Arithmethique(int x, int y){
        this.x=x;
        this.y=y;

    }
    private Arithmethique(String nom,int x, int y){
        this.x=x;
        this.y=y;
        this.string="nom";

    }

    public static Arithmethique getInstance(){
        if(instance==null){
            instance=new Arithmethique();
        }
        return instance;
    }

    public static Arithmethique getInstance(int x, int y){
        if(instance==null){
            instance=new Arithmethique(x,y);
        }
        return instance;
    }

    public static Arithmethique getInstance(String string, int x, int y){
        if(instance==null){
            instance=new Arithmethique(string,x,y);
        }
        return instance;
    }

    public int somme(int x, int y){
        return x+y;
    }

    public float moyenne(int x, int y){
        return somme(x,y)/2;
    }

    public void affiche(){
        System.out.println("Je suis une instance, mes valeurs sont : x= "+this.x+ ", y= "+ this.y+" et de nom: "+this.string);
    }

    
}
