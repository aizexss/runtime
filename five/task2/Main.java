package five.task2;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", 123, new SedanType(),
                new PetrolType(), new TruckType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", 45, new PickupType(),
                new DieselType(), new TruckType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL
        // и отфильтруйте объявления с бензиновым топливом
        VehicleAd toyotaAd = new VehicleAd(
                "Toyota",
                100,
                new SedanType(),
                new PetrolType(),
                new CarType()
        );

        adsService.setAdList(new VehicleAd[] {
                volvoAd,
                kamazAd,
                toyotaAd
        });

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
