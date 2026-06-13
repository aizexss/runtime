package five.task2;

public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Some of vehicle name";
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
