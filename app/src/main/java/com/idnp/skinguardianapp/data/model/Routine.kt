package com.idnp.skinguardianapp.data.model

data class Routine(
    val title: String,
    val Description: String,
    var isSelected: Boolean = false,
    var tieneTemporizador: Boolean = false,
    var tiempoTemporizador: Long = 15000L) {
}