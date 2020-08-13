package patterns.structural.facade.hometheater;

public class CdPlayer {
    Amplifier amplifier;

    public CdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public CdPlayer() {

    }
}
