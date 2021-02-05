package webservice.cxf;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

public class TestCXF {

    @Test
    public void testCxfCall() throws Exception {
        //调用webservice
        String method2 = "Helloworld";
        //参数
        String param2 = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <tem:Helloworld>\n" +
                "         <tem:a>12</tem:a>\n" +
                "      </tem:Helloworld>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        //实例化JaxWsDynamicClientFactory
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        //通过wsdl路径生成客户端实体
        Client client = clientFactory.createClient("http://172.31.251.121:8088/AuditWebService.asmx?wsdl");
        //调用方法传参
        //Object[] result1 = client.invoke(method1, param1);
        //
        Object[] result2 = client.invoke(method2,param2);
        System.out.println(result2[0]);
    }
}
