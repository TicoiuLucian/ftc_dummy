package ro.ftc.entity;

public enum Country {
    RO("Romania"),
    EN("England"),
    ES("Espana"),
    IT("Italia"),
    US("USA");

    public final String label;

    private Country(String label){
        this.label = label;
    }
}
