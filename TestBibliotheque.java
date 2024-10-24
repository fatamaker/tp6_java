public class TestBibliotheque {

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque(10);

        Document doc1 = new Document("Document 1", 3, 50);
        Livre doc2 = new Livre("Les Misérables", 1, 1232, "Victor Hugo", "Gallimard");
        Article doc3 = new Article( "Bloomsbury","Article scientifique", 2, 30);
        Periodique doc4 = new Periodique("Journal Mensuel", 4, 40, "Mensuel");
        Document doc5 = new Document("Document 2", 5, 60);
        Livre doc6 = new Livre("harry potter", 6, 200, "jk", "Folio junior");

        bibliotheque.Ajout_doc(doc1);
        bibliotheque.Ajout_doc(doc2);
        bibliotheque.Ajout_doc(doc3);
        bibliotheque.Ajout_doc(doc4);
        bibliotheque.Ajout_doc(doc5);
        bibliotheque.Ajout_doc(doc6);


        System.out.println("Tous les documents dans la bibliothèque :");
        bibliotheque.Inventaire_doc ();

        Bibliotheque livres = bibliotheque.liste_livre();
        System.out.println("\nBibliothèque contenant uniquement des livres :");
        livres.Inventaire_doc();

        Bibliotheque articles = bibliotheque.liste_article();
        System.out.println("\nBibliothèque contenant uniquement des articles :");
        articles.Inventaire_doc();

        Bibliotheque docsSimples = bibliotheque.liste_docsimples();
        System.out.println("\nBibliothèque contenant uniquement des documents simples :");
        docsSimples.Inventaire_doc();

        System.out.println("\nSuppression du document avec numéro d'identification 1.");
        bibliotheque.Supprim_doc(1);

        System.out.println("\nInventaire après suppression :");
        bibliotheque.Inventaire_doc();
    }

    
    
}