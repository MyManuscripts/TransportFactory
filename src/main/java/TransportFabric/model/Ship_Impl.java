package TransportFabric.model;

import TransportFabric.Transport;

public class Ship_Impl implements Transport {
    @Override
    public void methodMovement() {
        System.out.println("The ship sails on the water");
    }
}
