public class TestRectangle {
    public static void main(String[] args) {
        // Création de deux points pour définir un rectangle
        Point pointHautGauche = new Point(1, 4);
        Point pointBasDroite = new Point(6, 1);

        // Création du rectangle
        Rectangle rectangle = new Rectangle(pointHautGauche, pointBasDroite);

        // Affichage des caractéristiques initiales
        afficherCaracteristiques(rectangle);

        // Effectuer un zoom
        rectangle.zoom(2, 1);

        // Affichage des caractéristiques après le zoom
        afficherCaracteristiques(rectangle);

        // Modifier les points pour redéfinir le rectangle
        Point nouveauPointHautGauche = new Point(0, 3);
        Point nouveauPointBasDroite = new Point(5, 0);

        rectangle.setCoinHautGauche(nouveauPointHautGauche);
        rectangle.setCoinBasDroite(nouveauPointBasDroite);

        // Affichage des caractéristiques après la modification
        afficherCaracteristiques(rectangle);
    }

    // Méthode utilitaire pour afficher les caractéristiques d'un rectangle
    private static void afficherCaracteristiques(Rectangle rectangle) {
        System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
        System.out.println("Périmètre du rectangle : " + rectangle.calculerPerimetre());
        System.out.println("Coin Haut Gauche : (" + rectangle.getCoinHautGauche().getX() + ", " +
                rectangle.getCoinHautGauche().getY() + ")");
        System.out.println("Coin Bas Droite : (" + rectangle.getCoinBasDroite().getX() + ", " +
                rectangle.getCoinBasDroite().getY() + ")\n");
    }
}