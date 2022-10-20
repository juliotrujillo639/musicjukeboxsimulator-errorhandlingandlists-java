public abstract class Songs{
    
    protected String songName;
    protected String lyrics;
    
    public Songs(String songName, String lyrics){
        this.songName = songName;
        this.lyrics = lyrics;
    }
    
    @Override
    public String toString() { return "Now Playing: " + songName + "\nChorus: \n" + lyrics; }
    
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getLyrics() {
        return lyrics;
    } 
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}