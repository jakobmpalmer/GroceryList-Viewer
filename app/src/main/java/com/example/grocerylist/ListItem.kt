package com.example.grocerylist

import android.view.View

//class ListItem (checked: Boolean, edited: Boolean, date: String, roomId: String, name: String, category: String) {
class ListItem {

    lateinit var itemName: String
    lateinit var itemCat: String
    lateinit var itemDate: String
    private var checked: Boolean = false
    private var edited: Boolean = false
    lateinit var roomID: String


    constructor(checked: Boolean, edited: Boolean, date: String, roomId: String, name: String, category: String){
        this.checked = checked
        this.edited = edited
        this.itemDate = date
        this.itemName = name
        this.itemCat = category
        this.roomID = roomId
    }

}



//{
//            "checked": false,
//            "edited": false,
//            "date": "2020-06-03T05:58:03.474Z",
//            "_id": "5ed73beb9fa5a7001710a905",
//            "content": "hard alcohol *100 ",
//            "category": "Spices"
//        }