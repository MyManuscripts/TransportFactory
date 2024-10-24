package TransportFabric.factoriesImpl;

import TransportFabric.Transport;
import TransportFabric.TransportFactory;
import TransportFabric.model.Car_Impl;

public class TransportFactory_Car implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car_Impl();
    }
}
