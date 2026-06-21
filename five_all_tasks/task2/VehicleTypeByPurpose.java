package five_all_tasks.task2;

public class VehicleTypeByPurpose extends VehicleType {

    public VehicleTypeByPurpose() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        VehicleTypeByPurpose other = (VehicleTypeByPurpose) obj;
        return attribute != null ? attribute.equals(other.attribute) : false;
    }
}
