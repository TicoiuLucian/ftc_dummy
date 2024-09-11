package ro.ftc.entity;

public enum Country {
  RO("Romania"),
  EN("England"),
  ES("España"),
  IT("Italia"),
  US("USA");

  public final String label;

  private Country(String label) {
    this.label = label;
  }
}
