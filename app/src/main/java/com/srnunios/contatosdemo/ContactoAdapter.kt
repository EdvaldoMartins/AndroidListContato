package com.srnunios.contatosdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ContactoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    var contactos : MutableList<Contacto> = ArrayList()

    constructor(){
        contactos = ArrayList()
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(p0.getContext()).inflate(R.layout.item_contacto, p0, false)
        return ContactoModel(view)
    }

    override fun getItemCount(): Int {
        return contactos.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        var contacto = contactos.get(p1)
        (p0 as ContactoModel).nome!!.setText(""+contacto.name)
        (p0 as ContactoModel).numero!!.setText(""+contacto.number)
    }

    class ContactoModel(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nome : TextView ?=  null
        var numero : TextView ?=  null

        init {
            nome = itemView.findViewById(R.id.tv_nome)
            numero = itemView.findViewById(R.id.tv_numero)
        }
    }
}