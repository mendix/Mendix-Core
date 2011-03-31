/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mendix.businessdomain.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import BusinessDomainDsl.AbstractType;
import BusinessDomainDsl.Association;
import BusinessDomainDsl.BoolProperty;
import BusinessDomainDsl.BusinessClass;
import BusinessDomainDsl.BusinessDomainModel;
import BusinessDomainDsl.DateTimeProperty;
import BusinessDomainDsl.DecimalProperty;
import BusinessDomainDsl.Enumeration;
import BusinessDomainDsl.EnumerationProperty;
import BusinessDomainDsl.IntegerProperty;
import BusinessDomainDsl.Multiplicity;
import BusinessDomainDsl.Property;
import BusinessDomainDsl.StringProperty;

public class BusinessClassHelpers {

    public static String getCollectionInterface(Association a) {
        if (isOne2Many(a) || isMany2Many(a)) {
            return a.isOrdered() ? "List" : "Set";
        }
        return null;
    }

    public static String getCollectionImplementation(Association a) {
        if (isOne2Many(a) || isMany2Many(a)) {
            return a.isOrdered() ? "ArrayList" : "HashSet";
        }
        return null;
    }

    public static boolean isOne2Many(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE) || (srcMult == Multiplicity.ZERO_ONE))
                && ((tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY));
    }

    public static boolean isOne2One(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE) || (srcMult == Multiplicity.ZERO_ONE))
                && ((tgtMult == Multiplicity.ONE) || (tgtMult == Multiplicity.ZERO_ONE));
    }

    public static boolean isMany2One(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY))
                && ((tgtMult == Multiplicity.ONE) || (tgtMult == Multiplicity.ZERO_ONE));
    }

    public static boolean isMany2Many(Association a) {
        Multiplicity srcMult = a.getSourceMultiplicity();
        Multiplicity tgtMult = a.getTargetMultiplicity();
        return ((srcMult == Multiplicity.ONE_MANY) || (srcMult == Multiplicity.ZERO_MANY))
                && ((tgtMult == Multiplicity.ONE_MANY) || (tgtMult == Multiplicity.ZERO_MANY));
    }

    public static boolean isCompositePart(BusinessClass cls) {
        for (Association a : cls.getAssociationsFrom()) {
            if (a.isComposite() && (a.getSourceMultiplicity() == Multiplicity.ONE)) {
                return true;
            }
        }
        return false;
    }

    public static String javaType(Property p) {
        if (p instanceof BoolProperty) {
            return javaType((BoolProperty) p);
        } else if (p instanceof StringProperty) {
            return javaType((StringProperty) p);
        } else if (p instanceof IntegerProperty) {
            return javaType((IntegerProperty) p);
        } else if (p instanceof DecimalProperty) {
            return javaType((DecimalProperty) p);
        } else if (p instanceof EnumerationProperty) {
            return javaType((EnumerationProperty) p);
        } else if (p instanceof DateTimeProperty) {
            return javaType((DateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaNullableType(Property p) {
        if (p instanceof BoolProperty) {
            return javaNullableType((BoolProperty) p);
        } else if (p instanceof StringProperty) {
            return javaNullableType((StringProperty) p);
        } else if (p instanceof IntegerProperty) {
            return javaNullableType((IntegerProperty) p);
        } else if (p instanceof DecimalProperty) {
            return javaNullableType((DecimalProperty) p);
        } else if (p instanceof EnumerationProperty) {
            return javaNullableType((EnumerationProperty) p);
        } else if (p instanceof DateTimeProperty) {
            return javaNullableType((DateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaDefaultValue(Property p) {
        if (p instanceof BoolProperty) {
            return javaDefaultValue((BoolProperty) p);
        } else if (p instanceof StringProperty) {
            return javaDefaultValue((StringProperty) p);
        } else if (p instanceof IntegerProperty) {
            return javaDefaultValue((IntegerProperty) p);
        } else if (p instanceof DecimalProperty) {
            return javaDefaultValue((DecimalProperty) p);
        } else if (p instanceof EnumerationProperty) {
            return javaDefaultValue((EnumerationProperty) p);
        } else if (p instanceof DateTimeProperty) {
            return javaDefaultValue((DateTimeProperty) p);
        }
        return "null";
    }

    public static String javaType(BoolProperty p) {
        return javaNullableType(p);
    }

    public static String javaNullableType(BoolProperty p) {
        return "Boolean";
    }

    public static String javaDefaultValue(BoolProperty p) {
        return "true";
    }

    public static String javaType(DateTimeProperty p) {
        return "DateTime";
    }

    public static String javaNullableType(DateTimeProperty p) {
        return javaType(p);
    }

    public static String javaDefaultValue(DateTimeProperty p) {
        return "null";
    }

    public static String javaType(EnumerationProperty p) {
        Enumeration e = p.getType();
        if (e == null) {
            System.err.println("ERROR in javaType() for EnumerationProperty");
            return "Object";
        }
        return p.getType().getName();
    }

    public static String javaNullableType(EnumerationProperty p) {
        return javaType(p);
    }

    public static String javaDefaultValue(EnumerationProperty p) {
        return "null";
    }

    public static String javaType(StringProperty p) {
        return "String";
    }

    public static String javaNullableType(StringProperty p) {
        return javaType(p);
    }

    public static String javaDefaultValue(StringProperty p) {
        return "null";
    }

    public static String javaType(IntegerProperty p) {
        return javaNullableType(p);
    }

    public static String javaNullableType(IntegerProperty p) {
        return "Integer";
    }

    public static String javaDefaultValue(IntegerProperty p) {
        return p.isNullable() ? "null" : "0";
    }

    public static String javaType(DecimalProperty p) {
        return javaNullableType(p);
    }

    public static String javaNullableType(DecimalProperty p) {
        return "Float";
    }

    public static String javaDefaultValue(DecimalProperty p) {
        return p.isNullable() ? "null" : "0F";
    }

    public static List<Property> getAllProperties(BusinessClass cls) {
        List<Property> result = new ArrayList<Property>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllProperties(cls.getSuperclass()));
        }
        result.addAll(cls.getProperties());
        return result;
    }

    public static List<Association> getAllAssociationsTo(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllAssociationsTo(cls.getSuperclass()));
        }
        result.addAll(cls.getAssociationsTo());
        return result;
    }

    public static List<Association> getAllAssociationsFrom(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getAllAssociationsFrom(cls.getSuperclass()));
        }
        result.addAll(cls.getAssociationsFrom());
        return result;
    }

    public static List<Association> getToOneAssociationsFrom(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        for (Association association : cls.getAssociationsFrom()) {
            if ((association.getSourceMultiplicity().compareTo(Multiplicity.ZERO_ONE) == 0)
                    && association.isBidirectional()) {
                result.add(association);
            }
        }
        return result;
    }

    public static List<Association> getToOneAssociationsTo(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        for (Association association : cls.getAssociationsTo()) {
            if (association.getTargetMultiplicity().compareTo(Multiplicity.ZERO_ONE) == 0) {
                result.add(association);
            }
        }
        return result;
    }
    
    public static List<Association> getAllToOneAssociationsInHierarchy(BusinessClass cls) {
        List<Association> result = new ArrayList<Association>();
        result.addAll(getToOneAssociationsToInHierarchy(cls));
        result.addAll(getToOneAssociationsFromInHierarchy(cls));
        return result;
    }

    public static List<Association> getToOneAssociationsToInHierarchy(BusinessClass cls) {
        
    	List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getToOneAssociationsToInHierarchy(cls.getSuperclass()));
        }
        result.addAll(getToOneAssociationsTo(cls));	
        return result;
    }
    
    public static List<Association> getToOneAssociationsFromInHierarchy(BusinessClass cls) {
        
    	List<Association> result = new ArrayList<Association>();
        if (cls.getSuperclass() != null) {
            result.addAll(getToOneAssociationsFromInHierarchy(cls.getSuperclass()));
        }
        result.addAll(getToOneAssociationsFrom(cls));
        return result;
    }

    public static boolean hasSubclasses(BusinessClass clazz) {
        BusinessDomainModel model = (BusinessDomainModel) clazz.eContainer();
        for (AbstractType type : model.getTypes()) {
            if (type instanceof BusinessClass) {
                BusinessClass businessClass = (BusinessClass) type;
                if (businessClass.getSuperclass() != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
