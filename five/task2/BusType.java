package five.task2;

public class BusType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
