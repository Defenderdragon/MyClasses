package com.geometrysmash.game.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

/**
 * Created by DENIS on 29.03.2016.
 */
public class Font {
    BitmapFont mBitmapFont;
    public Font(int size, float r, float b, float g, float a) {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font/LinLibertine_R.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = size;
        mBitmapFont = generator.generateFont(parameter);
        generator.dispose();
        mBitmapFont.setColor(r, g, b, a);
    }

    public Font(int size, float r, float b, float g, float a, String fontUrl) {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(fontUrl));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = size;
        mBitmapFont = generator.generateFont(parameter);
        generator.dispose();
        mBitmapFont.setColor(r, g, b, a);
    }
}
