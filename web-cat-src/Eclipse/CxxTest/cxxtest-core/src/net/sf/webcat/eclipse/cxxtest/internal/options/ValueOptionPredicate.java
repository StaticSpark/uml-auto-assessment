/*==========================================================================*\
 |  $Id: ValueOptionPredicate.java,v 1.2 2009/09/13 12:59:29 aallowat Exp $
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2009 Virginia Tech 
 |
 |	This file is part of Web-CAT Eclipse Plugins.
 |
 |	Web-CAT is free software; you can redistribute it and/or modify
 |	it under the terms of the GNU General Public License as published by
 |	the Free Software Foundation; either version 2 of the License, or
 |	(at your option) any later version.
 |
 |	Web-CAT is distributed in the hope that it will be useful,
 |	but WITHOUT ANY WARRANTY; without even the implied warranty of
 |	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |	GNU General Public License for more details.
 |
 |	You should have received a copy of the GNU General Public License
 |	along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package net.sf.webcat.eclipse.cxxtest.internal.options;


/**
 * An option predicate that matches a particular value.
 * 
 * @author  Tony Allevato (Virginia Tech Computer Science)
 * @author  latest changes by: $Author: aallowat $
 * @version $Revision: 1.2 $ $Date: 2009/09/13 12:59:29 $
 */
public class ValueOptionPredicate implements IOptionPredicate
{
	// === Methods ============================================================

	// ------------------------------------------------------------------------
	/**
	 * Creates a new ValueOptionPredicate with the specified value to match
	 * against.
	 * 
	 * @param value
	 *            the value that this predicate will match against.
	 */
	public ValueOptionPredicate(String value)
	{
		this.matchValue = value;
	}


	// ------------------------------------------------------------------------
	/**
	 * Returns true if the value is equal to the value that this predicate was
	 * created with.
	 * 
	 * @param value
	 *            the String to test
	 * 
	 * @return true if the value matches the value of the predicate; otherwise,
	 *         false.
	 */
	public boolean accept(String value)
	{
		return matchValue.equals(value);
	}


	// === Instance Variables =================================================

	/**
	 * The value to match against.
	 */
	private String matchValue;
}
