package exercice2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    String nom ; 
    String adr ; 
    ArrayList<IVehicule> listVehicule ; 

    public Garage(String nom , String adr){
        this.nom=nom ; 
        this.adr=adr;
        listVehicule = new ArrayList<>();
    }

    public void ajouter(IVehicule v){
        listVehicule.add(v);
    }

    public void enlever(IVehicule v) throws GarageException {
        if(!listVehicule.contains(v)){
            throw new GarageException("mafamesh el karhba hedhi ya m3alem ina3n din zahi");
        }else{
            listVehicule.remove(v);
        }
    }
    public void afficher(){
        for(int i =0 ; i<listVehicule.size() ; i++){
            IVehicule v = listVehicule.get(i);
            if(v instanceof Voiture){
                ((Voiture) v).afficher();
            }
            else if(v instanceof Camion) {
                ((Camion) v).afficher();
            }
        }
    }
}
