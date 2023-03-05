public class Armure {
    private final String nom;
    private final int classeArmure;
    private final int bonusDexteriteMax;
    private final int malusVitesse;
    private final int prix;

    public Armure(String nom, int classeArmure, int bonusDexteriteMax, int malusVitesse, int prix) {
        this.nom = nom;
        this.classeArmure = classeArmure;
        this.bonusDexteriteMax = bonusDexteriteMax;
        this.malusVitesse = malusVitesse;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getClasseArmure() {
        return classeArmure;
    }

    public int getBonusDexteriteMax() {
        return bonusDexteriteMax;
    }

    public int getMalusVitesse() {
        return malusVitesse;
    }

    public int getPrix() {
        return prix;
    }

    public static class Builder {
        private String nom;
        private int classeArmure;
        private int bonusDexteriteMax;
        private int malusVitesse;
        private int prix;

        public Builder(String nom, int classeArmure) {
            this.nom = nom;
            this.classeArmure = classeArmure;
        }

        public Builder bonusDexteriteMax(int bonusDexteriteMax) {
            this.bonusDexteriteMax = bonusDexteriteMax;
            return this;
        }

        public Builder malusVitesse(int malusVitesse) {
            this.malusVitesse = malusVitesse;
            return this;
        }

        public Builder prix(int prix) {
            this.prix = prix;
            return this;
        }

        public Armure build() {
            return new Armure(nom, classeArmure, bonusDexteriteMax, malusVitesse, prix);
        }
    }
}
