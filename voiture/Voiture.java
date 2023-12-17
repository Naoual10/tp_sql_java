public class Voiture {
        private String marque;
        private String modèle;
        private double vitesse;
        private Moteur moteur;
        private Roue[] les4Roues;
        private Roue roueDeSecours;

        public Voiture(String marque, String modèle, double vitesse, String nomMoteur, int puissanceMoteur) {
            this.marque = marque;
            this.modèle = modèle;
            this.vitesse = vitesse;
            this.moteur = new Moteur(nomMoteur, puissanceMoteur);

            this.les4Roues = new Roue[4];
            for (int i = 0; i < 4; i++) {
                this.les4Roues[i] = new Roue();
            }

            this.roueDeSecours = null;
        }

        public String getMarque() {
            return marque;
        }

        public String getModele() {
            return modèle;
        }

        public double getVitesse() {
            return vitesse;
        }

        public void setVitesse(double vitesse) {
            this.vitesse = vitesse;
        }

        public Moteur getMoteur() {
            return moteur;
        }

        public int deQuellePuissance() {
            return moteur.getPuissance();
        }

        public void changerLeMoteur(String nomMoteur, int puissanceMoteur) {
            System.out.println("Changement du moteur");
            this.moteur = new Moteur(nomMoteur, puissanceMoteur);
        }

        public int getNombreDeRoues() {
            return (les4Roues.length + (roueDeSecours != null ? 1 : 0));
        }

        public void ajouterRoueDeSecours() {
            if (roueDeSecours == null) {
                roueDeSecours = new Roue();
                System.out.println("Roue de secours ajoutée");
            } else {
                System.out.println("La voiture a déjà une roue de secours");
            }
        }
    

    public static class Moteur {
        private String nom;
        private int puissance;

        public Moteur(String nom, int puissance) {
            this.nom = nom;
            this.puissance = puissance;
        }

        public int getPuissance() {
            return puissance;
        }
    }

   public static  class Roue {
        // Les détails de la classe Roue peuvent être ajoutés ici
    }
}