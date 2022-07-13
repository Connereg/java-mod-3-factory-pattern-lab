// CAMERA MAKE EXTENDS FROM CAMERA ABSTRACT CLASS
public class CanonCamera extends Camera {
    //CONSTRUCTOR
    public CanonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        //INHERENT TRAITS OF CAMERA USED TO CONSTRUCT INSTANCE OF CERTAIN CAMERA MAKE
        super(filmOps, shutterOps, mirrorOps);
    }
    //ACCESS TO CAMERA'S NAME COMES FROM ITS MAKE
    public String getName() {
        return "Canon";
    }
}
