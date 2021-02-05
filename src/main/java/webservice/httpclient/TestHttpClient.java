package webservice.httpclient;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestHttpClient {

    @Test
    public void httpTest() throws IOException {
        HttpGet httpGet = new HttpGet("http://172.31.251.121:8088/AuditWebService.asmx");
        //执行http信息
        HttpClient httpClient = new DefaultHttpClient();
        //httpresponse
        HttpResponse response = httpClient.execute(httpGet);
        //获取执行
        InputStream ins = response.getEntity().getContent();
        byte[] b = new byte[1024];
        StringBuilder sb = new StringBuilder();
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            while (ins.read(b) != -1) {
                sb.append(new String(b, "UTF-8"));
            }
        }else{
            System.out.println("请求出现异常"+response.getStatusLine().getStatusCode());
        }
        System.out.println(sb.toString());
    }
}
