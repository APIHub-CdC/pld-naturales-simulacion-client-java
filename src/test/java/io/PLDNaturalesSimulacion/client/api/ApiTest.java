package io.PLDNaturalesSimulacion.client.api;

import io.PLDNaturalesSimulacion.client.ApiException;
import io.PLDNaturalesSimulacion.client.model.Peticion;
import io.PLDNaturalesSimulacion.client.model.Respuesta;
import okhttp3.OkHttpClient;
import io.PLDNaturalesSimulacion.client.ApiClient;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final PldNaturalesSimulacionApi api = new PldNaturalesSimulacionApi();    
	private ApiClient apiClient = null;	
    
	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("the_url");
    	OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
    			.readTimeout(60, TimeUnit.SECONDS)
    			.build();
    	apiClient.setHttpClient(okHttpClient);	
	}    
    
    @Test
    public void pldTest() throws ApiException {
        String xApiKey = "your_api_key";
        Peticion persona = new Peticion();
        
        persona.setFolio("000008");
        persona.setTipoDocumento("01");
        persona.setNumeroDocumento("01");
        persona.setNombre("Maria");
        persona.setSegundoNombre(null);
        persona.setApellidoPaterno("Sanchez");
        persona.setApellidoMaterno("Mathews");
        
		try {
			Respuesta response = api.pld(xApiKey, persona);
	        Assert.assertTrue(response != null);
	        if(response != null) {
	        	logger.info(response.toString());
	        }
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}
    }
    
}
