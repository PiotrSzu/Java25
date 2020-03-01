package Adapter;

public class HdmiImpl implements Hdmi {
    @Override
    public void connect() {
        System.out.println("Sygnał");
    }
}
