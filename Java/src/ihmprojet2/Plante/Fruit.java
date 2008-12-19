package ihmprojet2.Plante;


public class Fruit {

  
    protected Gout gout = Gout.AUCUN;
    protected String goutName;

    public Fruit () {
    }

    public Gout getGout () {
        return gout;
    }

    public void setGout (Gout val) throws Exception{
        Gout newGout=val;

        if(val==null){newGout=Gout.AUCUN;}
            gout=newGout;

    }

    public java.util.Hashtable getInfos() throws Exception{
        throw new Exception("Non implemented method.");
    }
}

