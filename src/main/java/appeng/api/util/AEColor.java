/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 AlgorithmX2
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package appeng.api.util;


import net.minecraft.util.StatCollector;

import java.util.Arrays;
import java.util.List;


/**
 * List of all colors supported by AE, their names, and various colors for display.
 * <p>
 * Should be the same order as Dyes, excluding Transparent.
 */
public enum AEColor
{

	White( "gui.appliedenergistics2.White", 0x737373, 0x999999, 0xD1D1D1 ),

	Orange( "gui.appliedenergistics2.Orange", 0xCC6600, 0xff8000, 0xFF9933 ),

	Magenta( "gui.appliedenergistics2.Magenta", 0x990099, 0xCC00CC, 0xCC3DCC ),

	LightBlue( "gui.appliedenergistics2.LightBlue", 0x3BB8B8, 0x80DCDC, 0xA9FFFF ),

	Yellow( "gui.appliedenergistics2.Yellow", 0xFFF7AA, 0xF8FF4A, 0xFFFFE8 ),

	Lime( "gui.appliedenergistics2.Lime", 0x308E19, 0x3BBE2C, 0x6CE96B ),

	Pink( "gui.appliedenergistics2.Pink", 0xDC8DB5, 0xF8B5D7, 0xF7DEEB ),

	Gray( "gui.appliedenergistics2.Gray", 0x7C7C7C, 0xA0A0A0, 0xC9C9C9 ),

	LightGray( "gui.appliedenergistics2.LightGray", 0x9D9D9D, 0xCDCDCD, 0xEFEFEF ),

	Cyan( "gui.appliedenergistics2.Cyan", 0x2F9BA5, 0x51AAC6, 0xAEDDF4 ),

	Purple( "gui.appliedenergistics2.Purple", 0x8230B2, 0xA453CE, 0xC7A3CC ),

	Blue( "gui.appliedenergistics2.Blue", 0x2D29A0, 0x514AFF, 0xDDE6FF ),

	Brown( "gui.appliedenergistics2.Brown", 0x724E35, 0xB7967F, 0xE0D2C8 ),

	Green( "gui.appliedenergistics2.Green", 0x287128, 0x329032, 0x56AA56 ),

	Red( "gui.appliedenergistics2.Red", 0x600A0A, 0x8A0F0F, 0xCC1616 ),

	Black( "gui.appliedenergistics2.Black", 0x080808, 0x201C20, 0x302C30 ),

	Transparent( "gui.appliedenergistics2.Fluix", 0x455E93, 0x98A4BC, 0xACB8CB );

	public static final List<AEColor> VALID_COLORS = Arrays.asList( White, Orange, Magenta, LightBlue, Yellow, Lime, Pink, Gray, LightGray, Cyan, Purple, Blue, Brown, Green, Red, Black );

	/**
	 * Unlocalized name for color.
	 */
	public final String unlocalizedName;

	/**
	 * Darkest Variant of the color, nearly black; as a RGB HEX Integer
	 */
	public final int blackVariant;

	/**
	 * The Variant of the color that is used to represent the color normally; as a RGB HEX Integer
	 */
	public final int mediumVariant;

	/**
	 * Lightest Variant of the color, nearly white; as a RGB HEX Integer
	 */
	public final int whiteVariant;

	AEColor( final String unlocalizedName, final int blackHex, final int medHex, final int whiteHex )
	{
		this.unlocalizedName = unlocalizedName;
		this.blackVariant = blackHex;
		this.mediumVariant = medHex;
		this.whiteVariant = whiteHex;
	}

	/**
	 * Logic to see which colors match each other.. special handle for Transparent
	 */
	public boolean matches( final AEColor color )
	{
		return this == Transparent || color == Transparent || this == color;
	}

	@Override
	public String toString()
	{
		return StatCollector.translateToLocal( this.unlocalizedName );
	}

}
