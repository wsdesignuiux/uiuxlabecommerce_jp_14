package e.wolfsoft1.uiuxlabecommerce_jp_dark13.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_dark13.R;
import e.wolfsoft1.uiuxlabecommerce_jp_dark13.model.Model_Shirt;

public class Shirt_Adapter extends RecyclerView.Adapter<Shirt_Adapter.MyShirt_Holder> {

    private final Context context;
    private final ArrayList<Model_Shirt> model_shirtArrayList;

    public Shirt_Adapter(Context context, ArrayList<Model_Shirt> model_shirtArrayList) {
        this.context=context;
        this.model_shirtArrayList=model_shirtArrayList;
    }

    @NonNull
    @Override
    public MyShirt_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(context).inflate(R.layout.item_shop,viewGroup,false);
        return new MyShirt_Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyShirt_Holder myShirt_holder, int i) {

        myShirt_holder.shirt_image.setImageResource(model_shirtArrayList.get(i).getShirt_image());
        myShirt_holder.shirt_price.setText(model_shirtArrayList.get(i).getShirt_price());
        myShirt_holder.shirt_type.setText(model_shirtArrayList.get(i).getShirt_type());
        myShirt_holder.shirt_decoration.setText(model_shirtArrayList.get(i).getShirt_decoration());
    }

    @Override
    public int getItemCount() {
        return model_shirtArrayList.size();
    }

    class MyShirt_Holder extends RecyclerView.ViewHolder{

        TextView shirt_decoration,shirt_price,shirt_type;
        ImageView shirt_image;

        public MyShirt_Holder(@NonNull View itemView) {
            super(itemView);
            shirt_image=itemView.findViewById(R.id.shirt_image);
            shirt_price=itemView.findViewById(R.id.shirt_price);
            shirt_type=itemView.findViewById(R.id.shirt_type);
            shirt_decoration=itemView.findViewById(R.id.shirt_decoration);

        }
    }
}
