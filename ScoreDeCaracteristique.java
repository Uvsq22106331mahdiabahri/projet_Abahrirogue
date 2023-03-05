public class ScoreDeCaracteristique {
    private final int valeur;

    public ScoreDeCaracteristique(int valeur) {
        if (valeur < 3 || valeur > 18) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 3 et 18 inclus");
        }
        this.valeur = valeur;
    }

    public int val() {
        return valeur;
    }

    public int mod() {
        return (valeur - 10) / 2;
    }
}
