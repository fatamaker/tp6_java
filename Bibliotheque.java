public class Bibliotheque {
    private  Document[]listdoc ;
    private int nbrdoc ;
    private int maxcap ;

    public Bibliotheque(int maxcap ){
        this.listdoc = new Document[maxcap];
        this.maxcap=maxcap;
        this.nbrdoc=0; 

    }
    int getCapacité () {
        return maxcap;
    }
    public void Ajout_doc (Document d) {
        if (nbrdoc<maxcap){
             listdoc[nbrdoc] = d; 
            nbrdoc++;
            Trier();          
             
        }else {
            System.out.println("Capacité maximale atteinte, impossible d'ajouter d'autres documents.");
                    
        }
       

    }
     public void Trier() {
        boolean test = true;
        while (test) {
            test = false;
            for (int i = 0; i < nbrdoc - 1; i++) {
                if (listdoc[i].getNum()>listdoc[i+1].getNum()) {
                   
                   Document d= listdoc[i];
                    listdoc[i] = listdoc[i+1];
                    listdoc[i+1] = d;
                    test = true;
                }
            }
        }
     }
     public void Supprim_doc (int num){
        int index = -1;
        for (int i = 0; i < nbrdoc - 1; i++) {
                if (listdoc[i].getNum()==num) {
                    index = i;
                    break;
                }
        }
        if (index != -1){
            for (int i =index; i < nbrdoc - 1; i++) {
                listdoc[i]=listdoc[i+1];
            }
            listdoc[nbrdoc - 1] = null; 
            nbrdoc--;     

        }
        else{
             System.out.println("numero non trouvé");
        }              
     }

     public void Inventaire_doc (){
       if (nbrdoc == 0) {
        System.out.println("La bibliothèque est vide.");
      } else {
        System.out.println("l'inventaire des documents dans la bibliothèque :");
        for (int i = 0; i < nbrdoc; i++) {
            System.out.println("Document " + (i + 1) + " :");
            listdoc[i].edition();  
            System.out.println();  
        }
    }
    }

    public int getnbrdoc () {
        return nbrdoc;
    }
    public Bibliotheque liste_livre (){
          Bibliotheque b=new  Bibliotheque (nbrdoc);
         for (int i = 0; i < nbrdoc; i++) {
            if (listdoc[i] instanceof Livre ){
               b.Ajout_doc (listdoc[i]);
            }
        }
        return b;
    }
    public Bibliotheque liste_article (){
        Bibliotheque b=new Bibliotheque (nbrdoc);
         for (int i = 0; i < nbrdoc; i++) {
            if (listdoc[i] instanceof Article ){
               b.Ajout_doc (listdoc[i]);
            }
        }
        return b;
    }
    public Bibliotheque liste_docsimples (){
         Bibliotheque b=new Bibliotheque (nbrdoc);
         for (int i = 0; i < nbrdoc; i++) {
               b.Ajout_doc (listdoc[i]);
        }
        return b;
    }
    public Bibliotheque liste_periodique(){
        Bibliotheque b=new Bibliotheque (nbrdoc);
         for (int i = 0; i < nbrdoc; i++) {
            if (listdoc[i] instanceof Periodique ){
               b.Ajout_doc (listdoc[i]);
            }
        }
        return b;
    }





}