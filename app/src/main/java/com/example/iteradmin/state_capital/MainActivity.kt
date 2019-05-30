package com.example.iteradmin.state_capital

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val state= arrayOf("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttar Pradesh","West Bengal","Chhattisgarh","Uttarakhand","Jharkhand","Telangana")
        val search=findViewById<AutoCompleteTextView>(R.id.search)
        val adp=ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,state)
        search.setAdapter(adp)
        search.threshold=1

        val capital= arrayOf("Hyderabad","Itanagar","Dispur","Patna","Panaji","Gandhinagar","Chandigarh","Shimla","Srinagar","Bengaluru","Thiruvananthapuram","Bhopal","Mumbai","Imphal","Shillong","Aizawl","Kohima","Bhubaneswar","Chandigarh","Jaipur","Gangtok","Chennai","Agartala","Lucknow","Kolkata","Raipur","Dehradun","Ranchi","Hyderabad")
        val text=findViewById<TextView>(R.id.textView)
        search.setOnItemClickListener { parent, view, position, id ->
            for (i in 0..27) {
                if (parent.getItemAtPosition(position).toString() == state[i].toString())
                {
                    text.setText(capital[i].toString())
                }
            }


        }
    }
}
