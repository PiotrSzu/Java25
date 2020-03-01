package MethodFactory;

public class Motorcycle  implements VehicleAction{
    @Override
    public void drive() {
        System.out.println("Jazda motocykla");
    }
}
