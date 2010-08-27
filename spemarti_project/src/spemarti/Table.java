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
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Table</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Table</font> <font face="Times New Roman">estrutura o tipo de informação Tabela.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">Table</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">Matrix</font><font face="Times New Roman">, definindo o conceito de tabela como um tipo de Matrix,
 *     sendo</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">um tipo complexo no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">matrixes:</font></b> <i><font
 *     face="Times New Roman">Matrix</font></i><font face="Times New Roman">, define o conjunto de matrizes existentes em uma
 *     tabela;</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Assim como existem informações que
 *     são organizadas em matrizes, num contexto</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">mais específico existem também informações organizadas de tal forma, que se parecem</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">com um conjunto de matrizes. Documentos feitos através do</font> <i><font
 *     face="Times New Roman">Microsoft Excel</font></i> <font size="1" face="Times New Roman"><font size="1"
 *     face="Times New Roman">TM</font></font><font face="Times New Roman">, o qual se</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">caracteriza por ter uma planilha que se constitui em um matrizes, desta forma, nota-se que
 *     um</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">conjunto de matrizes pode permitir a formação de uma tabela. Diante da necessidade de
 *     possuir</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">este tipo de informação, em nosso metamodelo, este conceito é definido pela
 *     metaclasse</font>
 * </p>
 * <p>
 *     <font face="Courier">Tabela</font><font face="Times New Roman">.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Table#getMatrixes <em>Matrixes</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Matrix {
	/**
	 * Returns the value of the '<em><b>Matrixes</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Matrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrixes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrixes</em>' reference list.
	 * @see spemarti.SpemartiPackage#getTable_Matrixes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Matrix> getMatrixes();

} // Table
