package MethodFactory;

public class Car implements VehicleAction{
    @Override
    public void drive() {
        System.out.println("Jazda samochodu");
    }
}
