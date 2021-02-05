package webservice.httpclient;

import org.apache.axis.utils.StringUtils;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ExecuteHttpClient {
    /**
     * 请求调用webservice,外部传入请求wsdl
     * @param wsdl  wsdl地址
     * @param ns 命名空间
     * @param method 方法名
     * @param requestSoapData 参数
     * @param result
     * @return
     * @throws IOException
     */
    public static  String callWebService(String wsdl, String ns, String method, String requestSoapData ,String result) throws IOException {

        String soapResponseData = "";
        //拼接参数
        StringBuffer sb = new StringBuffer();

        //for 循环拼接参数
        /*for(int i = 0 ; i < list.size();i++){

        }*/
        /*String requestData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <Helloworld xmlns=\"http://tempuri.org/\">\n" +
                "    </Helloworld>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>\n";
          */
        //InitWs
        String requestData = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <InitWs xmlns=\"http://tempuri.org/\">\n" +
                "    </InitWs>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>\n";

        //StringBuffer requestData = new StringBuffer();
        //requestData.append("");

        //获取执行方法
        PostMethod postMethod = new PostMethod(wsdl);
        //把soap请求数据添加到PostMethod中去
        byte[] b = null;
        InputStream is  = null;

        try {
            b = requestData.toString().getBytes("utf-8");
            is = new ByteArrayInputStream(b, 0, b.length);
            RequestEntity re = new InputStreamRequestEntity(is, b.length, "text/xml; charset=UTF-8");
            postMethod.setRequestEntity(re);
            HttpClient httpClient = new HttpClient();
            int status = httpClient.executeMethod(postMethod);
            //判断请求状态是否为空
            if (status == 200) {
                soapResponseData = getResultMessage(postMethod.getResponseBodyAsString(),method);
            }
        } catch (Exception e) {
            System.out.println("请求出现异常:"+e.getMessage());
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
        }
        return soapResponseData;
    }

    /**
     * 解析获取的请求的结果
     * 1.根据调用方法名 + Result进行分割
     *
     * @param method
     * @param xmlStr
     * @return
     *
     */
    public static String getResultMessage(String xmlStr,String method ){
        String result = "";
        if(StringUtils.isEmpty(xmlStr)){
            return result;
        }else{
            //获取起始位置
            int begin = xmlStr.indexOf("<"+method+"Result>");
            //获取从begin开始-- '>'的位置  fromIndex 开始位置  str的位置
            begin = xmlStr.indexOf(">", begin);
            int end = xmlStr.indexOf("</"+method+"Result>");
            //截取的位置就是起始位置加上结束位置
             result = xmlStr.substring(begin + 1, end);
        }
        return result;
    }


    @Test
    public void test() throws IOException {

        String wsdl = "http://172.31.251.121:8088/AuditWebService.asmx?wsdl";
        String ns  = "http://tempuri.org/";
        //String method = "Helloworld";
        String method = "InitWs";
        String  result = callWebService(wsdl,ns,method,null,null);
        //获取起始位置
//        int begin = result.indexOf("<HelloworldResult>");
//        //获取从begin开始-- '>'的位置  fromIndex 开始位置  str的位置
//        begin = result.indexOf(">", begin);
//        int end = result.indexOf("</HelloworldResult>");
//        //截取的位置就是起始位置加上结束位置
//        String str = result.substring(begin + 1, end);
        System.out.println(result);

    }
}
