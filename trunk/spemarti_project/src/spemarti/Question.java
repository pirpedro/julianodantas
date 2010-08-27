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
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <b><font face="Times New Roman">Question</font></b>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Descrição:</font></b> <font face="Times New Roman">A metaclasse</font> <font
 *     face="Courier">Question</font> <font face="Times New Roman">estrutura o tipo de informação “pergunta x
 *     respostas”,</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">ou seja, define questões.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Generalização:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <font face="Courier">Question</font> <font face="Times New Roman">estende</font> <font
 *     face="Courier">ComplexInformationElement</font><font face="Times New Roman">, definindo o conceito questão</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">como um tipo complexo de informação no metamodelo.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Associações:</font></b>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">asks:</font></b> <i><font
 *     face="Times New Roman">Text</font></i><font face="Times New Roman">, utilizado para criar as perguntas a serem
 *     feitas;</font>
 * </p>
 * <p align="left">
 *     <font face="CMSY10">•</font> <b><font face="Times New Roman">answers:</font></b> <i><font
 *     face="Times New Roman">Text</font></i><font face="Times New Roman">, utilizado para incluir as respostas
 *     recebidas.</font>
 * </p>
 * <p align="left">
 *     <b><font face="Times New Roman">Semântica:</font></b> <font face="Times New Roman">Informações primodiais para a
 *     construção de aplicações são geralmente adquiridas</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">no momento em que se entrevista um</font> <i><font
 *     face="Times New Roman">stakeholder</font></i> <font face="Times New Roman">ou se questiona um cliente
 *     específico.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">Tais informações são encontradas a medida que se obtem as respostas a alguma pergunta
 *     feita.</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">De um modo geral, é possível observar que um fato bastante comum é documentar
 *     perguntas</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">importantes, assim como dúvidas existentes durante o desenvolvimento, assim como as
 *     respostas</font>
 * </p>
 * <p align="left">
 *     <font face="Times New Roman">obtidas. Diante da necessidade de possuir este tipo de informação, em nosso
 *     metamodelo,</font>
 * </p>
 * <p>
 *     <font face="Times New Roman">este conceito é definido pela metaclasse</font> <font face="Courier">Question</font><font
 *     face="Times New Roman">.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link spemarti.Question#getAsks <em>Asks</em>}</li>
 *   <li>{@link spemarti.Question#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see spemarti.SpemartiPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends ComplexInformationElement {
	/**
	 * Returns the value of the '<em><b>Asks</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asks</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getQuestion_Asks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Text> getAsks();

	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link spemarti.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see spemarti.SpemartiPackage#getQuestion_Answers()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Text> getAnswers();

} // Question
