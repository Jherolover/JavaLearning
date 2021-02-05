package designpattern.ChainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {

    List<Filter> chains = new ArrayList<Filter>();
    public ChainFilter addFilter(Filter filter){
         chains.add(filter);
         return this;
    }



    public void doFilter(Msg msg) {
        for (Filter filter :chains){
            filter.doFilter(msg);
        }
    }
}
