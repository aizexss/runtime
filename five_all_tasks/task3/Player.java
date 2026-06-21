package five_all_tasks.task3;

import five_all_tasks.task3.weapon.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new RPG(),
                new Pistol(),
                new BigGun(),
                new Slingshot(),
                new WaterPistol(),
                new AssaultRifle()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if (slot > weaponSlots.length) {
            System.out.println("Slot " + slot + " is full");
        }
        // Получаем оружие из выбранного слота
        else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}