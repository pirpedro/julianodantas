import spemarti.ArtifactContainer_Relationship;
import spemarti.ArtifactDefinition;
import spemarti.ArtifactKinds;
import spemarti.ContainerDefinition;
import spemarti.ContainerDefinition_Relationship;
import spemarti.ContainerFragment_Relationship;
import spemarti.FragmentDefinition;
import spemarti.Image;
import spemarti.LabeledText;
import spemarti.List;
import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;
import spemarti.Table;
import spemarti.Text;


public class ChangeRequest {

	private SpemartiFactory spemartiFactory;

	public ChangeRequest() {
		spemartiFactory = SpemartiPackage.eINSTANCE.getSpemartiFactory();
	}

	public ArtifactDefinition createDocumentStructure(){
		
		// Root
		ArtifactDefinition changeReq = spemartiFactory.createArtifactDefinition();
		changeReq.setPresentationName("Solicita��o de Mudan�a de Requisito");
		
		changeReq.setAKind(ArtifactKinds.get(ArtifactKinds.DOCUMENT_VALUE));
		
		// Container Cabe�alho
		ContainerDefinition header = this.createHeader(changeReq);
		this.associateArtifactContainer(changeReq, header);
		
		// Container Se��o 1
		ContainerDefinition section1 = spemartiFactory.createContainerDefinition();
		section1.setPresentationName("Registro de Solicita��o de Mudan�a");

		Table table = spemartiFactory.createTable();
		List tbHeader = spemartiFactory.createList();
		
		Text solicitante = spemartiFactory.createText();
		solicitante.setValue("Solicitante");
		Text unidade = spemartiFactory.createText();
		unidade.setValue("Unidade");
		Text contato = spemartiFactory.createText();
		contato.setValue("Contato");
		
		tbHeader.getContents().add(solicitante);
		tbHeader.getContents().add(unidade);
		tbHeader.getContents().add(contato);
		
		table.setHeader(tbHeader);
		
		this.associateContainerFragment(section1, table);
		
		this.associateArtifactContainer(changeReq, section1);
		
		// Container Se��o 2
		ContainerDefinition section2 = spemartiFactory.createContainerDefinition();
		section2.setPresentationName("Tipo da Mudan�a");
		
		LabeledText update = spemartiFactory.createLabeledText();
		update.setLabel("Altera��o");
		this.associateContainerFragment(section2, update);

		LabeledText canceling = spemartiFactory.createLabeledText();
		canceling.setLabel("Cancelamento");
		this.associateContainerFragment(section2, canceling);
		
		ContainerDefinition functional = spemartiFactory.createContainerDefinition();
		functional.setPresentationName("Funcional");
		
		LabeledText newReq = spemartiFactory.createLabeledText();
		newReq.setLabel("Novo requisito");
		this.associateContainerFragment(functional, newReq);

		LabeledText updateReq = spemartiFactory.createLabeledText();
		updateReq.setLabel("Altera��o de requisito");
		this.associateContainerFragment(functional, updateReq);

		LabeledText deleteReq = spemartiFactory.createLabeledText();
		deleteReq.setLabel("Exclus�o de requisito");
		this.associateContainerFragment(functional, deleteReq);
		
		this.aggregateContainer(section2, functional);
		
		ContainerDefinition nonfunctional = spemartiFactory.createContainerDefinition();
		nonfunctional.setPresentationName("N�o Funcional");
		
		LabeledText infra = spemartiFactory.createLabeledText();
		infra.setLabel("Referente a infra-estrutura");
		this.associateContainerFragment(functional, infra);

		LabeledText support = spemartiFactory.createLabeledText();
		support.setLabel("Referente ao apoio");
		this.associateContainerFragment(functional, support);

		LabeledText others = spemartiFactory.createLabeledText();
		others.setLabel("Outros");
		this.associateContainerFragment(functional, others);

		this.aggregateContainer(section2, nonfunctional);

		this.associateArtifactContainer(changeReq, section2);

		// Container Se��o 3
		ContainerDefinition section3 = spemartiFactory.createContainerDefinition();
		section3.setPresentationName("Descri��o da Mudan�a");
		
		Text text = spemartiFactory.createText();
		this.associateContainerFragment(section3, text);
		
		this.associateArtifactContainer(changeReq, section3);

		return changeReq;
	}

	public ArtifactDefinition createEvaluationStructure(){
		
		// Root
		ArtifactDefinition changeReqEval = spemartiFactory.createArtifactDefinition();
		changeReqEval.setPresentationName("Avalia��o da Solicita��o de Mudan�a");
		
		changeReqEval.setAKind(ArtifactKinds.get(ArtifactKinds.DOCUMENT_VALUE));
		
		// Container Cabe�alho
		ContainerDefinition header = this.createHeader(changeReqEval);
		this.associateArtifactContainer(changeReqEval, header);
		
		// Container Se��o 1
		ContainerDefinition section1 = spemartiFactory.createContainerDefinition();
		section1.setPresentationName("Registro de Solicita��o de Mudan�a");
		
		Table table = spemartiFactory.createTable();
		List tbHeader = spemartiFactory.createList();
		
		Text solicitante = spemartiFactory.createText();
		solicitante.setValue("Solicitante");
		Text unidade = spemartiFactory.createText();
		unidade.setValue("Unidade");
		Text contato = spemartiFactory.createText();
		contato.setValue("Contato");
		
		tbHeader.getContents().add(solicitante);
		tbHeader.getContents().add(unidade);
		tbHeader.getContents().add(contato);
		
		table.setHeader(tbHeader);
		
		this.associateContainerFragment(section1, table);
		
		this.associateArtifactContainer(changeReqEval, section1);
		
		// Container Se��o 2
		ContainerDefinition section2 = spemartiFactory.createContainerDefinition();
		section2.setPresentationName("Descri��o da Mudan�a Conforme Solicitante");

		Text text = spemartiFactory.createText();
		this.associateContainerFragment(section2, text);
		
		this.associateArtifactContainer(changeReqEval, section2);

		// Container Se��o 3
		ContainerDefinition section3 = spemartiFactory.createContainerDefinition();
		section3.setPresentationName("�rvore de Depend�ncia entre Requisitos");

		Image image = spemartiFactory.createImage();
		this.associateContainerFragment(section2, image);
		
		this.associateArtifactContainer(changeReqEval, section3);

		// Container Se��o 4
		ContainerDefinition section4 = spemartiFactory.createContainerDefinition();
		section4.setPresentationName("Requisitos Envolvidos / Impacto no Tempo e Custo da Mudan�a");
		
		Table table2 = spemartiFactory.createTable();
		List tbHeader2 = spemartiFactory.createList();
		
		Text number = spemartiFactory.createText();
		number.setValue("N�mero");
		Text changedReq = spemartiFactory.createText();
		changedReq.setValue("Requisito Alterado");
		Text changeType = spemartiFactory.createText();
		changeType.setValue("Tipo de Mudan�a");
		Text changeTime = spemartiFactory.createText();
		changeTime.setValue("Tempo de Implementa��o da Mudan�a");
		Text changedArts = spemartiFactory.createText();
		changedArts.setValue("Artefatos Alterados");
		
		tbHeader2.getContents().add(number);
		tbHeader2.getContents().add(changedReq);
		tbHeader2.getContents().add(changeType);
		tbHeader2.getContents().add(changeTime);
		tbHeader2.getContents().add(changedArts);
		
		table2.setHeader(tbHeader2);
		
		this.associateContainerFragment(section4, table2);
		
		this.associateArtifactContainer(changeReqEval, section4);

		// Container Se��o 4
		ContainerDefinition section5 = spemartiFactory.createContainerDefinition();
		section5.setPresentationName("Comprometimento com a Mudan�a");
		
		Table table3 = spemartiFactory.createTable();
		List tbHeader3 = spemartiFactory.createList();
		
		Text colaborador = spemartiFactory.createText();
		colaborador.setValue("Colaborador");
		Text changedArt = spemartiFactory.createText();
		changedArt.setValue("Artefatos Alterados");
		Text changeSchedule = spemartiFactory.createText();
		changeSchedule.setValue("Prazo");
		
		tbHeader3.getContents().add(colaborador);
		tbHeader3.getContents().add(changedArt);
		tbHeader3.getContents().add(changeSchedule);
		
		table3.setHeader(tbHeader3);
		
		this.associateContainerFragment(section5, table3);
		
		this.associateArtifactContainer(changeReqEval, section5);
		
		return changeReqEval;
	}
	
	private ContainerDefinition createHeader(ArtifactDefinition artifact){
		
		ContainerDefinition header = spemartiFactory.createContainerDefinition();
		header.setPresentationName("Cabe�alho");
		
		LabeledText org = spemartiFactory.createLabeledText();
		org.setLabel("Organiza��o");
		this.associateContainerFragment(header, org);
		
		LabeledText project = spemartiFactory.createLabeledText();
		project.setLabel("Projeto");
		this.associateContainerFragment(header, project);
		
		LabeledText responsible = spemartiFactory.createLabeledText();
		responsible.setLabel("Respons�vel");
		this.associateContainerFragment(header, responsible);
		
		LabeledText orderer = spemartiFactory.createLabeledText();
		orderer.setLabel("Solicitante");
		this.associateContainerFragment(header, orderer);
		
		LabeledText costumer = spemartiFactory.createLabeledText();
		costumer.setLabel("Cliente");
		this.associateContainerFragment(header, costumer);
		
		LabeledText reqNumber = spemartiFactory.createLabeledText();
		reqNumber.setLabel("Nr da Solicita��o");
		this.associateContainerFragment(header, reqNumber);
		
		LabeledText reqDate = spemartiFactory.createLabeledText();
		reqDate.setLabel("Data da Solicita��o");
		this.associateContainerFragment(header, reqDate);
		
		LabeledText orgUnit = spemartiFactory.createLabeledText();
		orgUnit.setLabel("Unidade Organizacional");
		this.associateContainerFragment(header, orgUnit);
		
		return header;
	}


	private void associateArtifactContainer(ArtifactDefinition artifact, ContainerDefinition container){
		
		if(artifact == null || container == null) return;
		
		ArtifactContainer_Relationship acr = spemartiFactory.createArtifactContainer_Relationship();
		acr.getContainers().add(container);
		container.getArtifactContainer_Relationship().add(acr);
		acr.setArtifact(artifact);
		artifact.getArtifactContainer_Relationship().add(acr);
	}

	private void associateContainerFragment(ContainerDefinition container, FragmentDefinition fragment){
		
		if(fragment == null || container == null) return;

		ContainerFragment_Relationship cfr = spemartiFactory.createContainerFragment_Relationship();
		cfr.getContainer().add(container);
		container.getContainerFragment_Relationship().add(cfr);
		cfr.getContainers().add(fragment);
	}
	
	private void aggregateContainer(ContainerDefinition parent, ContainerDefinition child){
		
		if(parent == null || child == null) return;

		ContainerDefinition_Relationship cdr = spemartiFactory.createContainerDefinition_Relationship();
		cdr.setParent(parent);
		parent.getContainerDefinition_Relationship().add(cdr);
		cdr.getChildren().add(child);
		child.getContainerDefinition_Relationship2().add(cdr);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
