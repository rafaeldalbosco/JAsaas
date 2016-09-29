package br.com.intersistemas.jasaas.adapter;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author bosco
 */
public class HttpAdapter implements AdapterInterface{

    private final String accessToken;
    private final CloseableHttpClient httpclient;
    
    public HttpAdapter(String acessToken) {
        this.accessToken = acessToken;
        httpclient = HttpClients.createDefault();
        
    }   
    

    @Override
    public String get(String url) {
        try {
            
            System.out.println("[URL] "+url);
            
            HttpGet httpGet = new HttpGet(url);
            httpGet.addHeader("access_token", accessToken);
            
            CloseableHttpResponse response = httpclient.execute(httpGet);
            
            System.out.println(response.getStatusLine());
            
            HttpEntity entity = response.getEntity();
            String retorno = EntityUtils.toString(entity);
            
            return retorno;
        } catch (IOException ex) {
            Logger.getLogger(HttpAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void delete(String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String put(String url, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void post(String url, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getLatestResponseHeaders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
