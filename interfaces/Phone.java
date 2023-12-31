package interfaces;

public interface Phone {

    // Constant field/attribute
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // abstract method
    void powerOn();

    void powerOff();

    void volumeUp();

    void volumeDown();
}
