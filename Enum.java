
public enum Caracteristique {
    FORCE, DEXTERITE, CONSTITUTION, INTELLIGENCE, SAGESSE, CHARISME;
}

public final class ScoreDeCaracteristique {
    private final int value;

    public ScoreDeCaracteristique(int value) {
        if (value < 1 || value > 20) {
            throw new IllegalArgumentException("Valeur de caractéristique invalide.");
        }
        this.value = value;
    }

    public int val() {
        return value;
    }

    public int mod() {
        return (value - 10) / 2;
    }
}

public final class Personnage {
    private final String nom;
    private final ScoreDeCaracteristique force;
    private final ScoreDeCaracteristique dexterite;
    private final ScoreDeCaracteristique constitution;
    private final ScoreDeCaracteristique intelligence;
    private final ScoreDeCaracteristique sagesse;
    private final ScoreDeCaracteristique charisme;
    private final int pv;
    private final int initiative;
    private final int defense;
    private final int scoreAttaque;

    private Personnage(String nom, ScoreDeCaracteristique force, ScoreDeCaracteristique dexterite,
                       ScoreDeCaracteristique constitution, ScoreDeCaracteristique intelligence,
                       ScoreDeCaracteristique sagesse, ScoreDeCaracteristique charisme, int pv, int initiative,
                       int defense, int scoreAttaque) {
        this.nom = nom;
        this.force = force;
        this.dexterite = dexterite;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.sagesse = sagesse;
        this.charisme = charisme;
        this.pv = pv;
        this.initiative = initiative;
        this.defense = defense;
        this.scoreAttaque = scoreAttaque;
    }

    public String getNom() {
        return nom;
    }

    public ScoreDeCaracteristique getForce() {
        return force;
    }

    public ScoreDeCaracteristique getDexterite() {
        return dexterite;
    }

    public ScoreDeCaracteristique getConstitution() {
        return constitution;
    }

    public ScoreDeCaracteristique getIntelligence() {
        return intelligence;
    }

    public ScoreDeCaracteristique getSagesse() {
        return sagesse;
    }

    public ScoreDeCaracteristique getCharisme() {
        return charisme;
    }

    public int getPv() {
        return pv;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getDefense() {
        return defense;
    }

    public int getScoreAttaque() {
        return scoreAttaque;
    }

    public static class Builder {
        private final String nom;
        private int forceValue;
        private int dexteriteValue;
        private int constitutionValue;
        private int intelligenceValue;
        private int sagesseValue;
        private int charismeValue;
        private int pvValue;
        private int initiativeValue;
        private int defenseValue;
        private int scoreAttaqueValue;

        public Builder(String nom) {
            this.nom = nom;
            generateRandomValues();
            validateValues();
        }

        private void generateRandomValues() {
            List<Integer> values = new ArrayList<>(Arrays.asList(15, 14, 13, 12, 10, 8));
            Collections.shuffle(values);
            forceValue = values.get(0);

            // make sure the score values are valid
            private void validateValues() {
                if (forceValue < 1 || forceValue > 20) {
                    throw new IllegalArgumentException("Force value must be between 1 and 20");
                }
                if (dexteriteValue < 1 || dexteriteValue > 20) {
                    throw new IllegalArgumentException("Dexterite value must be between 1 and 20");
                }
                if (constitutionValue < 1 || constitutionValue > 20) {
                    throw new IllegalArgumentException("Constitution value must be between 1 and 20");
                }
                if (intelligenceValue < 1 || intelligenceValue > 20) {
                    throw new IllegalArgumentException("Intelligence value must be between 1 and 20");
                }
                if (sagesseValue < 1 || sagesseValue > 20) {
                    throw new IllegalArgumentException("Sagesse value must be between 1 and 20");
                }
                if (charismeValue < 1 || charismeValue > 20) {
                    throw new IllegalArgumentException("Charisme value must be between 1 and 20");
                }
                if (pvValue < 1 || pvValue > 20) {
                    throw new IllegalArgumentException("PV value must be between 1 and 20");
                }
                if (initiativeValue < 0 || initiativeValue > 20) {
                    throw new IllegalArgumentException("Initiative value must be between 0 and 20");
                }
                if (defenseValue < 1 || defenseValue > 20) {
                    throw new IllegalArgumentException("Defense value must be between 1 and 20");
                }
                if (scoreAttaqueValue < 1 || scoreAttaqueValue > 20) {
                    throw new IllegalArgumentException("Score d'attaque must be between 1 and 20");
                }
            }

            public Builder setForceValue(int forceValue) {
                this.forceValue = forceValue;
                return this;
            }

            public Builder setDexteriteValue(int dexteriteValue) {
                this.dexteriteValue = dexteriteValue;
                return this;
            }

            public Builder setConstitutionValue(int constitutionValue) {
                this.constitutionValue = constitutionValue;
                return this;
            }

            public Builder setIntelligenceValue(int intelligenceValue) {
                this.intelligenceValue = intelligenceValue;
                return this;
            }

            public Builder setSagesseValue(int sagesseValue) {
                this.sagesseValue = sagesseValue;
                return this;
            }

            public Builder setCharismeValue(int charismeValue) {
                this.charismeValue = charismeValue;
                return this;
            }

            public Builder setPvValue(int pvValue) {
                this.pvValue = pvValue;
                return this;
            }

            public Builder setInitiativeValue(int initiativeValue) {
                this.initiativeValue = initiativeValue;
                return this;
            }

            public Builder setDefenseValue(int defenseValue) {
                this.defenseValue = defenseValue;
                return this;
            }

            public Builder setScoreAttaqueValue(int scoreAttaqueValue) {
                this.scoreAttaqueValue = scoreAttaqueValue;
                return this;
            }

            public Personnage build() {
                ScoreDeCaracteristique force = new ScoreDeCaracteristique(Caracteristique.FORCE, forceValue);
                ScoreDeCaracteristique dexterite = new ScoreDeCaracteristique(Caracteristique.DEXTERITE, dexteriteValue);
                ScoreDeCaracteristique constitution = new ScoreDeCaracteristique(Caracteristique.CONSTITUTION, constitutionValue);
                ScoreDeCaracteristique intelligence = new ScoreDeCaracteristique(Caracteristique.INTELLIGENCE, intelligenceValue);
                ScoreDeCaracteristique sagesse = new ScoreDeCaracteristique(Caracteristique.SAGESSE, sagesseValue);
                ScoreDeCaracteristique charisme = new ScoreDeCaracteristique(Caracteristique.CHARISME, charismeValue);

                return new Personnage(nom, force, dexterite, constitution, intelligence, sagesse, charisme, pvValue, initiativeValue,
                        defenseValue, scoreAttaqueValue);
            }
