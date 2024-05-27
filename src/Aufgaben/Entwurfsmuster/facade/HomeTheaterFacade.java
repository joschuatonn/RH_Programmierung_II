package Aufgaben.Entwurfsmuster.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    private String currentMovieName;
    private boolean movieStarted;

    public HomeTheaterFacade() {
        this.currentMovieName = "";
        this.movieStarted = false;

        this.amplifier = new Amplifier();
        this.cdPlayer = new CdPlayer();
        this.dvdPlayer = new DvdPlayer();
        this.popcornPopper = new PopcornPopper();
        this.projector = new Projector();
        this.screen = new Screen();
        this.theaterLights = new TheaterLights();
        this.tuner = new Tuner();
    }

    public void endMovie() {
        if(!this.movieStarted) {
            System.out.println("Kein Film läuft");
            return;
        }

        this.projector.off();
        this.theaterLights.on();
        this.screen.up();
        this.popcornPopper.off();

        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();

        this.amplifier.off();

        this.currentMovieName = "";
        this.movieStarted = false;
    }

    public void startMovie(String name) {
        if(this.movieStarted) {
            System.out.println("Ein Film läuft bereits");
            return;
        }

        this.currentMovieName = name;
        this.movieStarted = true;

        this.popcornPopper.on();
        this.popcornPopper.pop();

        this.theaterLights.dim(1);

        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();

        this.amplifier.on();
        this.amplifier.setVolume(12);
        this.amplifier.setSurroundSound();

        this.dvdPlayer.on();
        this.dvdPlayer.play(name);
        this.amplifier.setDvd(this.dvdPlayer);
    }
}
