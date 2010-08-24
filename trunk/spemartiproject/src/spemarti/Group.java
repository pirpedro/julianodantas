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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Group</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Group</font> <font face="Times New Roman">organiza outros tipos de informação existente, agindo</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">como um agrupador.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">Group</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">List</font><font face="Times New Roman">, definindo o conceito de agrupador como um tipo especial de
 *     lista,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">sendo um tipo complexo de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">childs:</font></b> <i><font
 *     face="Times New Roman">Group</font></i><font face="Times New Roman">, esta associação define a existência de um
 *     conjunto sub agrupadores de</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">um agrupador a ser utilizado. Isto permite a criação de agrupadores em árvore, ou
 *     seja,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">permite a criação de estruturas de informação agrupadas de forma hierárquica. Desta</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">forma, cada agrupador, ou grupo de informações, pode sempre ser aninhado por outro</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">grupo. Esta associação possui uma restrição em relação aos grupos possíveis, não
 *     permitindo</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">que um grupo seja filho dele mesmo. Além disso, este atributo não pode agrupar a</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">mesma informação mais de uma vez.</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">internalContents:</font></b> <font
 *     face="Courier">SimpleInformationElement</font><font face="Times New Roman">, conforme a necessidade de agrupar</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">outros tipos de informação, essa associação permite criar estruturas mais
 *     complexas,</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">agrupando-as.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="CMSY10">•</font> <b><font face="Times New Roman">parent:</font></b> <i><font
 *     face="Times New Roman">Group</font></i><font face="Times New Roman">, assim como foi definida a existência de uma
 *     hierarquia de grupos, ou</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">agrupadores, a partir do atributo</font> <font
 *     face="Courier">childs</font><font face="Times New Roman">, esta associação permite a identificação de um</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">pai para um conjunto de sub agrupadores. Desta forma, os
 *     grupos inseridos no conjunto</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">definido pela associação</font> <font
 *     face="Courier">childs</font> <font face="Times New Roman">conseguem identificar a qual grupo estão
 *     agrupados.</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">Esta associação possui uma restrição em relação a um pai
 *     possíveis, não permitindo que</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">um grupo seja pai dele própaio.</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Algumas
 *     informações relevantes são agrupadas através de agrupadores de informações</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">para que o Artefato de Software esteja melhor organizado.
 *     Essas informações são,</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">em sua maioria, informações relacionadas, que juntas podem
 *     representam alguma outra informação</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">ainda mais importante, de forma</font> <i><font
 *     face="Times New Roman">ad hoc</font></i><font face="Times New Roman">. Além disso, no contexto de organização
 *     da</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">informação, muitas vezes a utilização de agrupamentos
 *     facilita a visualização ou até mesmo</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">o acesso a informação pretendida. O conceito de agrupamento
 *     foi modelado através da metaclasse</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Courier">Group</font><font face="Times New Roman">, que possui relacionamentos
 *     para armazenar informações tanto internamente, em</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">se tratando de composição de informações, quanto
 *     externamente, no tocante a agrupamento de</font></font>
 * </p>
 * <p>
 *     <font face="Times New Roman"><font face="Times New Roman">diferentes informações relacionadas.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Group#getGroup <em>Group</em>}</li>
 *   <li>{@link spemarti.Group#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link spemarti.Group#getChilds <em>Childs</em>}</li>
 *   <li>{@link spemarti.Group#getInternalContents <em>Internal Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends List {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.Group#getGroup2 <em>Group2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see spemarti.SpemartiPackage#getGroup_Group()
	 * @see spemarti.Group#getGroup2
	 * @model opposite="group2" required="true" ordered="false"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link spemarti.Group#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Group2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link spemarti.Group#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group2</em>' reference.
	 * @see #setGroup2(Group)
	 * @see spemarti.SpemartiPackage#getGroup_Group2()
	 * @see spemarti.Group#getGroup
	 * @model opposite="group" required="true" ordered="false"
	 * @generated
	 */
	Group getGroup2();

	/**
	 * Sets the value of the '{@link spemarti.Group#getGroup2 <em>Group2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group2</em>' reference.
	 * @see #getGroup2()
	 * @generated
	 */
	void setGroup2(Group value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' reference list.
	 * The list contents are of type {@link spemarti.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' reference list.
	 * @see spemarti.SpemartiPackage#getGroup_Childs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Group> getChilds();

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
	 * @see spemarti.SpemartiPackage#getGroup_InternalContents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SimpleInformationElement> getInternalContents();

} // Group
