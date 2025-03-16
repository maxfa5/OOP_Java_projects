package OOP.Figures;


public class AppTest {
    public static void main(String[] args) {
        TransportationCompany company = new TransportationCompany("Awesome Transport", 10);

        Car car1 = new Car("Toyota", 2020, 100, 200,5,1000000,12.5);
        Truck truck1 = new Truck("Ford", 2022, 160,140,5,10000000,20);
        Bike bike1 = new Bike("Волга", 2000, 40, 1000,6);
        company.appendVehicle(car1);
        company.appendVehicle(truck1);
        company.appendVehicle(bike1);
        System.out.printf("\nКоличество транспорта: %d\n",company.getVehicleCount());
        System.out.printf("Проверка получения эллемента по индексу:\n" );

        System.out.printf("0-:%s\n", company.getVehicle(0).getInfo() );
        System.out.printf("1-:%s\n", company.getVehicle(1).getInfo() );
        System.out.printf("2-:%s\n\n", company.getVehicle(2).getInfo() );
        try {
            System.out.printf("4-:%s\n", company.getVehicle(4).getInfo() );
        } catch (Exception e) {
            System.out.printf("Ошибка отловлена!\n");
        }
        try {
            System.out.printf("-1-:%s\n", company.getVehicle(-1).getInfo() );   
        } catch (Exception e) {
            System.out.printf("Ошибка отловлена!\n");
        }
    }
}