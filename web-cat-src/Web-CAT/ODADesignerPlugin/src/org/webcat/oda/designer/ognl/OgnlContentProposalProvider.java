/*==========================================================================*\
 |  $Id: OgnlContentProposalProvider.java,v 1.1 2010/05/11 15:52:46 aallowat Exp $
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2008 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package org.webcat.oda.designer.ognl;

import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.webcat.oda.designer.widgets.IKeyProvider;

//------------------------------------------------------------------------
/**
 * TODO: real description
 *
 * @author Tony Allevato (Virginia Tech Computer Science)
 * @version $Id: OgnlContentProposalProvider.java,v 1.1 2010/05/11 15:52:46 aallowat Exp $
 */
public class OgnlContentProposalProvider implements IContentProposalProvider
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    public OgnlContentProposalProvider(IKeyProvider keyProvider)
    {
        this.keyProvider = keyProvider;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    public void setRootClassName(String value)
    {
        rootClassName = value;
    }


    // ----------------------------------------------------------
    public IContentProposal[] getProposals(String contents, int position)
    {
        contents = contents.substring(0, position - 1);

        String[] segments = contents.split("\\."); //$NON-NLS-1$
        String finalType = rootClassName;

        if (finalType == null)
            return null;

        for (String segment : segments)
        {
            finalType = keyProvider.getKeyType(finalType, segment);
        }

        if (finalType == null)
            return null;

        String[] keys = keyProvider.getKeys(finalType);
        IContentProposal[] proposals = new IContentProposal[keys.length];

        int i = 0;
        for (final String key : keys)
        {
            proposals[i] = new IContentProposal()
            {
                public String getContent()
                {
                    return key;
                }


                public int getCursorPosition()
                {
                    return key.length();
                }


                public String getDescription()
                {
                    return "description"; //$NON-NLS-1$
                }


                public String getLabel()
                {
                    return null;
                }

            };

            i++;
        }

        return proposals;
    }


    //~ Static/instance variables .............................................

    private String rootClassName;
    private IKeyProvider keyProvider;
}
