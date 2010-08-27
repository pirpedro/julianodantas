/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Text</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Text</font> <font face="Times New Roman">estrutura o tipo de informação Texto.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">Text</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">SimpleInformationElement</font> <font face="Times New Roman">definindo o conceito de texto a um</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">tipo simples de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Atributos:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">value</font></b><font face="Times New Roman">:</font>
 *     <i><font face="Times New Roman">String</font></i><font face="Times New Roman">, conteúdo do texto a ser
 *     preenchido.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Artefatos de Software possuem textos
 *     para representar o conhecimento necessários</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">através de palavras. O conceito de texto foimodelado simplesmente através
 *     dametaclasse</font>
 * </p>
 * <p>
 *     <font face="Courier">Text</font><font face="Times New Roman">, que define um atributo para armazenar o conteúdo a ser
 *     preenchido.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Text#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getText()
 * @model
 * @generated
 */
public interface Text extends SimpleInformationElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see spemarti.SpemartiPackage#getText_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link spemarti.Text#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Text
