package TransportFabric.model;

import TransportFabric.Transport;

public class Car_Impl implements Transport {
    @Override
    public void methodMovement() {
        System.out.println("The car is driving on the road");
    }
}
