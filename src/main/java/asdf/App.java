package asdf;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

import java.util.HashMap;
import java.util.Iterator;


import com.google.common.eventbus.EventBus;
import com.google.common.hash.HashCode;

import static com.google.common.hash.Hashing.*;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) {

        // Eventbus Beispiel
        EventBus eventbus = new EventBus();
        eventbus.register(new Listener());
        eventbus.post(1234);


        // Multimap Beispiel
        String[] words = {"hallo", "wie", "gehts", "tolles", "tool", "habt", "ihr", "hier", "knorke"};
        String satz;
        ArrayListMultimap<String, Integer> nameToId = ArrayListMultimap.create();
        nameToId.put("Peter", 1);
        nameToId.put("Peter", 5);
        nameToId.put("Gustav", 1);
        nameToId.put("Horst", 3);
        nameToId.put("Dieter", 4);
        TreeMultimap<Integer, String> inverse = Multimaps.invertFrom(nameToId, TreeMultimap.<Integer, String>create());
        System.out.println(nameToId);
        System.out.println(inverse);

        // Joiner Beispiel
        Joiner joiner = Joiner.on("--trenner--").skipNulls();
        //String url = joiner.join("jdbc:","dbtype","://","host","/","dname", "?serverTimezone=Europe/Berlin");
        String url = joiner.join(words);
        System.out.println(url);


        //Splitter Beispiel
        satz = "Das ist ein Test um den Satz zu trennen , geht es?";
        Iterable<String> split = Splitter.on("um").split(satz);

        for (String i : split) {
            System.out.println(i);
        }

        //Hashing Beispiel
        String password = "passwort12345";
        HashCode hashPassword = sha256().hashString(password, Charsets.UTF_8);
        System.out.println(password);
        System.out.println(hashPassword);





    }
}
