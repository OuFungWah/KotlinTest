package com.oufenghua.kotlintest

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class UserListAdapter : Adapter<UserListAdapter.ViewHolder> {

    lateinit var list : List<User>

    init {

    }

    constructor(list : List<User>){
        this.list = list
    }

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): ViewHolder {
        return ViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int
    ) {
        TODO(
                "not implemented"
        ) //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder : RecyclerView.ViewHolder {

        lateinit var nameTv : TextView
        lateinit var ageTv : TextView
        lateinit var genderTv : TextView

        constructor(parent: ViewGroup) : super(
                LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )

        fun setText(user : User){
            // todo 无法
            nameTv = itemView.findViewById(R.id.item_user_name)
            ageTv = itemView.findViewById(R.id.item_user_name)
            nameTv = itemView.findViewById(R.id.item_user_name)
        }

    }

}