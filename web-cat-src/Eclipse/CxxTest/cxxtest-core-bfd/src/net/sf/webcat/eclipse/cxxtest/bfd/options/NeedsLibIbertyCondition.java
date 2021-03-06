/*==========================================================================*\
 |  $Id: NeedsLibIbertyCondition.java,v 1.2 2009/09/13 12:59:13 aallowat Exp $
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

package net.sf.webcat.eclipse.cxxtest.bfd.options;

import net.sf.webcat.eclipse.cxxtest.bfd.StaticLibraryManager;
import net.sf.webcat.eclipse.cxxtest.options.IExtraOptionsEnablement;

import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.core.resources.IProject;

//------------------------------------------------------------------------
/**
 * TODO: real description
 *  
 * @author  Tony Allevato (Virginia Tech Computer Science)
 * @author  latest changes by: $Author: aallowat $
 * @version $Revision: 1.2 $ $Date: 2009/09/13 12:59:13 $
 */
public class NeedsLibIbertyCondition implements IExtraOptionsEnablement
{
	//~ Methods ...............................................................
	
	// ----------------------------------------------------------
	/**
	 * TODO: real description
	 */
	public boolean shouldProcessOptions(IProject project,
	        IConfiguration configuration)
	{
		return StaticLibraryManager.getInstance().shouldAddIbertyToBuild();
	}
}
