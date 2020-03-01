package MethodFactory;

public abstract class VehicleFactory {
    public static VehicleAction getType (VehicleType name){
            VehicleAction vehicle = null;
            switch (name) {
                case CAR:
                    vehicle = new Car();
                    break;
                case QUAD:
                    vehicle = new Quad();
                    break;
                case MOTORCYCLE:
                    vehicle = new Motorcycle();
                    break;
            }
            return vehicle;
        }
}
