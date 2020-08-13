package patterns.structural.facade.hometheater;

public interface AbstractHomeTheaterFacade {
    public void watchMovie(String movie);

    public void endMovie();

    public void listenToCd();

    public void endCd();

    public void listenToRadio();

    public void endRadio();
}
