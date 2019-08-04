package designpatterns.adaptor;

interface GermanPlugConnector {

    void giveElectricity();
}

interface UKPlugConnector {

    void provideElectricity();
}

public class AdaptorApp {
    public static void main(String[] args) {
        GermanPlugConnector plugConnector = new GermanPlugConnector() {
            @Override
            public void giveElectricity() {
                System.out.println("GermanPlugConnector");
            }
        };
        UKElectricalSocket ukSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new GermanToUKAdapter(plugConnector);
        ukSocket.plugIn(ukAdapter);
    }
}

class GermanToUKAdapter implements UKPlugConnector {

    GermanPlugConnector plug;

    GermanToUKAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }
}

class GermanElectricalSocket {

    public void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}

class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}