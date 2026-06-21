package five_all_tasks.task2;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
