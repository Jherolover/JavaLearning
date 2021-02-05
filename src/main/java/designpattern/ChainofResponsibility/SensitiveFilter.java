package designpattern.ChainofResponsibility;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {

        msg.setMsg(msg.getMsg().replace("996","955"));

    }
}
