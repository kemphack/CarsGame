package com.mygdx.game.util

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3

// Vector2

operator fun Vector2.plus(v : Vector2) : Vector2 {
    return this.add(v)!!
}

operator fun Vector2.minus(v : Vector2) : Vector2 {
    return this.sub(v)!!
}

operator fun Vector2.times(v : Vector2) : Vector2 {
    return this.scl(v)!!
}

operator fun Vector2.unaryMinus(): Vector2 {
    return this.scl(-1.0f)
}

operator fun Vector2.times(f : Double) : Vector2 {
    return this.scl(f.toFloat())
}

operator fun Double.times(v : Vector2) : Vector2 {
    return v.scl(this.toFloat())!!
}

operator fun Vector2.div(v : Vector2) : Vector2 {
    this.x /= v.x
    this.y /= v.y
    return this
}

operator fun Vector2.div(f : Double) : Vector2 {
    this.x /= f.toFloat()
    this.y /= f.toFloat()
    return this
}

// Vector3

operator fun Vector3.plus(v : Vector3) : Vector3 {
    return this.add(v)!!
}

operator fun Vector3.minus(v : Vector3) : Vector3 {
    return this.sub(v)!!
}

operator fun Vector3.times(v : Vector3) : Vector3 {
    return this.scl(v)!!
}

operator fun Vector3.times(f : Double) : Vector3 {
    return this.scl(f.toFloat())
}

operator fun Vector3.div(v : Vector3) : Vector3 {
    this.x /= v.x
    this.y /= v.y
    this.z /= v.z
    return this
}

operator fun Vector3.div(f : Double) : Vector3 {
    this.x /= f.toFloat()
    this.y /= f.toFloat()
    this.z /= f.toFloat()
    return this
}
