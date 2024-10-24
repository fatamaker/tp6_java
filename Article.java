public class Article extends Document {
   
    private String auteur ;

    public Article (String auteur,String titre , int num , int nb){
        super(titre,num,nb);
       
        this.auteur=auteur;   
    }
     public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    @Override
    public void edition() {
        super.edition(); 
        System.out.println("Type: Article" );
        System.out.println("Auteur: " + getAuteur());
    }

} 