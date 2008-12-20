package ihmprojet2.Plante;

import ihmprojet2.Simulation.DegresLumiere;
import ihmprojet2.Simulation.Environnement;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;


public class Cacai extends Plante implements PropertyChangeListener {
    private Fruit fruit=null;
    public static ArrayList etats=new ArrayList(7);

    public static void updateEtats() throws Exception{
         DegresLumiere vraieLumiere=Environnement.getInstance().getClimat().getLumiere();
         //Si on a tomatito comme voisin
        if(Environnement.getInstance().containsTomatito()){
            Environnement.getInstance().getClimat().reduitLumiere();
            Environnement.getInstance().updateQualiteCroissance();
        }

        etats.add(jour1());
        etats.add(jour2());
        etats.add(jour3());
        etats.add(jour4());
        etats.add(jour5());
        etats.add(jour6());
        etats.add(jour7());


         if(Environnement.getInstance().containsTomatito()){
             Environnement.getInstance().getClimat().setVraieLumiere(vraieLumiere);
         }
    }

    private static Cacai jour1()
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if(qtCroiss>35){
            p.setGermee(true);
        }
        return p;
    }


    private static Cacai jour2()
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
        }
        if(qtCroiss>60){
            p.setTaille(0.5);
        }
        return p;
    }

    private static Cacai jour3()
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
        }
        if(qtCroiss>35){
            p.setTaille(0.5);
        }
        return p;
    }

     private static Cacai jour4() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss =Environnement.getInstance().getQualiteCroissance();
        if(qtCroiss>20){
            p.setGermee(true);
            p.setTaille(0.5);
        }
        if(qtCroiss>35){
            p.setTaille(1);
        }
        if(qtCroiss>60){
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.3);
        }
        return p;
    }

       private static Cacai jour5() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(1);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(0.5);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(2);
             p.getFruit().setDiametre(1);
        }
        if(qtCroiss>60){
           p.getFruit().setDiametre(0.2);
        }
        return p;
    }

        private static Cacai jour6() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(2);
            p.getFruit().setGout(Gout.AMER);
            p.getFruit().setDiametre(1);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(2.5);
             p.getFruit().setGout(Gout.SUCRE);
             p.getFruit().setDiametre(1);
        }
        if(qtCroiss>60){
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
           p.getFruit().setDiametre(0);
        }
        return p;
    }



  private static Cacai jour7() throws Exception
   {
        Cacai p = new Cacai();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>20)&&(qtCroiss>35)){
            p.setGermee(true);
            p.setTaille(2.5);
            p.getFruit().setGout(Gout.SUCRE);
            p.getFruit().setDiametre(1);
        }
        if((qtCroiss>35)&&(qtCroiss>60)){
             p.setTaille(3);
             p.getFruit().setGout(Gout.SUCRE);
             p.getFruit().setDiametre(1.5);
        }
        if(qtCroiss>60){
            p.setVivante(false);
            p.getFruit().setGout(Gout.AUCUN);
           p.getFruit().setDiametre(0);
        }
        return p;
    }

        
        
    public Cacai () {
        fruit = new Fruit();

    }

    @Override
    public Cacai.Fruit getFruit(){
        return this.fruit;
        }

    public class Fruit extends ihmprojet2.Plante.Fruit {

        private double diametre = 0;

        public Fruit () {
        }

        public double getDiametre () {
            return diametre;
        }

        public void setDiametre (double val) {
            diametre=val;
        }

        
        @Override
        public void setGout(Gout val) throws Exception {
            switch (val) {
                case FADE:
                case AMER:
                case ACIDULE:
                    super.setGout(val);
                    break;
                default:
                    throw new Exception("Le gout " + Gout.getGoutName(val) + "n'est " +
                            "pas autorisé pour Cacai.");
            }

        }

         @Override
         public java.util.Hashtable getInfos(){
                java.util.Hashtable retour = new java.util.Hashtable();
                retour.put("GOUT", this.gout);
                retour.put("DIAM", ""+this.diametre);
                //retour.put("couleur", ""+null);

             return retour;
        }
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt){
        try{
         Cacai.updateEtats();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

