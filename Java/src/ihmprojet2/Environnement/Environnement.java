
package ihmprojet2.Environnement;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3D15242E-F80F-BF3E-8E30-EC60B3D5ACEF]
// </editor-fold> 
public class Environnement {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35AD697F-9AB8-CFF6-E186-8B924C1A7372]
    // </editor-fold> 
    public Environnement () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A50E0B7C-7161-4E41-CFB0-F02796AB9E5F]
    // </editor-fold> 
    public class Terre {

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.F112A1D2-92B0-1312-FD35-307A19AF497A]
        // </editor-fold> 
        private bool engrais;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.1CF8BBA5-170B-DCBD-C339-1C873B4D58CC]
        // </editor-fold> 
        public Terre () {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,regenBody=yes,id=DCE.EA4D23E1-3B9A-C397-9E78-A43774C1F909]
        // </editor-fold> 
        public bool isEngrais () {
            return engrais;
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,regenBody=yes,id=DCE.6BFA3C2B-390F-99F3-A363-656AD58B684E]
        // </editor-fold> 
        public void setEngrais (bool val) {
            this.engrais = val;
        }

    }

//    private Eau eau;
//    private Terre terre;
//    private Climat climat;
//
//    public Climat getClimat() {
//        return climat;
//    }
//
//    public void setClimat(Climat climat) {
//        this.climat = climat;
//    }
//
//    public void setEau(Eau eau) {
//        this.eau = eau;
//    }
//
//    public void setTerre(Terre terre) {
//        this.terre = terre;
//    }
//
//    public Eau getEau() {
//        return eau;
//    }
//
//    public Terre getTerre() {
//        return terre;
//    }
//
//    public Environnement(Eau eau, Terre terre, Climat climat) {
//        this.eau = eau;
//        this.terre = terre;
//        this.climat = climat;
//    }

}

