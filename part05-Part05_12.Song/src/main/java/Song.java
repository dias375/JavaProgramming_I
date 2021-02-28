
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean sameSong(Song comparedSong) {
        if (this.sameName(comparedSong) && this.sameArtist(comparedSong) && this.sameDuration(comparedSong)) {
            return true;
        }
        return false;
    }

    public boolean sameString(Song comparedSong) {
        return this.toString().equals(comparedSong.toString());
    }

    public boolean sameName(Song comparedSong) {
        return (this.name.equals(comparedSong.getName()));
    }

    public boolean sameArtist(Song comparedSong) {
        return (this.artist.equals(comparedSong.getArtist()));
    }

    public boolean sameDuration(Song comparedSong) {
        return (this.durationInSeconds == comparedSong.getDuration());
    }

    public String getName() {
        return this.name;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getDuration() {
        return this.durationInSeconds;
    }

    @Override
    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.sameSong(comparedSong)) {
            return true;
        }

        //if (this.sameString(compared)) {
        //    return true;
        //}
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
