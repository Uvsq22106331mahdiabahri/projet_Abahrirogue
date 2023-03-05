public class Personnage {
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
        private String nom;
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
            dexteriteValue = values.get(1);
            constitutionValue = values.get(2);
            intelligenceValue = values.get(3);
            sagesseValue = values.get(4);
            charismeValue = values.get(5);
            pvValue = 10 + (int) (Math.random() * 11);
            initiativeValue = (int) (Math.random() * 21);
            defenseValue = 10 + dexteriteValue + (int) (Math.random() * 3);
            scoreAttaqueValue = 2 + forceValue + (int) (Math.random() * 3
