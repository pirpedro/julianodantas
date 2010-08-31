/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Information Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Courier">Simple Information Element</font> <font
 *     face="Times New Roman">é uma metaclasse abstrata para generalizar</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">qualquer elemento que modele o conceito de Tipo de Informação e que utilize apenas
 *     os</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">tipos primitivos definidos através de</font> <i><font face="Times New Roman">UML
 *     DataType</font></i> <font face="Times New Roman">(Object Management Group, 2007b).</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Independente do Processo de Software
 *     escolhido, algumas estruturas de informação</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">são genéricamente utilzados. Conforme existem diversos tipos de informações, o</font>
 * </p>
 * <p align="left">
 *     <font face="Courier">SimpleInformationElement</font> <font face="Times New Roman">determina os tipos mais simples que
 *     possam existir, desde</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">que sejam independentes de processo e utilizem apenas tipos de dados definidos
 *     previamente</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">pela</font> <i><font face="Times New Roman">UML DataType</font></i> <font
 *     face="Times New Roman">(i.e.</font> <i><font face="Times New Roman">Boolean</font></i><font
 *     face="Times New Roman">,</font> <i><font face="Times New Roman">Integer</font></i><font face="Times New Roman">,</font>
 *     <i><font face="Times New Roman">String</font></i> <font face="Times New Roman">e</font> <i><font
 *     face="Times New Roman">UnlimitedNatural</font></i><font face="Times New Roman">).</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.SimpleInformationElement#getDiscriminator <em>Discriminator</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getSimpleInformationElement()
 * @model abstract="true"
 * @generated
 */
public interface SimpleInformationElement extends VersionedExtent, FragmentDefinition {

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see spemarti.SpemartiPackage#getSimpleInformationElement_Discriminator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link spemarti.SimpleInformationElement#getDiscriminator <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' attribute.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(String value);
} // SimpleInformationElement
