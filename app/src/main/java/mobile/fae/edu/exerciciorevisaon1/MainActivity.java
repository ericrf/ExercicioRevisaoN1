package mobile.fae.edu.exerciciorevisaon1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import mobile.fae.edu.exerciciorevisaon1.model.ReceitaList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callService(){
        final String url = "http://www.fae.edu/teste/mobile/receitas/lista.vm";
        RestTemplate template = new RestTemplate();
        template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        ReceitaList receitas = template.getForObject(url, ReceitaList.class);
    }
}
