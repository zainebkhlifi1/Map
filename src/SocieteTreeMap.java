import java.util.HashMap;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{

    TreeMap<Employe,Departement> tree=new TreeMap<>() ;

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
    tree.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
    tree.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {

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