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
package BusinessDomainDsl.validation;

import java.util.ArrayList;
import java.util.List;

import BusinessDomainDsl.BusinessClass;

public class ValidationUtils {

	public static boolean circularInheritance(BusinessClass cls){
		if( cls.getSuperclass() == null ) { return false; }

		List<BusinessClass> tmp = new ArrayList<BusinessClass>();
		return checkInheritance(tmp, cls.getSuperclass(), cls);
	}
	
	private static boolean checkInheritance(List<BusinessClass> children, BusinessClass cls, BusinessClass original) {
		if( children.contains(original) ) {
			return true;
		} else if( children.contains(cls) ){
			return false;
		} else {
			if( cls.getSuperclass() == null ) {
				return false; 
			}
			children.add(cls);
			return checkInheritance(children, cls.getSuperclass(), original);
		}
	}
}
