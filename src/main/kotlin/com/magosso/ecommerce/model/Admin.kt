package com.magosso.ecommerce.model

import java.util.*

data class Admin(
        val cName: String = "",
        val cAddress: String = "",
        val cEmail: String = "",
        val cPassword: String = "",
        val dCreated: Date = Calendar.getInstance().time,
        val dUpdate: Date = Calendar.getInstance().time)