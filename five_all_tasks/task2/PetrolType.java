package five_all_tasks.task2;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
