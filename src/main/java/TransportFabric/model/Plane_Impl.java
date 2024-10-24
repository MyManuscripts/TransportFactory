package TransportFabric.model;

import TransportFabric.Transport;

public class Plane_Impl implements Transport {
    @Override
    public void methodMovement() {
        System.out.println("The plane is flying through the air");
    }
}
