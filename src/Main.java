import java.util.SplittableRandom;

public class Main {

    public static void main (String[]arg) {

        Author dostoevsky = new Author ("Fedor", "Dostoevsky");
        System.out.println("dostoevsky.firstName = " + dostoevsky.firstName);
        System.out.println("dostoevsky.secondName = " + dostoevsky.secondName);

        Author gogol = new Author("Nicolai", "Gogol");
        System.out.println("gogol.firstName = " + gogol.firstName);
        System.out.println("gogol.secondName = " + gogol.secondName);


        Book idiot = new Book("Idiot", new Author("Fedor", "Dostoevsky"),1869);
        System.out.println("idiot.name = " + idiot.getName());
        System.out.println("idiot.author = " + idiot.getAuthor());
        System.out.println("idiot.year = " + idiot.getYear());
        idiot.setYear(1788);
        System.out.println("idiot.getYear() = " + idiot.getYear());

        Book vii = new Book("Vii", new Author("Nicolai", "Gogol"), 1833);

    }

}
