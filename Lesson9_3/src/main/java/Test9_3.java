public class Test9_3 {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launching();
        Shuttle shuttle = new Shuttle();
        shuttle.checkSystems();
        shuttle.start();
        SpaceX spaceX = new SpaceX();
        spaceX.checkSystems();
    }
}