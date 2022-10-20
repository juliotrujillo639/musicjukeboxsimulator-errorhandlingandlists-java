import java.util.ArrayList;
import java.util.List;

public class Jukebox {
    
    private List<Genre> genres;
    
    public void init(){
        
        Rock theStrokes = new Rock("Reptilia by The Strokes", "\"I said, please don't slow me down if I'm going too fast, You're in  strange part of our town...\"");
        
        Rock tameImpala = new Rock("The Less I Know The Better by Tame Impala", "\"Oh my love, can't you see yourself by my side? I don't suppose you could convice your lover to change his mind...\"");
        
        Rock nirvana = new Rock("Come As You Are by Nirvana", "\"Come as you are, as you were, As I want you to be...\"");
        
        Rock joyDivision = new Rock("Love Will Tear Us Apart by Joy Division", "\"Love, love will tear us apart again (x2)...\"");
        
        Rock redHotChiliPeppers = new Rock("Scar Tissue by Red Hot Chili Peppers", "\"With the birds, I'll share this lonely viewin' (x2)\"");
        
        
        Pop harryStyles = new Pop("As It Was by Harry Styles", "\"In this world, it's just us, You know it's not the same as it was...\"");
        
        Pop panicAtTheDisco = new Pop("High Hopes by Panic! At The Disco", "\"Had to have high, high hopes for a living, Shooting for the stars when I couldn't make a killing, Didn't have a dime but I always had a vision, Always had high, high hopes...\"");
        
        Pop edSheeran = new Pop("Bad Habits by Ed Sheeran", "\"Nothing happens after two, it's true, It's true, my bad habits lead to you...\"");
        
        Pop frankOcean = new Pop("Lost by Frank Ocean", "\"Now you're lost, Lost in the heat of it all, Girl, you know know you're lost, Lost in the thrill of it all...\"");
        
        Pop justinBieber = new Pop("Intentions feat. Quavo by Justin Bieber", "\"Picture perfect you don't need no filter, Gorgeous, make 'em drop dead you're a killer, Shower you with all my intentions, Yeah these are my only intentions...\"");
        
        HipHop kanyeWest = new HipHop("Flashing Lights by Kanye West", "\"As I recall, I know you love to show off, But I never thought that you would take it this far, But what do I know? Flashing lights...\"");
        
        HipHop postMalone = new HipHop("Congratulations feat. Quavo by Post Malone", "\"Now they always say congratulations, Worked so hard forgot how to vacation, They ain't never had the dedication, People hatin', say we changed and look, we made it, Yeah, we made it\"");
        
        HipHop drake = new HipHop("In my Feelings by Drake", "\"Kiki, do you love me? Are you riding? Say you'll never ever leave from beside me 'Cause I want ya, and I need ya, And I'm down for you always...\"");
        
        HipHop tyDollaSign = new HipHop("Blasé feat. Future and Rae Sremmurd by Ty Dolla $ign", "\"Ordered up a hundred Rosés, need a Benz like blasé, blasé, I'm just whipping Maserati, Blasé, blasé (x4)...\"");
        
        HipHop youngThug = new HipHop("Pick Up the Phone feat. Travis Scott, Quavo by Young Thug", "\"Pick up the phone, baby, I know you're home, baby, I'm in the zone, baby, i just poured up a four baby...\"");
        
        
        Latin badBunny = new Latin("Me Porto Bonito feat. Chencho Corleone by Bad Bunny", "\"En la calle ando suelto pero por ti me quito, Si tu me lo pides yo me porto bonito...\"");
        
        Latin farruko = new Latin("Pepas by Farruko", "\"Pepa y agua pa' la seca, To' el mundo en pastilla' en la discoteca(x2)..\"");
        
        Latin anicetoMolina = new Latin("Cumbia Sampuesana by Aniceto Molina", "\"La cumbia sampuesana, La que bailan con ganas(x2)...\"");
        
        Latin supermerk2 = new Latin("Que Calor by Supermerk2", "\"Qué calor, oh-eh-oh, Qué calor que tengo yo, Que levante la mano como yo, El que quiera vino en cartón, El que quiera vino en cartón...\"");
        
        Latin daddyYankee = new Latin("Lo Que Pasó, Pasó by Daddy Yankee", "\"Lo que pasó, pasó, Entre tu y yo (x4)...\"");
        
    
        Electronic calvinHarris = new Electronic("Summer by Calvin Harris", "\"When I met you in the summer, To my heartbeat's sound, We fell in love, As the leaves turn brown...\"");
        
        Electronic tiesto = new Electronic("The Business by Tiësto", "\"Let's get down, let's get down to business, Give you one more night, one more night to get this, We've had a million, million nights just like this, So let's get down, let's get down to business...\"");
        
        Electronic steveAoki = new Electronic("Delirious (Boneless) feat. Kid Ink by Steve Aoki", "\"We stay out till the sun up, Twisting and burning up, Can't nobody stop us, (We've gone delirious)\"");
        
        Electronic daftPunk = new Electronic("One More Time by Daft Punk", "\"One more time, we're gonna celebrate, Oh yeah, alright, don't stop the dancing(x2)...\"");
        
        Electronic avicii = new Electronic("Levels by Avicii", "\"Oh sometimes, I get a good feeling, Yeah, get a feeling that I never never never had before, no no I get a good feeling, yeah...\"");
        
        
        ArrayList<Songs> rockChannel = new ArrayList<Songs> ();
        rockChannel.add(theStrokes);
        rockChannel.add(tameImpala);
        rockChannel.add(nirvana);
        rockChannel.add(joyDivision);
        rockChannel.add(redHotChiliPeppers);
        Genre rock = new Genre("Rock music", "Rock out to your favorites and classics!", rockChannel);
        
         
        ArrayList<Songs> popChannel = new ArrayList<Songs> ();
        popChannel.add(harryStyles);
        popChannel.add(panicAtTheDisco);
        popChannel.add(edSheeran);
        popChannel.add(frankOcean);
        popChannel.add(justinBieber);
        Genre pop = new Genre("Pop music", "Listen to trending songs!", popChannel);
        
         
        ArrayList<Songs> hipHopChannel = new ArrayList<Songs> ();
        hipHopChannel.add(kanyeWest);
        hipHopChannel.add(postMalone);
        hipHopChannel.add(drake);
        hipHopChannel.add(tyDollaSign);
        hipHopChannel.add(youngThug);
        Genre hipHop = new Genre("Hip Hop music", "Jam out to your favorite artists!", hipHopChannel);
        
         
        ArrayList<Songs> latinChannel = new ArrayList<Songs> ();
        latinChannel.add(badBunny);
        latinChannel.add(farruko);
        latinChannel.add(anicetoMolina);
        latinChannel.add(supermerk2);
        latinChannel.add(daddyYankee);
        Genre latin = new Genre("Latin music", "Dance to your favorite party songs!", latinChannel);
        
         
        ArrayList<Songs> electronicChannel = new ArrayList<Songs> ();
        electronicChannel.add(calvinHarris);
        electronicChannel.add(tiesto);
        electronicChannel.add(steveAoki);
        electronicChannel.add(daftPunk);
        electronicChannel.add(avicii);
        Genre electronic = new Genre("Electronic music", "Fist pump the night away!", electronicChannel);
        
        genres = new ArrayList<Genre>();
        genres.add(rock);
        genres.add(pop);
        genres.add(hipHop);
        genres.add(latin);
        genres.add(electronic);
        
    }
    
    public List<Genre> getGenres(){
        return genres;}
    
    public void setGenres(List<Genre> genres) {
        this.genres = genres;}
    
}