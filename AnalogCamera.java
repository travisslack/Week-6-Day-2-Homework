class AnalogCamera implements Printable{

  private String model;
  private int serialNumber;

  public AnalogCamera(String model, int serialNumber) {
    this.model = model;
    this.serialNumber = serialNumber;
  }

  public String printDetails() {
    return (this.model + " | " + this.serialNumber );
  }

}