package exercice2;

public class Voiture implements IVehicule {
    String marque ; 
    String ID ; 
    String couleur ; 

    public Voiture(String marque , String ID , String couleur){
        this.marque=marque ; 
        this.ID=ID ; 
        this.couleur=couleur ;
    }

    public void afficher(){
        System.out.println(String.format("%s %s %s" , marque , ID , couleur));
    }
}
