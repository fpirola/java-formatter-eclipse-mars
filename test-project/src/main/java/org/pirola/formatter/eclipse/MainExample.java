package org.pirola.formatter.eclipse;

import org.pirola.formatter.eclipse.a.very.very.very.very.very.very.longpackage.name.UtilString;

/*
 * Main example.
 * Copyright (C) 2015 Fabio Pirola <fabio@pirola.org>

 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
/**
 * Test main class.
 * @author Fabio Pirola <fabio@pirola.org>
 * @version 1.0
 * @since 2015-12-17
 */
public final class MainExample {

    /**
     * Constructor.
     * @since 2015-12-17
     */
    private MainExample() {

    }

    /**
     * Main class.
     * @since 2015-12-17
     * @param args
     *            Arguments.
     */
    public static void main(final String[] args) {
        System.out.println(UtilString.greeting());
        //CHECKSTYLE:OFF
        
    System.out.println(   "An incorrectly formatted line"       )    ;     
        //CHECKSTYLE:ON
    }
}
