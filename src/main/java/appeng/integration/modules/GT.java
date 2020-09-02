package appeng.integration.modules;

import appeng.api.AEApi;
import appeng.helpers.Reflected;
import appeng.integration.IIntegrationModule;
import appeng.integration.IntegrationHelper;
import appeng.integration.IntegrationRegistry;
import appeng.integration.IntegrationType;

public class GT implements IIntegrationModule {

    @Reflected
    public static GT instance;

    @Reflected
    public GT()
    {
        IntegrationHelper.testClassExistence( this, gregtech.api.interfaces.tileentity.IEnergyConnected.class );
    }

    @Override
    public void init() throws Throwable {
        if( IntegrationRegistry.INSTANCE.isEnabled( IntegrationType.GT ) )
        {
            AEApi.instance().partHelper().registerNewLayer(
                    "appeng.parts.layers.LayerIEnergyConnected",
                    "gregtech.api.interfaces.tileentity.IEnergyConnected");

        }
    }

    @Override
    public void postInit() {
    }
}
