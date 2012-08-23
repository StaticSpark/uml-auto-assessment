/*==========================================================================*\
 |  _Outcome.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to Outcome.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2009 Virginia Tech
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

package org.webcat.outcomesmeasurement;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import er.extensions.eof.ERXEOControlUtilities;
import er.extensions.eof.ERXKey;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * Outcome.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _Outcome
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _Outcome object.
     */
    public _Outcome()
    {
        super();
    }


    //~ Constants (for key names) .............................................

    // Relationship to base slice ---
    private static final String BASE_PREFIX = "outcome";
    private static final String BASE_PREFIX_DOT = BASE_PREFIX + ".";
    // Attributes ---
    public static final String DESCRIPTION_KEY = BASE_PREFIX_DOT + "description";
    public static final ERXKey<String> description =
        new ERXKey<String>(DESCRIPTION_KEY);
    public static final String KEY_PHRASE_KEY = BASE_PREFIX_DOT + "keyPhrase";
    public static final ERXKey<String> keyPhrase =
        new ERXKey<String>(KEY_PHRASE_KEY);
    public static final String LABEL_KEY = BASE_PREFIX_DOT + "label";
    public static final ERXKey<String> label =
        new ERXKey<String>(LABEL_KEY);
    public static final String MICRO_LABEL_KEY = BASE_PREFIX_DOT + "microLabel";
    public static final ERXKey<String> microLabel =
        new ERXKey<String>(MICRO_LABEL_KEY);
    // To-one relationships ---
    // To-many relationships ---
    public static final String IS_SUPPORTED_BY_KEY = BASE_PREFIX_DOT + "isSupportedBy";
    public static final ERXKey<org.webcat.outcomesmeasurement.Outcome> isSupportedBy =
        new ERXKey<org.webcat.outcomesmeasurement.Outcome>(IS_SUPPORTED_BY_KEY);
    public static final String OUTCOME_SETS_KEY = BASE_PREFIX_DOT + "outcomeSets";
    public static final ERXKey<org.webcat.outcomesmeasurement.OutcomeSet> outcomeSets =
        new ERXKey<org.webcat.outcomesmeasurement.OutcomeSet>(OUTCOME_SETS_KEY);
    public static final String SUPPORTS_KEY = BASE_PREFIX_DOT + "supports";
    public static final ERXKey<org.webcat.outcomesmeasurement.Outcome> supports =
        new ERXKey<org.webcat.outcomesmeasurement.Outcome>(SUPPORTS_KEY);
    // Fetch specifications ---


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public Outcome localInstance(EOEditingContext editingContext)
    {
        return (Outcome)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    @SuppressWarnings("unchecked")
    public NSDictionary<String, Object> changedProperties()
    {
        return changesFromSnapshot(
            editingContext().committedSnapshotForObject(this) );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>id</code> value.
     * @return the value of the attribute
     */
    public Number id()
    {
        try
        {
            return (Number)EOUtilities.primaryKeyForObject(
                editingContext() , this ).objectForKey( "id" );
        }
        catch (Exception e)
        {
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>description</code> value.
     * @return the value of the attribute
     */
    public String description()
    {
        return (String)storedValueForKey( "description" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>description</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDescription( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setDescription("
                + value + "): was " + description() );
        }
        takeStoredValueForKey( value, "description" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>keyPhrase</code> value.
     * @return the value of the attribute
     */
    public String keyPhrase()
    {
        return (String)storedValueForKey( "keyPhrase" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>keyPhrase</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setKeyPhrase( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setKeyPhrase("
                + value + "): was " + keyPhrase() );
        }
        takeStoredValueForKey( value, "keyPhrase" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>label</code> value.
     * @return the value of the attribute
     */
    public String label()
    {
        return (String)storedValueForKey( "label" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>label</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLabel( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLabel("
                + value + "): was " + label() );
        }
        takeStoredValueForKey( value, "label" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>microLabel</code> value.
     * @return the value of the attribute
     */
    public String microLabel()
    {
        return (String)storedValueForKey( "microLabel" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>microLabel</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMicroLabel( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMicroLabel("
                + value + "): was " + microLabel() );
        }
        takeStoredValueForKey( value, "microLabel" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>isSupportedBy</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    @SuppressWarnings("unchecked")
    public NSArray<org.webcat.outcomesmeasurement.Outcome> isSupportedBy()
    {
        return (NSArray)storedValueForKey( "isSupportedBy" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>isSupportedBy</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setIsSupportedBy( NSMutableArray<org.webcat.outcomesmeasurement.Outcome>  value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsSupportedBy("
                + value + "): was " + isSupportedBy() );
        }
        takeStoredValueForKey( value, "isSupportedBy" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>isSupportedBy</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToIsSupportedByRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToIsSupportedBy( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToIsSupportedBy("
                + value + "): was " + isSupportedBy() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.Outcome> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.Outcome>)isSupportedBy();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>isSupportedBy</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromIsSupportedByRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromIsSupportedBy( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "RemoveFromIsSupportedBy("
                + value + "): was " + isSupportedBy() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.Outcome> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.Outcome>)isSupportedBy();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>isSupportedBy</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToIsSupportedByRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToIsSupportedByRelationship("
                + value + "): was " + isSupportedBy() );
        }
        addObjectToBothSidesOfRelationshipWithKey(
            value, "isSupportedBy" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>isSupportedBy</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromIsSupportedByRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "removeFromIsSupportedByRelationship("
                + value + "): was " + isSupportedBy() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "isSupportedBy" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>isSupportedBy</code> relationship.
     *
     * @return The new entity
     */
    public org.webcat.outcomesmeasurement.Outcome createIsSupportedByRelationship()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "createIsSupportedByRelationship()" );
        }
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "Outcome" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "isSupportedBy" );
        return (org.webcat.outcomesmeasurement.Outcome)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>isSupportedBy</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteIsSupportedByRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteIsSupportedByRelationship("
                + value + "): was " + isSupportedBy() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "isSupportedBy" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>isSupportedBy</code> relationship.
     */
    public void deleteAllIsSupportedByRelationships()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteAllIsSupportedByRelationships(): was "
                + isSupportedBy() );
        }
        for (org.webcat.outcomesmeasurement.Outcome object : isSupportedBy())
        {
            deleteIsSupportedByRelationship(object);
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>outcomeSets</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    @SuppressWarnings("unchecked")
    public NSArray<org.webcat.outcomesmeasurement.OutcomeSet> outcomeSets()
    {
        return (NSArray)storedValueForKey( "outcomeSets" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>outcomeSets</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setOutcomeSets( NSMutableArray<org.webcat.outcomesmeasurement.OutcomeSet>  value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOutcomeSets("
                + value + "): was " + outcomeSets() );
        }
        takeStoredValueForKey( value, "outcomeSets" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>outcomeSets</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToOutcomeSetsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToOutcomeSets( org.webcat.outcomesmeasurement.OutcomeSet value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToOutcomeSets("
                + value + "): was " + outcomeSets() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.OutcomeSet> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.OutcomeSet>)outcomeSets();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>outcomeSets</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromOutcomeSetsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromOutcomeSets( org.webcat.outcomesmeasurement.OutcomeSet value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "RemoveFromOutcomeSets("
                + value + "): was " + outcomeSets() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.OutcomeSet> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.OutcomeSet>)outcomeSets();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>outcomeSets</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToOutcomeSetsRelationship( org.webcat.outcomesmeasurement.OutcomeSet value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToOutcomeSetsRelationship("
                + value + "): was " + outcomeSets() );
        }
        addObjectToBothSidesOfRelationshipWithKey(
            value, "outcomeSets" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>outcomeSets</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromOutcomeSetsRelationship( org.webcat.outcomesmeasurement.OutcomeSet value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "removeFromOutcomeSetsRelationship("
                + value + "): was " + outcomeSets() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "outcomeSets" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>outcomeSets</code> relationship.
     *
     * @return The new entity
     */
    public org.webcat.outcomesmeasurement.OutcomeSet createOutcomeSetsRelationship()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "createOutcomeSetsRelationship()" );
        }
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "OutcomeSet" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "outcomeSets" );
        return (org.webcat.outcomesmeasurement.OutcomeSet)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>outcomeSets</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteOutcomeSetsRelationship( org.webcat.outcomesmeasurement.OutcomeSet value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteOutcomeSetsRelationship("
                + value + "): was " + outcomeSets() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "outcomeSets" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>outcomeSets</code> relationship.
     */
    public void deleteAllOutcomeSetsRelationships()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteAllOutcomeSetsRelationships(): was "
                + outcomeSets() );
        }
        for (org.webcat.outcomesmeasurement.OutcomeSet object : outcomeSets())
        {
            deleteOutcomeSetsRelationship(object);
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>supports</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    @SuppressWarnings("unchecked")
    public NSArray<org.webcat.outcomesmeasurement.Outcome> supports()
    {
        return (NSArray)storedValueForKey( "supports" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>supports</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setSupports( NSMutableArray<org.webcat.outcomesmeasurement.Outcome>  value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSupports("
                + value + "): was " + supports() );
        }
        takeStoredValueForKey( value, "supports" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>supports</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToSupportsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToSupports( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToSupports("
                + value + "): was " + supports() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.Outcome> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.Outcome>)supports();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>supports</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromSupportsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSupports( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "RemoveFromSupports("
                + value + "): was " + supports() );
        }
        NSMutableArray<org.webcat.outcomesmeasurement.Outcome> array =
            (NSMutableArray<org.webcat.outcomesmeasurement.Outcome>)supports();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>supports</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToSupportsRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToSupportsRelationship("
                + value + "): was " + supports() );
        }
        addObjectToBothSidesOfRelationshipWithKey(
            value, "supports" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>supports</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSupportsRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "removeFromSupportsRelationship("
                + value + "): was " + supports() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "supports" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>supports</code> relationship.
     *
     * @return The new entity
     */
    public org.webcat.outcomesmeasurement.Outcome createSupportsRelationship()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "createSupportsRelationship()" );
        }
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "Outcome" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "supports" );
        return (org.webcat.outcomesmeasurement.Outcome)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>supports</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteSupportsRelationship( org.webcat.outcomesmeasurement.Outcome value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteSupportsRelationship("
                + value + "): was " + supports() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "supports" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>supports</code> relationship.
     */
    public void deleteAllSupportsRelationships()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteAllSupportsRelationships(): was "
                + supports() );
        }
        for (org.webcat.outcomesmeasurement.Outcome object : supports())
        {
            deleteSupportsRelationship(object);
        }
    }


    // ----------------------------------------------------------
    /**
     * Produce a string representation of this object.  This implementation
     * calls UserPresentableDescription(), which uses WebObjects' internal
     * mechanism to print out the visible fields of this object.  Normally,
     * subclasses would override userPresentableDescription() to change
     * the way the object is printed.
     *
     * @return A string representation of the object's value
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    // ----------------------------------------------------------
    /**
     * Hack to workaround the need to include the base relationship when
     * fetching objects vs. getting/setting their values via KVC.
     *
     * @param key the key to access
     * @return the value of the key
     */
    public Object valueForKey(String key)
    {
        if (key.equals(BASE_PREFIX))
        {
            return this;
        }

        if (key.startsWith(BASE_PREFIX_DOT))
        {
            key = key.substring(BASE_PREFIX_DOT.length());
        }

        return super.valueForKey(key);
    }


    // ----------------------------------------------------------
    /**
     * Hack to workaround the need to include the base relationship when
     * fetching objects vs. getting/setting their values via KVC.
     *
     * @param value the new value of the key
     * @param key the key to access
     */
    public void takeValueForKey(Object value, String key)
    {
        if (key.startsWith(BASE_PREFIX_DOT))
        {
            key = key.substring(BASE_PREFIX_DOT.length());
        }

        super.takeValueForKey(value, key);
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( Outcome.class );
}