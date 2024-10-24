public class Livre extends Article {
    
    private String editeur ;

    public Livre (String titre, int num, int nb, String auteur, String editeur){
        super( auteur,titre, num, nb);
        this.editeur=editeur;   

    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    @Override
    public void edition() {
        System.out.println("Titre: " + getTitre());
        System.out.println("Numéro d'identification: " + getNum());
        System.out.println("Nombre de pages: " + getNbr());
        System.out.println("Type: livre" );
        System.out.println("Editeur: " + getEditeur());
    }
}