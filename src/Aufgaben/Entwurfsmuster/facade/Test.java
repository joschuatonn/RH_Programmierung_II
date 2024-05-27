package Aufgaben.Entwurfsmuster.facade;

public class Test {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.startMovie("Fortnite - THE MOVIE");
        homeTheaterFacade.endMovie();
    }
}
