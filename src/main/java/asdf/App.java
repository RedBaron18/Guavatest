package asdf;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

import java.util.HashMap;
import java.util.Iterator;


import com.google.common.hash.HashCode;

import static com.google.common.hash.Hashing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  char[] words = {"hallo", "wie","gehts","tolles","tool","habt","ihr","hier","knorke"};
        String satz;
        ArrayListMultimap<String, Integer> nameToId = ArrayListMultimap.create();

        nameToId.put("Peter",1);
        nameToId.put("Peter",5);
        nameToId.put("Gustav",1);
        nameToId.put("Horst",3);
        nameToId.put("Dieter",4);


        TreeMultimap<Integer, String> inverse = Multimaps.invertFrom(nameToId, TreeMultimap.<Integer, String>create());

//       System.out.println(nameToId);
//       System.out.println(inverse);


        Joiner joiner = Joiner.on("--trenner--").skipNulls();
        String url = joiner.join("jdbc:","dbtype","://","host","/","dname", "?serverTimezone=Europe/Berlin");
        System.out.println(url);



        String password = "passwort12345";
        HashCode hashPassword = sha256().hashString(password, Charsets.UTF_8);
        System.out.println(password);
        System.out.println(hashPassword);




       satz = "Das ist ein Test um den Satz zu trennen , geht es?";
       Iterable<String> split = Splitter.on("um").split(satz);

        for (String i:split){
          System.out.println( i );

        }

}
}
