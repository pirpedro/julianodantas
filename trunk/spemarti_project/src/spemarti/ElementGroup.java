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
 * A representation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Group</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descri��o:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Group</font> <font face="Times New Roman">organiza outros tipos de informa��o existente, agindo</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">como um agrupador.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generaliza��o:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <font face="Courier">Group</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">List</font><font face="Times New Roman">, definindo o conceito de agrupador como um tipo especial de
 *     lista,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">sendo um tipo complexo de informa��o no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associa��es:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <b><font face="Times New Roman">childs:</font></b> <i><font
 *     face="Times New Roman">Group</font></i><font face="Times New Roman">, esta associa��o define a exist�ncia de um
 *     conjunto sub agrupadores de</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">um agrupador a ser utilizado. Isto permite a cria��o de agrupadores em �rvore, ou
 *     seja,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">permite a cria��o de estruturas de informa��o agrupadas de forma hier�rquica. Desta</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">forma, cada agrupador, ou grupo de informa��es, pode sempre ser aninhado por outro</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">grupo. Esta associa��o possui uma restri��o em rela��o aos grupos poss�veis, n�o
 *     permitindo</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">que um grupo seja filho dele mesmo. Al�m disso, este atributo n�o pode agrupar a</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">mesma informa��o mais de uma vez.</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">�</font> <b><font face="Times New Roman">internalContents:</font></b> <font
 *     face="Courier">SimpleInformationElement</font><font face="Times New Roman">, conforme a necessidade de agrupar</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">outros tipos de informa��o, essa associa��o permite criar estruturas mais
 *     complexas,</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">agrupando-as.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="CMSY10">�</font> <b><font face="Times New Roman">parent:</font></b> <i><font
 *     face="Times New Roman">Group</font></i><font face="Times New Roman">, assim como foi definida a exist�ncia de uma
 *     hierarquia de grupos, ou</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">agrupadores, a partir do atributo</font> <font
 *     face="Courier">childs</font><font face="Times New Roman">, esta associa��o permite a identifica��o de um</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">pai para um conjunto de sub agrupadores. Desta forma, os
 *     grupos inseridos no conjunto</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">definido pela associa��o</font> <font
 *     face="Courier">childs</font> <font face="Times New Roman">conseguem identificar a qual grupo est�o
 *     agrupados.</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">Esta associa��o possui uma restri��o em rela��o a um pai
 *     poss�veis, n�o permitindo que</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">um grupo seja pai dele pr�paio.</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><b><font face="Times New Roman">Sem�ntica:</font></b> <font face="Times New Roman">Algumas
 *     informa��es relevantes s�o agrupadas atrav�s de agrupadores de informa��es</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">para que o Artefato de Software esteja melhor organizado.
 *     Essas informa��es s�o,</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">em sua maioria, informa��es relacionadas, que juntas podem
 *     representam alguma outra informa��o</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">ainda mais importante, de forma</font> <i><font
 *     face="Times New Roman">ad hoc</font></i><font face="Times New Roman">. Al�m disso, no contexto de organiza��o
 *     da</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">informa��o, muitas vezes a utiliza��o de agrupamentos
 *     facilita a visualiza��o ou at� mesmo</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">o acesso a informa��o pretendida. O conceito de agrupamento
 *     foi modelado atrav�s da metaclasse</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Courier">Group</font><font face="Times New Roman">, que possui relacionamentos
 *     para armazenar informa��es tanto internamente, em</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">se tratando de composi��o de informa��es, quanto
 *     externamente, no tocante a agrupamento de</font></font>
 * </p>
 * <p>
 *     <font face="Times New Roman"><font face="Times New Roman">diferentes informa��es relacionadas.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.ElementGroup#getChilds <em>Childs</em>}</li>
 *   <li>{@link spemarti.ElementGroup#getInternalContents <em>Internal Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getElementGroup()
 * @model
 * @generated
 */
public interface ElementGroup extends List {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' reference list.
	 * The list contents are of type {@link spemarti.ElementGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' reference list.
	 * @see spemarti.SpemartiPackage#getElementGroup_Childs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ElementGroup> getChilds();

	/**
	 * Returns the value of the '<em><b>Internal Contents</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.SimpleInformationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Contents</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getElementGroup_InternalContents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SimpleInformationElement> getInternalContents();

} // ElementGroup
