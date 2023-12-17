public class Rectangle {
    private Point coinHautGauche;
    private Point coinBasDroite;

    // Constructeur à partir de deux points
    public Rectangle(Point coinHautGauche, Point coinBasDroite) {
        this.coinHautGauche = new Point(coinHautGauche);
        this.coinBasDroite = new Point(coinBasDroite);
    }

    // Méthode pour calculer la surface
    public double calculerSurface() {
        double largeur = Math.abs(coinBasDroite.getX() - coinHautGauche.getX());
        double hauteur = Math.abs(coinBasDroite.getY() - coinHautGauche.getY());
        return largeur * hauteur;
    }

    // Méthode pour calculer le périmètre
    public double calculerPerimetre() {
        double largeur = Math.abs(coinBasDroite.getX() - coinHautGauche.getX());
        double hauteur = Math.abs(coinBasDroite.getY() - coinHautGauche.getY());
        return 2 * (largeur + hauteur);
    }

    // Méthode pour effectuer un zoom
    public void zoom(double deltax, double deltay) {
        double nouvelleLargeur = Math.abs(coinBasDroite.getX() - coinHautGauche.getX()) + deltax;
        double nouvelleHauteur = Math.abs(coinBasDroite.getY() - coinHautGauche.getY()) + deltay;

        coinBasDroite.setX(coinHautGauche.getX() + nouvelleLargeur);
        coinBasDroite.setY(coinHautGauche.getY() + nouvelleHauteur);
    }

    // Méthodes getters et setters
    public Point getCoinHautGauche() {
        return new Point(coinHautGauche);
    }

    public Point getCoinBasDroite() {
        return new Point(coinBasDroite);
    }

    public void setCoinHautGauche(Point coinHautGauche) {
        this.coinHautGauche = new Point(coinHautGauche);
    }

    public void setCoinBasDroite(Point coinBasDroite) {
        this.coinBasDroite = new Point(coinBasDroite);
    }
}