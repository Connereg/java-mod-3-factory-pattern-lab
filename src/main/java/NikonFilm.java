//NIKON CAMERA SPECIFIC FILM OPERATIONS
public class NikonFilm implements FilmOperations {
    // DEFINING THE FILM OPERATIONS PROCESSES FOR A NIKON SPECIFIC CAMERA
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
        return "Nikon Film";
    }

}