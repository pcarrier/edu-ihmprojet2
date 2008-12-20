package ihmprojet2.Plante;

import ihmprojet2.Simulation.Environnement;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;


public class Tomatito extends Plante {
    private Fruit fruit;
   

    public static void updateEtats() throws Exception{
      
        
        etats.add(jour1());
        etats.add(jour2());
        etats.add(jour3());
        etats.add(jour4());
        etats.add(jour5());
        etats.add(jour6());
        etats.add(jour7());
  
    }


   private static Tomatito jour1()
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if(qtCroiss>30){
            p.setGermee(true);
        }
        return p;
    }



   private static Tomatito jour2()
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=50)){
            p.setGermee(true);
        }
        if(qtCroiss>50){
            p.setTaille(1.0);
        }
        return p;
    }

   private static Tomatito jour3()
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=30)){
            p.setGermee(true);
        }
        if((qtCroiss>30)&&(qtCroiss<=50)){
            p.setTaille(1);
        }
        if(qtCroiss>50){
            p.setTaille(2);
        }
        return p;
    }


    private static Tomatito jour4()
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=30)){
            p.setGermee(true);
            p.setTaille(1);
        }
        if((qtCroiss>30)&&(qtCroiss<=50)){
           p.setTaille(2);
        }
        if(qtCroiss>50){
            p.setTaille(4);
        }
        return p;
    }



    private static Tomatito jour5() throws Exception
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=30)){
            p.setGermee(true);
            p.setTaille(2);
        }
        if((qtCroiss>30)&&(qtCroiss<=50)){
           p.setTaille(3);
           p.getFruit().setCouleur(Couleur.VERT);
           p.getFruit().setGout(Gout.ACIDULE);
        }
        if(qtCroiss>50){
            p.setTaille(6);
            p.getFruit().setCouleur(Couleur.MARRON);
           p.getFruit().setGout(Gout.FADE);
        }
        return p;
    }



    private static Tomatito jour6() throws Exception
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=30)){
            p.setGermee(true);
            p.setTaille(3);
            p.getFruit().setCouleur(Couleur.VERT);
            p.getFruit().setGout(Gout.ACIDULE);
        }
        if((qtCroiss>30)&&(qtCroiss<=50)){
           p.setTaille(4);
           p.getFruit().setCouleur(Couleur.ROUGE);
           p.getFruit().setGout(Gout.ACIDULE);
        }
        if(qtCroiss>50){
            p.setVivante(false);
            p.getFruit().setCouleur(Couleur.AUCUNE);
            p.getFruit().setGout(Gout.AUCUN);
        }
        return p;
    }

    private static Tomatito jour7() throws Exception
   {
        Tomatito p = new Tomatito();
        double qtCroiss = Environnement.getInstance().getQualiteCroissance();
        if((qtCroiss>15)&&(qtCroiss<=30)){
            p.setGermee(true);
            p.setTaille(4);
           p.getFruit().setCouleur(Couleur.ROUGE);
           p.getFruit().setGout(Gout.ACIDULE);
        }
        if((qtCroiss>30)&&(qtCroiss<=50)){
           p.setTaille(5);
           p.getFruit().setCouleur(Couleur.MARRON);
           p.getFruit().setGout(Gout.FADE);
        }
        if(qtCroiss>50){
            p.setVivante(false);
            p.getFruit().setCouleur(Couleur.AUCUNE);
            p.getFruit().setGout(Gout.AUCUN);
        }
        return p;
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt){
        try {
            Tomatito.updateEtats();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Tomatito () {
        fruit= new Fruit();
    }
    @Override
    public Fruit getFruit(){
        return fruit;
    }

    public class Fruit extends ihmprojet2.Plante.Fruit {

        private Couleur couleur=Couleur.AUCUNE;

        public Fruit () {
        }

        public Couleur getCouleur () {
            return null;
        }

        public void setCouleur (Couleur val) {
        }

        @Override
        public void setGout(Gout val) throws Exception {
            switch (val) {
                case SUCRE:
                case AMER:
                    this.gout=val;
                    break;
                default:
                    throw new Exception("Le gout " + Gout.getGoutName(val) + "n'est " +
                            "pas autorisé pour Tomatito.");
            }

        }

       @Override
       public java.util.Hashtable getInfos()
        {
            java.util.Hashtable retour = new java.util.Hashtable();
            retour.put("GOUT", this.gout);
            retour.put("COUL", this.couleur);
            return retour;
        }
    }

}

