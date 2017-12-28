package com.mygdx.game

import com.badlogic.gdx.math.Vector2
import com.mygdx.game.util.*

class Car(
        val mass: Float = 1.0f,
        var collider: MyBox = MyBox(0.0f, 0.0f, 7.0f, 20.0f),
        maxSpeed: Float = 300f,
        time: Float = 6f,
        val mu: Float = 1000f,
        private var rotationSpeed: Float = 0.0f,
        private var speed: Vector2 = Vector2(Vector2.Zero),
        private var acceleration: Vector2 = Vector2(Vector2.Zero)) {

    private val k = mass * 2.5f / time
    private val maxForce = k * maxSpeed

    fun turn(delta: Float, userForce: Float, userRotation: Double) {
        val tyaga = userForce * maxForce
        val friction = if(userForce == 0f) mu * MyBox.g else 0f

        acceleration = (collider.direction * tyaga - k * speed) / mass - friction * speed.normalized
        speed += delta * acceleration
        collider.coords += speed * delta
    }
}
