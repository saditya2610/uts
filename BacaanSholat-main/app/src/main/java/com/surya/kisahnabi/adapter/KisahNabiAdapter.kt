package com.surya.kisahnabi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.surya.kisahnabi.R
import com.surya.kisahnabi.model.ModelBacaan
import kotlinx.android.synthetic.main.list_kisah_nabi.view.*



class KisahNabiAdapter(private val modelBacaan: List<ModelBacaan>) : RecyclerView.Adapter<KisahNabiAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_kisah_nabi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(listViewHolder: ListViewHolder, i: Int) {
        val dataModel = modelBacaan[i]
        listViewHolder.txtId.text = dataModel.id
        listViewHolder.txtName.text = dataModel.name

        listViewHolder.txtCerita.text = dataModel.cerita
    }

    override fun getItemCount(): Int {
        return modelBacaan.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtId: TextView
        var txtName: TextView
        var txtCerita: TextView

        init {
            txtId = itemView.txtId
            txtName = itemView.txtName
            txtCerita = itemView.txtCerita
        }
    }

}