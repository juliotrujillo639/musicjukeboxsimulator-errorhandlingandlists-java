import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(
        "\n******************Welcome to Music Jukebox!******************");
        
        Jukebox jukebox = new Jukebox();
        jukebox.init();
        
        boolean on = true;
    
        while(on) {
            int choice = chooseGenre(jukebox);
            
            Genre chosenGenre;
            try {
            chosenGenre = jukebox.getGenres().get(choice - 1);
            } catch (IndexOutOfBoundsException ex){
                break;
            }
        choice = chooseSongs(chosenGenre);
            
        switch(choice) {
            case 1:
                System.out.println("Great choice!");
                System.out.println(chosenGenre.getSongs().get(choice - 1));
                break;
            case 2:
                System.out.println("Great selection!");
                System.out.println(chosenGenre.getSongs().get(choice - 1));
                break;
            case 3:
                System.out.println("You have good taste in music!");
                System.out.println(chosenGenre.getSongs().get(choice - 1));
                break;
            case 4:
                System.out.println("Turn the volume up!");
                System.out.println(chosenGenre.getSongs().get(choice - 1));
                break;
            case 5:
                System.out.println("This is your song!");
                System.out.println(chosenGenre.getSongs().get(choice - 1));
                break;
            case 6:
                System.out.println("Going back to genres...");
                break;
            default: System.out.println("Incorrect input.");
        }
        }
        System.out.println("Thanks for listening!");
        scan.close();
    }
    public static int chooseGenre(Jukebox jukebox){
        System.out.println("\nSelect a Genre: ");
        for(int i = 0; i < jukebox.getGenres().size(); i++) {
            System.out.println((i + 1) + ") " + jukebox.getGenres().get(i).getSongName());
        }
        System.out.println("6) Exit jukebox");
        return scan.nextInt();
    }
      public static int chooseSongs(Genre chosenGenre) {
        System.out.println("\nSelect a song to play:");
      for (int i = 0; i < chosenGenre.getSongs().size(); i++) {
        System.out.println((i + 1) + ") " + 
        chosenGenre.getSongs().get(i).getSongName());
         }
    System.out.println("6) Exit jukebox");
    
  return scan.nextInt();
    }
}