package com.example.grocerylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.adapter_layout.view.*


class MyAdapter (private val myDataset: Array<ListItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//class MyAdapter (private val myDataset: Array<ListItem>) : RecyclerView.Adapter<MyAdapter.ListRowHolder>() {

//class MyAdapter (private val myDataset: Array<ListItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
//class MyAdapter (private val myDataset: Array<ListItem>) : BaseAdapter() {
//class MyAdapter (private val myDataset: Array<ListItem>) {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.

    //class MyViewHolder(val myView: TextView) : RecyclerView.ViewHolder(myView)
    //class MyViewHolder(val myListView: ListItem) : ListRowHolder()



    //class MyViewHolder(val myView: ListItem) : ListRowHolder()

//    private val layoutInflater: LayoutInflater
//    private var arrayListDetails:ArrayList<ListItem> = myDataset
//
//    init {
//        this.layoutInflater = LayoutInflater.from(this.context)
//        this.arrayListDetails = arrayListDetails
//    }

    // Create new views (invoked by the layout manager)
//     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListRowHolder {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // create a new view
        val myListView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_layout, parent, false) as LinearLayout

        //val myListView = LayoutInflater.from(parent.context).inflate(R.layout.my_text_view, parent, false) as TextView
        //val textViewOne = LayoutInflater.from(parent.context).inflate(R.layout.adapter_layout, parent, false) as TextView
        //val textView = LayoutInflater.from(parent.context).inflate(R.layout.my_text_view, parent, false) as TextView
        //val textView = LayoutInflater.from(parent.context).inflate(aSecondFragment.textview_second, parent, false) as TextView
        // set the view's size, margins, paddings and layout parameters

        //return ListRowHolder(myListView)
        return ListRowHolder(myListView)
    }

    // Replace the contents of a view (invoked by the layout manager)
//     override fun onBindViewHolder(holder: ListRowHolder, position: Int) {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.itemView.itemCatText.text = myDataset[position].itemCat
        holder.itemView.itemNameText.text = myDataset[position].itemName
        holder.itemView.itemDateText.text = myDataset[position].itemDate
    }

//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
//
//        val view: View?
//        val listRowHolder: ListRowHolder
//
//        if(convertView == null) {
//            view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_layout, parent, false)
//            listRowHolder = ListRowHolder(view)
//            view.tag = listRowHolder
//        } else {
//            view = convertView
//            listRowHolder = view.tag as ListRowHolder
//        }
//
//    listRowHolder.itemCat.text = myDataset[position].itemCat
//        listRowHolder.itemName.text = myDataset[position].itemName
//
//
//        return view
//    }
//
//    override fun getItem(position: Int): Any{
//        return myDataset[position]
//    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }


//    override fun onBindViewHolder(holder: ListRowHolder, position: Int) {
//        holder.itemCat.text = myDataset[position].itemCat
//        holder.itemName.text = myDataset[position].itemName
//        holder.itemDate.text = myDataset[position].itemDate
//    }

//    override fun onBindViewHolder(holder: MyAdapter.ListRowHolder, position: Int) {
//        holder.itemCat.text = myDataset[position].itemCat
//        holder.itemName.text = myDataset[position].itemName
//        holder.itemDate.text = myDataset[position].itemDate
//    }

//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        holder.itemView.itemNameText.text = myDataset[position].itemName
//        holder.itemView.itemCatText.text = myDataset[position].itemCat
//        holder.itemView.itemDateText.text = myDataset[position].itemDate
//    }


    inner class ListRowHolder(row: View): RecyclerView.ViewHolder(row) {
        public val itemName: TextView
        public val itemDate: TextView
        public val itemCat: TextView
        public val linearLayout: LinearLayout

        init {
            this.itemCat = row?.findViewById<TextView>(R.id.itemCatText) as TextView
            this.itemName = row.findViewById<TextView>(R.id.itemNameText) as TextView
            this.itemDate = row.findViewById<TextView>(R.id.itemDateText) as TextView
            this.linearLayout = row.findViewById<LinearLayout>(R.id.main_parent_layout) as LinearLayout
        }
    }


}



