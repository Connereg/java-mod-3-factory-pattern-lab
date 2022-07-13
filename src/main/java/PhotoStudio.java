public class PhotoStudio {

    public static void main(String[] args) {

        // Camera Factory Instansiated
        CameraFactory cameraFactory = new CameraFactory();

        //  -> Camera Instance created
        Camera camera = cameraFactory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);

        // Photographer -> Passing it the new camera
        Photographer photographer = new Photographer("Billy", camera);

        // takePhotograph() in Photographer accesses camera takePhotograph method
        photographer.takePhotograph();
    }
}
