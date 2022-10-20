import java.util.List;


public class Genre {
    
    private String songName;
    
    private String lyrics;
    
    private List<Songs> songs;
    
    public Genre(String songName, String lyrics, List<Songs> songs) {
        this.songName = songName;
        this.lyrics = lyrics;
        this.songs = songs;
    }

    @Override
    public String toString(){
        return "Song [name= " + songName + ", description=" + lyrics + ", Genre=" + songs + "]";
    }
    
    public String getSongName() 
  { return songName;}
    
    public void setSongName(String songName) 
  { this.songName = songName;}
    
    public String getLyrics() 
  { return lyrics;}
    
    public void setLyrics(String lyrics) 
  { this.lyrics = lyrics;}
    
    public List<Songs> getSongs() { return songs; }
    
    public void setSongs(List<Songs> songs) {this.songs = songs;}
    
    
}