/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">LabeledText</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">LabeledText</font> <font face="Times New Roman">estrutura o tipo de informação Texto Rotulado,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">desde que seja necessária a utilização de algum rótulo para identificar um texto.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">LabeledText</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">Text</font> <font face="Times New Roman">definindo o conceito de texto rotulado como um tipo
 *     simples</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Atributos:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">label</font></b><font face="Times New Roman">:</font>
 *     <i><font face="Times New Roman">String</font></i><font face="Times New Roman">, conteúdo do rótulo identificador a ser
 *     preenchido. Este atributo possui uma</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">restrição em relação ao seu tamanho, podendo ser no máximo de 15 caracteres. Isto é</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">expressado em OCL da seguinte forma:</font>
 * </p>
 * <p align="left">
 *     <font face="Courier">LabeledText</font>
 * </p>
 * <p align="left">
 *     <font face="Courier">self.label.size() &lt;= 15</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Artefatos de Software possuem textos
 *     para representar o conhecimento necessários</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">através de palavras. Alguns desses textos precisam ser rotulados para uma melhor</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">identificação, assim como “</font><i><font face="Times New Roman">name:</font></i> <font
 *     face="Times New Roman">Marcos”, por exemplo. O conceito de texto rotulado foi modelado</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">através da metaclasse</font> <font face="Courier">LabeledText</font><font
 *     face="Times New Roman">, que define um atributo para armazenar o rótulo</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">a ser preenchido.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.LabeledText#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getLabeledText()
 * @model
 * @generated
 */
public interface LabeledText extends Text {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p align="left">
	 *     <b><font face="Times New Roman">label</font></b><font face="Times New Roman">:</font> <i><font
	 *     face="Times New Roman">String</font></i><font face="Times New Roman">, conteúdo do rótulo identificador a ser
	 *     preenchido. Este atributo possui uma</font>
	 * </p>
	 * <p align="left">
	 *     <font face="Times New Roman">restrição em relação ao seu tamanho, podendo ser no máximo de 15 caracteres. Isto é</font>
	 * </p>
	 * <p align="left">
	 *     <font face="Times New Roman">expressado em OCL da seguinte forma:</font>
	 * </p>
	 * <p align="left">
	 *     <font face="Courier">LabeledText</font>
	 * </p>
	 * <p>
	 *     <font face="Courier">self.label.size() &lt;= 15</font>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see spemarti.SpemartiPackage#getLabeledText_Label()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link spemarti.LabeledText#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // LabeledText
