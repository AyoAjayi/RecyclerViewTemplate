package com.example.recyclerview;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    //model class for our data source
    List<String> food_items;

    //Initialize rvFood (connect our recycler view to our code)
    RecyclerView rvFood;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the array
//        food_items = new ArrayList<>();
        food_items = new ArrayList<>();

        //reference the rvFood we created
        rvFood = findViewById(R.id.rvFood);

        //add food items
        food_items.add("Eggs");
        food_items.add("Pancakes");
        food_items.add("Strawberries");
        //Create your adapter file first before doing any of this.

        // Reference foodAdapter
        foodAdapter =  new FoodAdapter(food_items);
        //Set adapter on the recycler view
        rvFood.setAdapter(foodAdapter);
        //Set a layout manager on rvItems, we will use Layout manager which puts things on the UI in a vertical way by default.
        rvFood.setLayoutManager(new LinearLayoutManager(this));

    }
}