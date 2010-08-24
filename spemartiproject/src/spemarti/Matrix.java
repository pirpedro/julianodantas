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
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Matrix</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descri��o:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Matrix</font> <font face="Times New Roman">estrutura o tipo de informa��o com base em matrizes e</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">tabula��o.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generaliza��o:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <font face="Courier">Matrix</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">ComplexInformationElement</font><font face="Times New Roman">, definindo o conceito de matrizes</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">como um tipo complexo de informa��o no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associa��es:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <b><font face="Times New Roman">header:</font></b> <i><font
 *     face="Times New Roman">List</font></i><font face="Times New Roman">, utilizado para criar o cabe�alho da matriz caso
 *     necess�rio;</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <b><font face="Times New Roman">lines:</font></b> <i><font
 *     face="Times New Roman">List</font></i><font face="Times New Roman">, utilizado para incluir as linhas da matriz ou
 *     tabula��o.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Sem�ntica:</font></b> <font face="Times New Roman">Algumas informa��es s�o organizadas
 *     em forma de matrizes, conforme necessidade</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">de organiz�-las em formatos tabulares. Num contexto mais espec�fico podemos citar</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">seu uso em situa��es como por exemplo do RUP, que define algumas das suas
 *     informa��es</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">em forma de tabela, tais como: perfil do</font> <i><font
 *     face="Times New Roman">stakeholder</font></i><font face="Times New Roman">, levantamento de riscos e problemas a</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">serem enfrentados. De um modo geral, podemos tamb�m inserir neste mesmo contexto,
 *     documentos</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">feitos atrav�s do</font> <i><font face="Times New Roman">Microsoft Excel</font></i> <font
 *     size="1" face="Times New Roman"><font size="1" face="Times New Roman">TM</font></font><font face="Times New Roman">, o
 *     qual se caracteriza por ter uma planilha que se</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">constitui em um matrizes. Diante da necessidade de possuir este tipo de informa��o, em
 *     nosso</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">metamodelo, este conceito � definido pela metaclasse</font> <font
 *     face="Courier">Matrix</font><font face="Times New Roman">.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Matrix#getHeader <em>Header</em>}</li>
 *   <li>{@link spemarti.Matrix#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends ComplexInformationElement {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' reference.
	 * @see #setHeader(List)
	 * @see spemarti.SpemartiPackage#getMatrix_Header()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List getHeader();

	/**
	 * Sets the value of the '{@link spemarti.Matrix#getHeader <em>Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(List value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' reference list.
	 * The list contents are of type {@link spemarti.List}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' reference list.
	 * @see spemarti.SpemartiPackage#getMatrix_Lines()
	 * @model ordered="false"
	 * @generated
	 */
	EList<List> getLines();

} // Matrix
