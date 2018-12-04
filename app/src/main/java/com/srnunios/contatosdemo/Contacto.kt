package com.srnunios.contatosdemo


class Contacto : Comparable<Contacto>{

    override operator fun compareTo(c: Contacto): Int {
        if (this.name < c.name) {
            return 1
        } else if (this.name > c.name) {
            return -1
        }
        return 0
    }


    var name: String = String()
    var number: String = String()

    constructor(nome: String, numero: String) {
        this.name = nome
        this.number = numero
    }

}