package ihmprojet2.Simulation;


public enum DegresLumiere {
    OBSCURITE (3),
    INDIRECTE (2),
    DIRECTE(1);

    int value;

    DegresLumiere(int value){
    this.value=value;
    }

    int value() {
        return this.value;
    }
}

