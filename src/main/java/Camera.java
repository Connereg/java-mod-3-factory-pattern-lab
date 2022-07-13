public abstract class Camera {
    private FilmOperations filmOps;
    private ShutterOperations shutterOps;
    private MirrorOperations mirrorOps;

    public Camera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        this.filmOps = filmOps;
        this.shutterOps = shutterOps;
        this.mirrorOps = mirrorOps;
    }

    public void takePhotograph(Double shutterSpeed) {
        Logger.getInstance().log(getName() + " is taking a photograph!");

        //ENAGAGING THIS CAMERA'S PHOTOGRAPH TAKING PROCESS
        filmOps.engageFilmMechanism();
        filmOps.rollFilm();
        filmOps.releaseFilmMechanism();

        //OPENING MIRROR FOR THE CAMERA INSTANCE
        mirrorOps.openMirror();

        //SHUTTER ACTIVITY TO TAKE PHOTO
        shutterOps.setShutterSpeedSetting(shutterSpeed);
        shutterOps.initializeShutter();
        shutterOps.activateShutter();
        shutterOps.releaseShutter();

        //CLOSE MIRROR TO FINISH PHOTO TAKING PROCESS
        mirrorOps.closeMirror();

        Logger.getInstance().log(getName() + " is finished taking the photo!");
    }
    // ACCESSING THIS INSTANCE OF CAMERA'S NAME, REGARDLESS OF MAKE
    public abstract String getName();

}
