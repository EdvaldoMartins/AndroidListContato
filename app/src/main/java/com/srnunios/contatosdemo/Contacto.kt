package com.srnunios.contatosdemo

import android.support.annotation.NonNull



class Contacto : Comparable<Contacto>{

    override operator fun compareTo(c: Contacto): Int {
        if (this.nome < c.nome) {
            return 1
        } else if (this.nome > c.nome) {
            return -1
        }
        return 0
    }


    var nome: String = String()
    var numero: String = String()

    constructor(nome: String, numero: String) {
        this.nome = nome
        this.numero = numero
    }

}