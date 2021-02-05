package designpattern.ChainofResponsibility;

public class FaceFilter implements Filter {

    @Override
    public void doFilter(Msg msg) {
        msg.setMsg(msg.getMsg().replace(":","^-^"));
    }
}
