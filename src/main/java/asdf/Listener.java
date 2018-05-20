package asdf;

import com.google.common.eventbus.Subscribe;

public class Listener {

    @Subscribe
    public void easyListening(String string)
    {
        System.out.println("ich wurde aufgerufen!!!!!!!!!!!!"+string);

    }

    @Subscribe
    public void intListener(Integer i)
    {
        System.out.println("Und Jetzt ich 11!!!!" + i );
    }

}
