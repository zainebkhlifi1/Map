public class Departement {
    int id;
    String nom;

    public Departement(){}
    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId(){
        return id;
    }
    public void setId(){

        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}