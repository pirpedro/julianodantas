/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Diagram</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Diagram</font> <font face="Times New Roman">estrutura o tipo de informação Diagrama.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">Diagram</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">ComplexInformationElement</font><font face="Times New Roman">, definindo o conceito de diagrama</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">como um tipo complexo de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">image:</font></b> <i><font
 *     face="Times New Roman">Image</font></i><font face="Times New Roman">, esta associação representa a ligação entre um
 *     diagrama e sua imagem.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Artefatos de Software possuem formas
 *     de representação de conteúdo através</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">de diagramas. Estes diagramas servem para representar o conhecimento necessários
 *     através</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">de imagens, muitas vezes exemplificado algo que foi descrito anteriormente. O conceito
 *     de</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">diagrama foi modelado através da metaclasse</font> <font
 *     face="Courier">Diagram</font><font face="Times New Roman">, que define um relacionamento para</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">armazenar a imagem que ele representa.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Diagram#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends ComplexInformationElement {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference list.
	 * @see spemarti.SpemartiPackage#getDiagram_Image()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Image> getImage();

} // Diagram
