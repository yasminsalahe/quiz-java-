public class Question {
    private String texte;
    private String bonneReponse;

    public Question(String texte, String bonneReponse) {
        this.texte = texte;
        this.bonneReponse = bonneReponse;
    }

    public String getTexte() {
        return texte;
    }

    public boolean verifierReponse(String reponse) {
        return bonneReponse.equalsIgnoreCase(reponse.trim());
    }
}