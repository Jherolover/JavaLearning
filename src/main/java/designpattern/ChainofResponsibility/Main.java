package designpattern.ChainofResponsibility;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Msg msg = new Msg(": 996");
        ArrayList<Filter> chains = new ArrayList();
        chains.add(new FaceFilter());
        chains.add(new SensitiveFilter());
        for(Filter f :chains){
            f.doFilter(msg);
        }
        System.out.println(msg);
        //System.out.println();
    }
}


