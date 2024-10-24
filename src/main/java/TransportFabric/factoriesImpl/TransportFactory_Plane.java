package TransportFabric.factoriesImpl;

import TransportFabric.Transport;
import TransportFabric.TransportFactory;
import TransportFabric.model.Plane_Impl;

public class TransportFactory_Plane implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane_Impl();
    }
}
