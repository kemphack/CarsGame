class Box2D(
    var x: Double = 0, var y: Double = 0,
    var h: Double = 0, var w: Double = 0,
    var angle: Double =
        get() = field
        set(value) = field = value - value * Int(value / 2 / PI)) {
    init {
        if (h < 0 || w < 0) throw "уккщк! ВАША ДЛИНА МЕНЬШЕ НУЛЯ))"
    }
}

const val g = 9.8

class Car(
    val koeff: Double,
    val mu: Double = 0.7,
    val maxAcceleration: Double,
    val mass: Double = 1000,
    var collider = Box2D(0, 0, 7, 20),
    var speed: Vector2D = 0,
    var acceleration: Vector2D = 0) {

    fun turn(delta: Double, userForce: Double, userRotation: Double) {
        collider.x += speed.x * delta
        collider.y += speed.y * delta
        var tyaga = acceleration.normalized *
            Math.min(
                acceleration.abs,
                maxAcceleration - koeff * Math.exp(-userForce)
            )
        acceleration = tyaga - Math.sin(userRotation) * mu * mass * g
        speed += delta * acceleration
    }
}
