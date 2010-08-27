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
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">List</font> <font face="Times New Roman">estrutura o tipo de informação Lista, reponsável por
 *     agrupar</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">os elementos sequencialmente.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">List</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">ComplexInformationElement</font><font face="Times New Roman">, definindo o conceito de lista como</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">um tipo complexo de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Atributos:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">isLabeled</font></b><font face="Times New Roman">:</font>
 *     <i><font face="Times New Roman">Boolean</font></i><font face="Times New Roman">, define se os elementos da lista
 *     possuirão rótulos adicionais;</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">isOrderer</font></b><font face="Times New Roman">:</font>
 *     <i><font face="Times New Roman">Boolean</font></i><font face="Times New Roman">, define se os elementos da lista serão
 *     ordenados;</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">isEnumerated</font></b><font
 *     face="Times New Roman">:</font> <i><font face="Times New Roman">Boolean</font></i><font face="Times New Roman">, define
 *     se os elementos da lista possuirão numeração identificadora</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">com início em 1;</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">contents:</font></b> <i><font
 *     face="Times New Roman">SimpleInformationElement</font></i><font face="Times New Roman">, conforme a necessidade de
 *     agrupar outros tipos de</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">informação, essa associação permite inserir tipos de informação na lista.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Operações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Times New Roman">orderByAZ(), ordena todos os elementos do conteúdo da lista,
 *     do menor para o maior</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">elemento. Caso sejam do tipo</font> <i><font
 *     face="Times New Roman">Integer</font></i><font face="Times New Roman">, será respeitada a ordem numérica. Caso
 *     sejam</font>
 * </p>
 * <p align="left">
 *     <i><font face="Times New Roman">String</font></i><font face="Times New Roman">, será respeitada a ordem
 *     alfabética.</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Times New Roman">orderByZA(), ordena todos os elementos do conteúdo da lista,
 *     do maior para o menor</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">elemento. Caso sejam do tipo</font> <i><font
 *     face="Times New Roman">Integer</font></i><font face="Times New Roman">, será respeitada a ordem numérica invertida.
 *     Caso</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">sejam</font> <i><font face="Times New Roman">String</font></i><font
 *     face="Times New Roman">, será respeitada a ordem alfabética invertida.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Algumas
 *     informações são organizadas em forma de listas. Num contexto geral,</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">listas são bastante utilizadas, pode-se perceber seu uso em:
 *     aplicações bancárias, onde são</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">utilizadas para expressar itens de forma organizada,
 *     geralmente com base em alguma ordem;</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">e na própria lingua portuguesa, que utiliza listas para
 *     permitir enumerações e itenizações de</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">descrições ou elementos existentes, geralmente destacados
 *     através de rótulos e enumerações.</font></font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman"><font face="Times New Roman">Nesse sentido, a metaclasse</font> <font
 *     face="Courier">List</font> <font face="Times New Roman">é responsável por permitir a criação de conjuntos de tipos
 *     de</font></font>
 * </p>
 * <p>
 *     <font face="Times New Roman"><font face="Times New Roman">informação para uma melhor organização desse tipos, atuando
 *     como um agrupador sequencial.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.List#isIsLabeled <em>Is Labeled</em>}</li>
 *   <li>{@link spemarti.List#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link spemarti.List#isIsEnumerated <em>Is Enumerated</em>}</li>
 *   <li>{@link spemarti.List#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getList()
 * @model
 * @generated
 */
public interface List extends ComplexInformationElement {
	/**
	 * Returns the value of the '<em><b>Is Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Labeled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Labeled</em>' attribute.
	 * @see #setIsLabeled(boolean)
	 * @see spemarti.SpemartiPackage#getList_IsLabeled()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLabeled();

	/**
	 * Sets the value of the '{@link spemarti.List#isIsLabeled <em>Is Labeled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Labeled</em>' attribute.
	 * @see #isIsLabeled()
	 * @generated
	 */
	void setIsLabeled(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see spemarti.SpemartiPackage#getList_IsOrdered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link spemarti.List#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Enumerated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enumerated</em>' attribute.
	 * @see #setIsEnumerated(boolean)
	 * @see spemarti.SpemartiPackage#getList_IsEnumerated()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEnumerated();

	/**
	 * Sets the value of the '{@link spemarti.List#isIsEnumerated <em>Is Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enumerated</em>' attribute.
	 * @see #isIsEnumerated()
	 * @generated
	 */
	void setIsEnumerated(boolean value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link spemarti.SimpleInformationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see spemarti.SpemartiPackage#getList_Contents()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SimpleInformationElement> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void orderByAZ();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void orderByZA();

} // List
