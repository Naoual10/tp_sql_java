public class TestVoiture {

    public static void main(String[] args) {
        // Création d'une voiture avec un moteur
        Voiture voiture = new Voiture("Toyota", "Camry", 0, "Moteur1", 150);

        // Affichage des informations initiales
        afficherInformations(voiture);

        // Modification de la vitesse
        voiture.setVitesse(60);

        // Affichage des informations après la modification
        afficherInformations(voiture);

        // Changement du moteur
        voiture.changerLeMoteur("Moteur2", 300);

        // Affichage des informations après le changement de moteur
        afficherInformations(voiture);

        // Création d'une roue de secours
        voiture.ajouterRoueDeSecours();

        // Affichage des informations avec la roue de secours
        afficherInformations(voiture);
    }

    // Méthode pour afficher les informations d'une voiture
    private static void afficherInformations(Voiture voiture) {
        System.out.println("Marque: " + voiture.getMarque());
        System.out.println("Modèle: " + voiture.getModele());
        System.out.println("Vitesse: " + voiture.getVitesse());
        System.out.println("Puissance du moteur: " + voiture.deQuellePuissance());
        System.out.println("Nombre de roues: " + voiture.getNombreDeRoues());
        System.out.println("---------------");
    }
}