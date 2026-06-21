package five_all_tasks.task2;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
