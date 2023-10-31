import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete {


    HashMap <Employe,Departement> hash=new HashMap<>();

    @Override

    public void ajouterEmployeDepartement(Employe e, Departement d) {
    hash.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hash.remove(e);

    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        hash.
    }

    @Override
    public void afficherLesEmployes() {

    }

    @Override
    public void afficherLesDepartements() {

    }

    @Override
    public void afficherDepartement(Employe e) {

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return false;
    }
}