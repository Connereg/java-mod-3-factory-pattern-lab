public class Photographer {
    private Camera cameraUsed;
    private String name;


    //CONSTRUCTOR
    public Photographer(String name, Camera cameraUsed) {
        this.name = name;
        this.cameraUsed = cameraUsed;

    }

    // PHOTOGRAPH METHODS
    // NO RETURN VALUE NEEDED, camera.takePhotograph has a console return implied
    public void takePhotograph() {
        cameraUsed.takePhotograph(55.55);
    }

}
