package exercice2;

public class Camion implements IVehicule {
    String marque ; 
    String ID ; 
    int prop ; 

    public Camion(String marque , String ID , int prop){
        this.marque=marque ; 
        this.ID=ID ; 
        this.prop=prop ; 
    }

    public void afficher(){
        System.out.println(String.format("%s %s %s" , marque , ID , prop));
    }
    
}
