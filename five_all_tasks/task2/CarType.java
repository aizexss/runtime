package five_all_tasks.task2;

public class CarType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
