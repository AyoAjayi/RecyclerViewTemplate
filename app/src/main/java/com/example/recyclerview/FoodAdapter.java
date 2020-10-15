package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// adapter is responsible for taking the data at a particular position and putting it into a view holder
//public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
//public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    //Reference the model [line 39]
    //Generate a Adapter constructor to take in your model [line 41]
    //Create  a view holder class that extends RecyclerView.ViewHolder : container to access views in each row of the list [line 46]
    //Make sure your FoodAdapter extends your RecyclerView. The adapter is parameterized by the view holder
    //Implement necessary methods
    //OnCreate
        // create a new view and wrap it inside the view holder.
        // Use layout inflater to inflate a view. You need a context, you can go ahead and get context from the viewGroup parent in the onCreateViewHolder method.
        // Then pass in the xml file of the view you are creating (Use built in android resource file which is called simple_list_item_1) for the first parameter.
        // Then pass in root which is the parent and false for attach to root because we want to attach the view and not the root, for the next parameters.
        // This will return a View to us
    //Bind:Binding data to a particular view holder
        //Grab the item at the position.
        //Bind the item into the specified view holder.
        //Implement .bind method inside the view holder class.
    // Our view which is simple_list_item_1 which is built in consists of an id known as text1. Use this to reference to the item1 textview
    //getItemCount
        //Gets the size of our model
    //Go back to MainActivity.java file



    List<String> foodItems;
    public FoodAdapter(List<String> foodItems) {
        this.foodItems = foodItems;
    }
    class ViewHolder extends  RecyclerView.ViewHolder{
        TextView tvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(android.R.id.text1);
        }

        public void bind(String foodItem) {
            tvItem.setText(foodItem);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View todoView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(todoView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String foodItem = foodItems.get(position);
        holder.bind(foodItem);
    }
    @Override
    public int getItemCount() {
        return foodItems.size();
    }
}
