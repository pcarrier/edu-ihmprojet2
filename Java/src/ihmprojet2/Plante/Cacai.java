package ihmprojet2.Plante;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B72C8D01-2AE7-57FA-A9DE-80789F571EE2]
// </editor-fold> 
public class Cacai extends Plante {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E7DE90CC-37C4-B43F-7A63-6470A89655DE]
    // </editor-fold> 
    public Cacai () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F28E896E-022C-BE5A-C6EA-B49F534C82EC]
    // </editor-fold> 
    public class Fruit extends ihmprojet2.Plante.Fruit {

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.3A567C1E-46BA-4B5B-35A9-5BFEEB385074]
        // </editor-fold> 
        private int diametre = 0;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.F171C05D-4EE5-F9F3-049D-A0F0AF78D97C]
        // </editor-fold> 
        public Fruit () {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,regenBody=yes,id=DCE.06906ACB-B4B8-B9AC-69FE-986F2A626122]
        // </editor-fold> 
        public int getDiametre () {
            return diametre;
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,regenBody=yes,id=DCE.0EAE50F2-D9F1-1033-6FEC-1F071B527626]
        // </editor-fold> 
        public void setDiametre (int val) {
            this.diametre = val;
        }

    }

}

