package e.wolfsoft1.uiuxlabecommerce_jp_dark13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_dark13.adapter.Shirt_Adapter;
import e.wolfsoft1.uiuxlabecommerce_jp_dark13.model.Model_Shirt;

public class Shop_14 extends AppCompatActivity {

    RecyclerView recycler_shirt;

    private Integer shirt_image[]={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6};
    private String shirt_type[]={"Good  Shirt","Formal Shirt","Casual Shirt","Checked  Shirt","Formal Shirt","Checked  Shirt","Good  Shirt","Formal Shirt","Casual Shirt","Checked  Shirt","Formal Shirt","Checked  Shirt"};
    private String shirt_price []={"$ 137","$ 179","$ 126","$ 159","$ 179","$ 129","$ 137","$ 179","$ 126","$ 159","$ 179","$ 129"};
    private String shirt_decoration[]={"White Embroidered","Jack & Jones","Olive Printed Casual","Aqua Blue Checked","Jack & Jones","Olive Printed Casual","White Embroidered","Jack & Jones","Olive Printed Casual","Aqua Blue Checked","Jack & Jones","Olive Printed Casual"};

    ArrayList<Model_Shirt> model_shirtArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_14);

        recycler_shirt=findViewById(R.id.recycler_shirt);

        model_shirtArrayList=new ArrayList<>();

        for (int i=0;i<shirt_image.length;i++){
            Model_Shirt model_shirt=new Model_Shirt(shirt_image[i],shirt_price[i],shirt_type[i],shirt_decoration[i]);
            model_shirtArrayList.add(model_shirt);
        }

        Shirt_Adapter adapter =new Shirt_Adapter(this,model_shirtArrayList);
        recycler_shirt.setLayoutManager(new GridLayoutManager(this,2));
        recycler_shirt.setAdapter(adapter);


    }
}
