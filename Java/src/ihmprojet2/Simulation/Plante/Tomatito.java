package ihmprojet2.Simulation.Plante;

public class Tomatito extends Plante {

    private TomatitoFruit fruit = new TomatitoFruit();

    public static void updateEtats() throws Exception {

        etats[0] = jour1();
        etats[1] = jour2();
        etats[2] = jour3();
        etats[3] = jour4();
        etats[4] = jour5();
        etats[5] = jour6();
        etats[6] = jour7();

    }

    public static Plante[] getEtats() throws Exception {
        Tomatito.updateEtats();
        return etats;

    }

    private static Tomatito jour1() {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if (qtCroiss > 30) {
            p.setGermee(true);
        }
        return p;
    }

    private static Tomatito jour2() {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 50)) {
            p.setGermee(true);
        }
        if (qtCroiss > 50) {
            p.setTaille(1.0);
        }
        return p;
    }

    private static Tomatito jour3() {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 30)) {
            p.setGermee(true);
        }
        if ((qtCroiss > 30) && (qtCroiss <= 50)) {
            p.setTaille(1);
        }
        if (qtCroiss > 50) {
            p.setTaille(2);
        }
        return p;
    }

    private static Tomatito jour4() {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 30)) {
            p.setGermee(true);
            p.setTaille(1);
        }
        if ((qtCroiss > 30) && (qtCroiss <= 50)) {
            p.setTaille(2);
        }
        if (qtCroiss > 50) {
            p.setTaille(4);
        }
        return p;
    }

    private static Tomatito jour5() throws Exception {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 30)) {
            p.setGermee(true);
            p.setTaille(2);
        }
        if ((qtCroiss > 30) && (qtCroiss <= 50)) {
            p.setTaille(3);
            p.getFruit().setCouleur(Couleur.VERT);
            p.getFruit().setGout(Gout.ACIDULE);
        }
        if (qtCroiss > 50) {
            p.setTaille(6);
            p.getFruit().setCouleur(Couleur.MARRON);
            p.getFruit().setGout(Gout.FADE);
        }
        return p;
    }

    private static Tomatito jour6() throws Exception {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 30)) {
            p.setGermee(true);
            p.setTaille(3);
            p.getFruit().setCouleur(Couleur.VERT);
            p.getFruit().setGout(Gout.ACIDULE);
        }
        if ((qtCroiss > 30) && (qtCroiss <= 50)) {
            p.setTaille(4);
            p.getFruit().setCouleur(Couleur.ROUGE);
            p.getFruit().setGout(Gout.ACIDULE);
        }
        if (qtCroiss > 50) {
            p.setVivante(false);
            p.getFruit().setCouleur(Couleur.AUCUNE);
            p.getFruit().setGout(Gout.AUCUN);
        }
        return p;
    }

    private static Tomatito jour7() throws Exception {
        Tomatito p = new Tomatito();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 15) && (qtCroiss <= 30)) {
            p.setGermee(true);
            p.setTaille(4);
            p.getFruit().setCouleur(Couleur.ROUGE);
            p.getFruit().setGout(Gout.ACIDULE);
        }
        if ((qtCroiss > 30) && (qtCroiss <= 50)) {
            p.setTaille(5);
            p.getFruit().setCouleur(Couleur.MARRON);
            p.getFruit().setGout(Gout.FADE);
        }
        if (qtCroiss > 50) {
            p.setVivante(false);
            p.getFruit().setCouleur(Couleur.AUCUNE);
            p.getFruit().setGout(Gout.AUCUN);
        }
        return p;
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        try {
            Tomatito.updateEtats();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Fruit getFruit() {
        return fruit;
    }

    public class TomatitoFruit extends ihmprojet2.Simulation.Plante.Fruit {
        @Override
        public String getDescription() {
            return "" + Couleur.getCouleurName(couleur) + ", " + Gout.getGoutName(gout);
        }
    }
}

