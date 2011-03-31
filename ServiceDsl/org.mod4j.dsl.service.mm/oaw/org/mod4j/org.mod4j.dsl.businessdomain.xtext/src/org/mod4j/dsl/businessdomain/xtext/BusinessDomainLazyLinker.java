package org.mendix.dsl.businessdomain.xtext;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Internal;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.xtext.XtextLinkingService;

public class BusinessDomainLazyLinker extends LazyLinker {
	
//    @Override
//    protected EObject createProxy(EObject obj, AbstractNode abstractNode,
//                    EReference eRef) {
//            EReference eOpposite = ((Internal) eRef).getEOpposite();
//            if (eOpposite != null) {
//                    List<EObject> linkedObjects = new XtextLinkingService()
//                                    .getLinkedObjects(obj, eRef,
//abstractNode);
//                    if (linkedObjects.size() == 1)
//                            return linkedObjects.get(0);
//            }
//            return super.createProxy(obj, abstractNode, eRef);
//    }

	   @Override
	     protected EObject createProxy(EObject obj, AbstractNode abstractNode, EReference eRef) {
	         final EObject proxy = super.createProxy(obj, abstractNode, eRef);
	         if (eRef.getEOpposite() != null) {
	             return EcoreUtil.resolve(proxy, obj);
	         }
	         return proxy;
	     }


}
