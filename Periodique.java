public class Periodique extends Document {
    private String frequence;

    public Periodique(String titre, int num, int nb, String frequence) {
        super(titre, num, nb); 
        this.frequence = frequence;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    @Override
    public void edition() {
        super.edition(); 
        System.out.println("Type: Periodique" );
        System.out.println("Fréquence de parution: " + getFrequence());
    }
}