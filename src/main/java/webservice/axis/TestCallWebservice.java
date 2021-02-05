package webservice.axis;


import org.apache.axis.client.Service;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

public class TestCallWebservice {

    @Test
    public void Test() throws Exception {

        //定义方法
        String method = "Helloworld";

        //定义服务
        Service service = new Service();
        //
        Call call = service.createCall();
         String param = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">\n" +
                 "   <soapenv:Header/>\n" +
                 "   <soapenv:Body>\n" +
                 "      <tem:Helloworld>\n" +
                 "         <tem:a>12</tem:a>\n" +
                 "      </tem:Helloworld>\n" +
                 "   </soapenv:Body>\n" +
                 "</soapenv:Envelope>";
        //调用hellowORD方法，方法有参数
        call.setTargetEndpointAddress("http://172.31.251.121:8088/AuditWebService.asmx?wsdl");
        call.setOperationName(new QName("http://tempuri.org",method));
        //设置参数名：参数类型 参数类型  参数模式  'IN' or 'OUT'
        call.addParameter("guid", XMLType.SOAP_STRING, ParameterMode.IN);
        call.setReturnType(XMLType.SOAP_STRING);
        String result = (String) call.invoke(new Object[]{param});
        System.out.println(result);
    }
}
