/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Courier">WorkProductDefinition</font> <font
 *     face="Times New Roman">é uma metaclasse que representa os produtos de</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">trabalho (</font><i><font face="Times New Roman">Work Products</font></i><font
 *     face="Times New Roman">) resultantes da execução de atividades ou tarefas de um PDS.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">WorkProductDefinitionRelationship</font> <font
 *     face="Times New Roman">é uma metaclasse que estende</font> <font face="Courier">Reuse</font>
 * </p>
 * <p align="left">
 *     <font face="Courier">Relationship</font> <font face="Times New Roman">do SPEM v2, sendo então um relacionamento capaz
 *     de definir níveis</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">reuso.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Existem
 *     diversos produtos de trabalho que são construídos durante a execução</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">de alguma atividade ou tarefa do PDS. Tais produtos
 *     geralmente são tratados como artefatos,</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">entretanto, em nossa abordagem, pode ser qualquer fragmento
 *     de informação, tipo ou seção</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">que foi produzida. A metaclasse</font> <font
 *     face="Courier">WorkProductDefinition</font> <font face="Times New Roman">representa quaisquer tipos de</font></font>
 * </p>
 * <p>
 *     <font face="Times New Roman"><font face="Times New Roman">produtos de trabalho.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.WorkProductDefinition#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link spemarti.WorkProductDefinition#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getWorkProductDefinition()
 * @model abstract="true"
 * @generated
 */
public interface WorkProductDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Name</em>' attribute.
	 * @see #setPresentationName(String)
	 * @see spemarti.SpemartiPackage#getWorkProductDefinition_PresentationName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPresentationName();

	/**
	 * Sets the value of the '{@link spemarti.WorkProductDefinition#getPresentationName <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Name</em>' attribute.
	 * @see #getPresentationName()
	 * @generated
	 */
	void setPresentationName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see spemarti.SpemartiPackage#getWorkProductDefinition_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link spemarti.WorkProductDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // WorkProductDefinition
