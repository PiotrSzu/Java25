package MethodFactory;

public class Main {
    public static void main(String[] args) {

        VehicleAction car = VehicleFactory.getType(VehicleType.CAR);
        if (car != null) {
            car.drive();
        } else {
            System.out.println("Nie pojedzie ");
        }

        VehicleAction quad = VehicleFactory.getType(VehicleType.QUAD);
        if(quad != null){
            quad.drive();
        }else
            System.out.println("Nie wyjedzie");

        VehicleAction moto = VehicleFactory.getType(VehicleType.MOTORCYCLE);
        if(moto != null){
            moto.drive();
        }else
            System.out.println("Nie wyjedzie");
    }
}