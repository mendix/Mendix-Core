/*
* generated by Xtext
*/
package org.mendix.dsl.service.xtext.contentassist;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.mendix.crossx.broker.CrossxEnvironment;
import org.mendix.crossx.mm.crossx.ModelInfo;
import org.mendix.crossx.mm.crossx.Symbol;
import org.mendix.dsl.service.mm.ServiceDsl.AssociationMethod;
import org.mendix.dsl.service.mm.ServiceDsl.SpecialMethod;
import org.mendix.dsl.service.mm.ServiceDsl.CrudService;
import org.mendix.dsl.service.mm.ServiceDsl.DtoReference;
import org.mendix.dsl.service.mm.ServiceDsl.ServiceModel;
import org.mendix.dsl.service.xtext.contentassist.AbstractServiceProposalProvider;
import org.mendix.dsl.service.xtext.scoping.ServiceProposals;
import org.mendix.eclipse.util.EclipseUtil;

/**
 * see http://wiki.eclipse.org/Xtext/Documentation#Content_Assist on how to customize content assistant
 */
public class ServiceProposalProvider extends AbstractServiceProposalProvider {

	/**
	 * Get rid of the "Name - ID" default proposals
	 */
	@Override
	protected boolean doCreateIdProposals(){
		return false;
	}

	/**
	 * Get rid of the "Description" default proposals
	 */
	@Override
	protected boolean doCreateStringProposals(){
		return false;
	}

	@Override
	public void completeDtoReference_Modelname(EObject model, Assignment assignment, 
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
    	List<ModelInfo> models = CrossxEnvironment.findAllModelsInProject( EclipseUtil.getProjectName(model));
		
		for (ModelInfo minfo : models ) {
			if( minfo.getDslname().equals("DataContractDsl") ){
				propose(minfo.getModelname(), context, acceptor);
			}
		}
	}
	
	@Override
	public void completeDtoReference_Name(EObject model, Assignment assignment, 
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		DtoReference ref = (DtoReference)model;
		List<Symbol> dtos = CrossxEnvironment.findAllFromModel(ref.getModelname(), "Dto");

		for (Symbol sym : dtos) {
			propose(sym.getName(), context, acceptor);
		}
	}
	
	@Override
	public void completeAssociationMethod_Rolename(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		AssociationMethod method = (AssociationMethod)model;
		List<String> propoals = ServiceProposals.getRolenameProposals(method);
		for (String name : propoals) {
			propose(name, context, acceptor);
		}
	}

	@Override
	public void completeAssociationMethod_Part(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<String> propoals = ServiceProposals.getPartProposals(model);
		for (String name : propoals) {
			propose(name, context, acceptor);
		}
	}
	
    @Override
	public void completeAssociationMethod_Main(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    	AssociationMethod method = (AssociationMethod)model;
    	proposeAllBusinessClassDtos(context, acceptor, method.getModel());
	}

    @Override
	public void completeSpecialMethod_Dto(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    	SpecialMethod method = (SpecialMethod)model;
    	proposeAllBusinessClassDtos(context, acceptor, method.getModel());
	}

    @Override
	public void completeCrudService_Dto(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    	CrudService crud = (CrudService)model;
    	proposeAllBusinessClassDtos(context, acceptor, crud.getModel());
	}

	private void proposeAllBusinessClassDtos(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor, ServiceModel model) {
		List<String> propoals = ServiceProposals.allBusinessClassDtos(model);
		for (String name : propoals) {
			propose(name, context, acceptor);
		}
	}
	/** Create and register the proposal
	 * 
	 * @param name
	 * @param context
	 * @param acceptor
	 */
	public void propose(String name, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		String proposal = name;
		proposal = getValueConverter().toString(proposal, "reference");
		ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
		acceptor.accept(completionProposal);
	}


}
