//CANON CAMERA SPECIFIC FILM OPERATIONS
public class CanonFilm implements FilmOperations {
    // DEFINING THE FILM OPERATIONS PROCESSES FOR A CANON SPECIFIC CAMERA
    public void engageFilmMechanism() {
        Logger.getInstance().log(getName() + " has engaged");
    }
    public void rollFilm() {
        Logger.getInstance().log(getName() + " has rolled");
    }

    public void releaseFilmMechanism() {
        Logger.getInstance().log(getName() + " has been released");
    }

    public String getName() {
        return "Canon Film";
    }

}
