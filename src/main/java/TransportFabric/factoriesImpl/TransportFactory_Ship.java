package TransportFabric.factoriesImpl;

import TransportFabric.Transport;
import TransportFabric.TransportFactory;
import TransportFabric.model.Car_Impl;
import TransportFabric.model.Ship_Impl;

public class TransportFactory_Ship implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Ship_Impl();
    }
}
