package five_all_tasks.task2;

public class WagonType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
