package com.mygdx.game

class MyBox(
        var x: Double = 0.0,
        var y: Double = 0.0,
        var h: Double = 0.0,
        var w: Double = 0.0,
        rotation_angle: Double = 0.0) {

    companion object {
        const val g = 9.8
    }

    var angle: Double = 0.0
        set(value) {
            field = value - Math.round(value / Math.PI / 2) * Math.PI * 2
        }

    init {
        if (h < 0 || w < 0) throw Error("уккщк! ВАША ДЛИНА МЕНЬШЕ НУЛЯ))")
        angle = rotation_angle
    }
}
