/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright (c) ##copyright## ##author##
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package colorlib;

import processing.core.*;
import colorlib.Palette;
import colorlib.Swatch;

public class Tetrad extends Palette
{

	// TODO: Change this class name to Square? Tetrad is usually a rectangle.
	// See http://www.tigercolor.com/color-lab/color-theory/color-theory-intro.htm
	
	public Tetrad( final PApplet parent)
	{
		super( parent );
	}

	public Tetrad( final PApplet parent, final int color )
	{
		super( parent );
		createPalette( color );
	}
	
	public Tetrad setColor( final int color )
	{
		createPalette( color );
		return this;
	}
	
	@Override
	public void createPalette( final int color )
	{
		for ( int i = 0; i < 4; i++ ) {
			Swatch swatch = new Swatch( p, color );
			swatch.rotateRYB( i * 90 );
			swatches.add( swatch );
		}

	}
	
}
