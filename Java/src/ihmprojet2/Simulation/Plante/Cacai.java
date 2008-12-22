package ihmprojet2.Simulation.Plante;

public class Cacai extends Plante {

    private CacaiFruit fruit = new CacaiFruit();

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
        Cacai.updateEtats();
        return etats;
    }

    private static Cacai jour1() {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if (qtCroiss > 35) {
            p.setGermee(true);
        }
        return p;
    }

    private static Cacai jour2() {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
       
        if (qtCroiss > 20) {
            p.setGermee(true);
        }
        if (qtCroiss > 60) {
            p.setTaille(0.5);
        }
        return p;
    }

    private static Cacai jour3() {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if (qtCroiss > 20) {
            p.setGermee(true);
        }
        if (qtCroiss > 35) {
            p.setTaille(0.5);
        }
        return p;
    }

    private static Cacai jour4() throws Exception {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if (qtCroiss > 20) {
            p.setGermee(true);
            p.setTaille(0.5);
        }
        if (qtCroiss > 35) {
            p.setTaille(1);
             p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.5);
        }
        if (qtCroiss > 60) {
            p.getFruit().setDiametre(0.3);
        }
        return p;
    }

    private static Cacai jour5() throws Exception {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 20) && (qtCroiss <=35)) {
            p.setGermee(true);
            p.setTaille(1);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.5);
        }
        if ((qtCroiss > 35) && (qtCroiss <= 60)) {
            p.setTaille(2);
            p.getFruit().setDiametre(1);
        }
        if (qtCroiss > 60) {
            p.getFruit().setDiametre(0.2);
        }
        return p;
    }

    private static Cacai jour6() throws Exception {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 20) && (qtCroiss <= 35)) {
            p.setGermee(true);
            p.setTaille(2);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(1);
        }

        if ((qtCroiss > 35) && (qtCroiss <= 60)){
            p.setTaille(2.5);
            p.getFruit().setGout(Gout.SUCRE);
            p.getFruit().setDiametre(1);
        }
        if (qtCroiss > 60) {
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
            p.getFruit().setDiametre(0);
        }
        return p;
    }

    private static Cacai jour7() throws Exception {
        Cacai p = new Cacai();
        double qtCroiss = Tomatito.environnement.getQualiteCroissance();
        if ((qtCroiss > 20) && (qtCroiss <= 35)) {
            p.setGermee(true);
            p.setTaille(2.5);
            p.getFruit().setGout(Gout.SUCRE);
            p.getFruit().setDiametre(1);
        }
        if ((qtCroiss > 35) && (qtCroiss <= 60)) {
            p.setTaille(3);
            p.getFruit().setGout(Gout.SUCRE);
            p.getFruit().setDiametre(1.5);
        }
        if (qtCroiss > 60) {
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
            p.getFruit().setDiametre(0);
        }
        return p;
    }

    public Cacai() {
        fruit = new CacaiFruit();
    }

    @Override
    public CacaiFruit getFruit() {
        return this.fruit;
    }

    public class CacaiFruit extends ihmprojet2.Simulation.Plante.Fruit {

        @Override
        public String getDescription() {
            if ((gout == Gout.AUCUN) && (diametre == 0.0)) {
                return "Aucun";
            } else {
                return "" + Gout.getGoutName(gout) + ", " + diametre + "mm";
            }
        }
    }
}