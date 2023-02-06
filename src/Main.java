import java.util.SplittableRandom;

public class Main {

    public static void main (String[]arg) {

        Author dostoevsky = new Author ("Fedor", "Dostoevsky");

        Author gogol = new Author("Nicolai", "Gogol");


        Book idiot = new Book("Idiot", new Author("Fedor", "Dostoevsky"),1869);
        Book idiot1 = new Book("Idiot", new Author("Fedor", "Dostoevsky"),1869);
        System.out.println("idiot.name = " + idiot.getName());
        //System.out.println("idiot.author = " + ());
        System.out.println("idiot.year = " + idiot.getYear());
        //idiot.setYear(1788);
        System.out.println("idiot.getYear() = " + idiot.getYear());

        Book vii = new Book("Vii", new Author("Nicolai", "Gogol"), 1833);

        System.out.println( new Book("Idiot", new Author("Fedor", "Dostoevsky"),1869));
        System.out.println(new Author("Fedor", "Dostoevsky"));

        System.out.println(idiot.equals(idiot1));


    }

}
