package com.example.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager



    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val testItem: ListItem = ListItem(false, false, "2020-06-03T05:58:03.474Z", "5ed73beb9fa5a7001710a905", "hard alcohol *100 ", "Spices")
        val secondItem: ListItem = ListItem(false, true, "2020-06-03T05:58:13.698Z", "5ed73beb9fa5a7001710a905", "Burger patties ", "Meat & Seafood")
        val thirdItem: ListItem = ListItem(true, false, "2020-06-03T05:58:39.302Z", "5ed73beb9fa5a7001710a905", "hOreos", "Sweets/Desserts")

        var myDataset = arrayOf<ListItem>(testItem, secondItem, thirdItem)

//


        viewManager = LinearLayoutManager(this.context)
        viewAdapter = MyAdapter(myDataset)

        recyclerView = view.findViewById<RecyclerView>(R.id.mainRecyclerView).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }



        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }





    }




}
