public Equipement(int piecesArgent) {
        this.armes = new ArrayList<>();
        this.armures = new ArrayList<>();
        this.piecesArgent = piecesArgent;
        }

public void ajouterArme(Arme arme) {
        this.armes.add(arme);
        }

public void retirerArme(Arme arme) {
        this.armes.remove(arme);
        }

public void ajouterArmure(Armure armure) {
        this.armures.add(armure);
        }

public void retirerArmure(Armure armure) {
        this.armures.remove(armure);
        }

public List<Arme> getArmes() {
        return this.armes;
        }

public List<Armure> getArmures() {
        return this.armures;
        }

public int getPiecesArgent() {
        return this.piecesArgent;
        }

public void ajouterPiecesArgent(int montant) {
        this.piecesArgent += montant;
        }

public void retirerPiecesArgent(int montant) {
        this.piecesArgent -= montant;
        }
public Arme(String nom, String type, int degats, int portee, int cout) {
        this.nom = nom;
        this.type = type;
        this.degats = degats;
        this.portee = portee;
        this.cout = cout;
        }

public String getNom() {
        return nom;
        }

public String getType() {
        return type;
        }

public int getDegats() {
        return degats;
        }

public int getPortee() {
        return portee;
        }

public int getCout() {
        return cout;
        }
