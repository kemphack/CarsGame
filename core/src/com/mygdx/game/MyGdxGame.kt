package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input.Keys
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class MyGdxGame : ApplicationAdapter() {
    lateinit var batch: SpriteBatch
    lateinit var img: Texture
    var car = Car()

    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()

        var x = 0.0f
        var y = 0.0f
        val speed = 1.0f

        if(Gdx.input.isKeyPressed(Keys.A)) y += speed
        if(Gdx.input.isKeyPressed(Keys.D)) y -= speed
        if(Gdx.input.isKeyPressed(Keys.W)) x += speed
        if(Gdx.input.isKeyPressed(Keys.S)) x -= speed

        car.turn(Gdx.graphics.deltaTime, x, y)

        batch.draw(img, car.collider.coords.x, car.collider.coords.y)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}
