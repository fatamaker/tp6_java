public class Document {
    private String titre ;
    private int num_idf ;
    private int nb_page ;

   
    public Document (String titre , int num , int nb){
        this.titre=titre;
        this.num_idf=num;
        this.nb_page=nb;
    }
    String getTitre (){
        return titre ;
    }
    void setTitre(String a){
        this.titre=a;
    }
    int getNum (){
        return num_idf ;
    }
    void setNum(int a){
        this.num_idf=a;
    }
    int getNbr (){
        return nb_page ;
    }
    void setNbr(int a){
        this.nb_page=a;
    }
    
    public void edition (){
        System.out.println("le titre :"+getTitre());

        System.out.println("le numero d'identification :"+getNum());
        System.out.println("le nombre de pages :"+getNbr());
    }





}