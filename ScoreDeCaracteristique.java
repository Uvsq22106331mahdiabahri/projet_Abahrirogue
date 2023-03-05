public ScoreDeCaracteristique(Caracteristique caracteristique, int value) {
        if (value < 1 || value > 20) {
        throw new IllegalArgumentException("La valeur de la caractéristique doit être comprise entre 1 et 20 inclus.");
        }
        this.caracteristique = caracteristique;
        this.value = value;
        }

public int val() {
        return value;
        }

public int mod() {
        return (value - 10) / 2;
        }

public Caracteristique getCaracteristique() {
        return caracteristique;
        }
