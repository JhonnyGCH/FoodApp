package com.example.footapp.itemsCarta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.footapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CartaActivity extends AppCompatActivity {
    private final String datos = "[\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"nombre\": \"Restaurante Chill\",\n" +
            "        \"imagen\": \"https://media-cdn.tripadvisor.com/media/photo-w/18/a6/b3/70/brera-italian-restaurant.jpg\",\n" +
            "        \"descripcion\": \"Es un restaurante especializado en Chill ILIMITADO del Brasil, con las mejores CARNES, maduras, adobadas y asadas por manos expertas.\",\n" +
            "        \"direccion\": \"Av 16 # 19-65 B. Florez Cúcuta, Colombia\",\n" +
            "        \"categoria\": 1,\n" +
            "        \"valoracion\": 4.9,\n" +
            "        \"carta\": [\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"nombre\": \"Ensalada Cesar\",\n" +
            "                \"descripcion\": \"Ensalada de gambas, champiñones, cilantro\",\n" +
            "                \"imagen\": \"https://cdn.colombia.com/gastronomia/2011/08/19/ensalada-cesar-3403.jpg\",\n" +
            "                \"precio\": 8000\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 2,\n" +
            "                \"nombre\": \"Picada Mixta\",\n" +
            "                \"descripcion\": \"Contiene pollo, champiñones, camarones y huevos\",\n" +
            "                \"imagen\": \"https://d320djwtwnl5uo.cloudfront.net/recetas/cover_wgrskh81nt_rellenos.jpg\",\n" +
            "                \"precio\": 12000\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"nombre\": \"Restaurante Msur\",\n" +
            "        \"imagen\": \"https://media-cdn.tripadvisor.com/media/photo-w/0a/70/ca/27/diseno-restaurante-caba.jpg\",\n" +
            "        \"descripcion\": \"Es un restaurante especializado en comidas rápidas, con los mejores precios para disfrute de toda la familia.\",\n" +
            "        \"direccion\": \"Av 4a # 15-20 B. Popular Cúcuta, Colombia\",\n" +
            "        \"categoria\": 1,\n" +
            "        \"valoracion\": 4.3,\n" +
            "        \"carta\": [\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"nombre\": \"Hamburguesa Gitana\",\n" +
            "                \"descripcion\": \"Pan blanco, carne de res, queso, tocineta, huevo, vegetales\",\n" +
            "                \"imagen\": \"https://www.lagitana.com.co/wp-content/uploads/2021/01/hamburguesa-queso.jpg\",\n" +
            "                \"precio\": 22000\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 2,\n" +
            "                \"nombre\": \"Salchipollo\",\n" +
            "                \"descripcion\": \"100 gr de papa a la francesa, 50 gr de salchicha y 50 gr de pollo\",\n" +
            "                \"imagen\": \"https://bekiscrunch.com/wp-content/uploads/2021/07/Salchipollo-BC-1.png\",\n" +
            "                \"precio\": 15000\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"nombre\": \"Bar la bomba\",\n" +
            "        \"imagen\": \"https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2022/09/28/16643855228961.jpg\",\n" +
            "        \"descripcion\": \"Nuestra barra de licores y cócteles ofrecen desde tradicionales preparaciones chilenas hasta sofisticados licores\",\n" +
            "        \"direccion\": \"Cll 15 10 # 19-6  Malecon , Cúcuta, Colombia\",\n" +
            "        \"categoria\": 2,\n" +
            "        \"valoracion\": 4.5,\n" +
            "        \"carta\": [\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"nombre\": \"Capitan Sparrow\",\n" +
            "                \"descripcion\": \"Ron dorado, brandy, ginebra\",\n" +
            "                \"imagen\": \"https://encolombia.com/wp-content/uploads/2012/12/NewOrleans-brandy.jpeg\",\n" +
            "                \"precio\": 26000\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 2,\n" +
            "                \"nombre\": \"Lego\",\n" +
            "                \"descripcion\": \"Vodka, gotas de vainilla, ron de coco, syrop\",\n" +
            "                \"imagen\": \"Vodka, gotas de vainilla, ron de coco, syrop \",\n" +
            "                \"precio\": 20000\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 4,\n" +
            "        \"nombre\": \"The Bruno´s Bar\",\n" +
            "        \"imagen\": \"https://www.gentleman.excelsior.com.mx/wp-content/uploads/2019/03/G-BARRAS-01.jpg\",\n" +
            "        \"descripcion\": \"Ofrecemos una gran variedad de bebidas alcoholicas y los mejores cocteles\",\n" +
            "        \"direccion\": \"Mz 23 # 3 08 Videlso, Los Patios, Colombia\",\n" +
            "        \"categoria\": 2,\n" +
            "        \"valoracion\": 4.0,\n" +
            "        \"carta\": [\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"nombre\": \"Tequila al coco\",\n" +
            "                \"descripcion\": \"Vodka lemongras, licor de cafe, crema de leche, amaretto\",\n" +
            "                \"imagen\": \"https://coctelia.com/wp-content/uploads/2020/06/bebida-margarita-de-coco-768x1024.jpg\",\n" +
            "                \"precio\": 12000\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": 2,\n" +
            "                \"nombre\": \"Spritz al limoncillo\",\n" +
            "                \"descripcion\": \"Ginebra, Jagermaister,syrop de romero, zumo de limón....\",\n" +
            "                \"imagen\": \"https://okdiario.com/look/img/2020/09/04/aperol.jpg\",\n" +
            "                \"precio\": 13000\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "]";
    private int id =  1;
    private ArrayList<ItemCartaModel> items;
    private RecyclerView recyclerView;
    private CartaAdapter cartaAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);
        //recyclerView = findViewById(R.id.contenedor);
        this.leerDatos();
        this.items = getItems(datos);
    }

    private void leerDatos(){
        items = getItems(datos);
        cartaAdapter = new CartaAdapter(this, items);
        recyclerView.setAdapter(cartaAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<ItemCartaModel> getItems(String json)
    {
        ArrayList<ItemCartaModel> carta = new ArrayList<>();
        boolean found = false;
        JSONArray items = new JSONArray();
        JSONArray locales;

        try {
            locales = new JSONArray(json);

            for(int i = 0; i<locales.length() && !found; i++){
                int local = locales.getJSONObject(i).getInt("id");
                if (local != this.id) continue;
                items = new JSONArray(locales.getJSONObject(i).get("carta"));
                found = true;
            }

            if(found) {
                for (int i = 0; i < items.length(); i++) {
                    JSONObject it = items.getJSONObject(i);
                    ItemCartaModel nuevo = new ItemCartaModel();
                    nuevo.setNombre(it.getString("nombre"));
                    nuevo.setDescripcion(it.getString("descripcion"));
                    nuevo.setImagen(it.getString("imagen"));
                    nuevo.setPrecio(it.getDouble("precio"));

                    carta.add(nuevo);
                }
            }
        }catch (JSONException e) {e.printStackTrace();}
        return carta;
    }
}
