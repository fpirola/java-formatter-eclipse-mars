package org.pirola.formatter.eclipse;

/*
 * Enumerator example.
 * Copyright (C) 2015 Fabio Pirola <fabio@pirola.org>

 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

/**
 * Enumerator example.
 * @author Fabio Pirola <fabio@pirola.org>
 * @version 1.0
 * @since 2015-12-17
 */
public enum EnumeratorExample {
    /** One. */
    ONE(1),
    /** Two. */
    TWO(2),
    /** Three. */
    THREE(3);

    /** Value. */
    private final int value;

    /**
     * Constructor.
     * @since 2015-12-17
     * @param aValue
     *            Input value.
     */
    EnumeratorExample(final int aValue) {
        this.value = aValue;
    }

    /**
     * Get value.
     * @since 2015-12-17
     * @return Value.
     */
    public int getValue() {
        return value;
    }

}
