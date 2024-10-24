package TransportFabric;

import TransportFabric.factoriesImpl.TransportFactory_Car;
import TransportFabric.factoriesImpl.TransportFactory_Plane;
import TransportFabric.factoriesImpl.TransportFactory_Ship;
import TransportFabric.model.Car_Impl;

public class Program {
    public static void main(String[] args) {
        TransportFactory transportFactory = transportSpecialty("Car");
        Transport transport = transportFactory.createTransport();
        transport.methodMovement();
    }

    static TransportFactory transportSpecialty(String specialty){
        if (specialty.equalsIgnoreCase("car")){
            return new TransportFactory_Car();
        } else if (specialty.equalsIgnoreCase("plane")) {
            return new TransportFactory_Plane();
        }else if (specialty.equalsIgnoreCase("ship")){
            return new TransportFactory_Ship();
        }else {
            throw new RuntimeException(specialty + " - this specialty not found");
        }
    }
}

