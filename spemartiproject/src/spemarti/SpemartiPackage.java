/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see spemarti.SpemartiFactory
 * @model kind="package"
 * @generated
 */
public interface SpemartiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spemarti";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///spemarti.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spemarti";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpemartiPackage eINSTANCE = spemarti.impl.SpemartiPackageImpl.init();

	/**
	 * The meta object id for the '{@link spemarti.impl.VersionedExtentImpl <em>Versioned Extent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.VersionedExtentImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getVersionedExtent()
	 * @generated
	 */
	int VERSIONED_EXTENT = 2;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__IS_CHECKED_OUT = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__VERSIONHISTORY = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__CONFLICT = 4;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__PREVIOUS_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__BASE_VERSION = 6;

	/**
	 * The number of structural features of the '<em>Versioned Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link spemarti.impl.SimpleInformationElementImpl <em>Simple Information Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.SimpleInformationElementImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getSimpleInformationElement()
	 * @generated
	 */
	int SIMPLE_INFORMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__IS_CHECKED_OUT = VERSIONED_EXTENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__ANNOTATION = VERSIONED_EXTENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__VERSIONHISTORY = VERSIONED_EXTENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__CONFIGURATION = VERSIONED_EXTENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__CONFLICT = VERSIONED_EXTENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__PREVIOUS_VERSION = VERSIONED_EXTENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__BASE_VERSION = VERSIONED_EXTENT__BASE_VERSION;

	/**
	 * The number of structural features of the '<em>Simple Information Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT = VERSIONED_EXTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ImageImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IS_CHECKED_OUT = SIMPLE_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__ANNOTATION = SIMPLE_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__VERSIONHISTORY = SIMPLE_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONFIGURATION = SIMPLE_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONFLICT = SIMPLE_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PREVIOUS_VERSION = SIMPLE_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BASE_VERSION = SIMPLE_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.VersionHistoryImpl <em>Version History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.VersionHistoryImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getVersionHistory()
	 * @generated
	 */
	int VERSION_HISTORY = 3;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY__VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Root Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY__ROOT_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Version History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_HISTORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.VersionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ID = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__PREVIOUS_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Next Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NEXT_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__BASELINE = 6;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link spemarti.impl.BaselineImpl <em>Baseline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.BaselineImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getBaseline()
	 * @generated
	 */
	int BASELINE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__LABEL = VERSION__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__ID = VERSION__ID;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__CREATION_DATE = VERSION__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__ANNOTATION = VERSION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__PREVIOUS_VERSION = VERSION__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Next Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__NEXT_VERSION = VERSION__NEXT_VERSION;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__BASELINE = VERSION__BASELINE;

	/**
	 * The feature id for the '<em><b>Memberof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__MEMBEROF = VERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__MEMBER = VERSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__CONFIGURATION = VERSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE__VERSION = VERSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Baseline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_FEATURE_COUNT = VERSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link spemarti.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ConfigurationImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Memberof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MEMBEROF = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Versioned Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VERSIONED_EXTENT = 3;

	/**
	 * The feature id for the '<em><b>Previous Baseline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PREVIOUS_BASELINE = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BASELINE = 6;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link spemarti.impl.BaselineHistoryImpl <em>Baseline History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.BaselineHistoryImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getBaselineHistory()
	 * @generated
	 */
	int BASELINE_HISTORY = 7;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_HISTORY__VERSIONS = VERSION_HISTORY__VERSIONS;

	/**
	 * The feature id for the '<em><b>Root Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_HISTORY__ROOT_VERSION = VERSION_HISTORY__ROOT_VERSION;

	/**
	 * The number of structural features of the '<em>Baseline History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_HISTORY_FEATURE_COUNT = VERSION_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.LabelImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.WorkProductDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getWorkProductDefinition()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION = 10;

	/**
	 * The number of structural features of the '<em>Work Product Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.FragmentDefinitionImpl <em>Fragment Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.FragmentDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getFragmentDefinition()
	 * @generated
	 */
	int FRAGMENT_DEFINITION = 9;

	/**
	 * The number of structural features of the '<em>Fragment Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.ComplexInformationElementImpl <em>Complex Information Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ComplexInformationElementImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getComplexInformationElement()
	 * @generated
	 */
	int COMPLEX_INFORMATION_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__IS_CHECKED_OUT = SIMPLE_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__ANNOTATION = SIMPLE_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__VERSIONHISTORY = SIMPLE_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__CONFIGURATION = SIMPLE_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__CONFLICT = SIMPLE_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__PREVIOUS_VERSION = SIMPLE_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__BASE_VERSION = SIMPLE_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The number of structural features of the '<em>Complex Information Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT = SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.DiagramImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 11;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__IS_CHECKED_OUT = COMPLEX_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__ANNOTATION = COMPLEX_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__VERSIONHISTORY = COMPLEX_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONFIGURATION = COMPLEX_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__CONFLICT = COMPLEX_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PREVIOUS_VERSION = COMPLEX_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__BASE_VERSION = COMPLEX_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__IMAGE = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.QuestionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 13;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_CHECKED_OUT = COMPLEX_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANNOTATION = COMPLEX_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VERSIONHISTORY = COMPLEX_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CONFIGURATION = COMPLEX_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CONFLICT = COMPLEX_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__PREVIOUS_VERSION = COMPLEX_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__BASE_VERSION = COMPLEX_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Asks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ASKS = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.TextImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 14;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IS_CHECKED_OUT = SIMPLE_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ANNOTATION = SIMPLE_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VERSIONHISTORY = SIMPLE_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONFIGURATION = SIMPLE_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONFLICT = SIMPLE_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PREVIOUS_VERSION = SIMPLE_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BASE_VERSION = SIMPLE_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ListImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_CHECKED_OUT = COMPLEX_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATION = COMPLEX_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VERSIONHISTORY = COMPLEX_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONFIGURATION = COMPLEX_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONFLICT = COMPLEX_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PREVIOUS_VERSION = COMPLEX_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BASE_VERSION = COMPLEX_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Is Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_LABELED = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_ORDERED = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IS_ENUMERATED = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONTENTS = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link spemarti.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.MatrixImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 16;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IS_CHECKED_OUT = COMPLEX_INFORMATION_ELEMENT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ANNOTATION = COMPLEX_INFORMATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__VERSIONHISTORY = COMPLEX_INFORMATION_ELEMENT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CONFIGURATION = COMPLEX_INFORMATION_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CONFLICT = COMPLEX_INFORMATION_ELEMENT__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__PREVIOUS_VERSION = COMPLEX_INFORMATION_ELEMENT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__BASE_VERSION = COMPLEX_INFORMATION_ELEMENT__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__HEADER = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__LINES = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = COMPLEX_INFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.TableImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 17;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__IS_CHECKED_OUT = MATRIX__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ANNOTATION = MATRIX__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__VERSIONHISTORY = MATRIX__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONFIGURATION = MATRIX__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONFLICT = MATRIX__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PREVIOUS_VERSION = MATRIX__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BASE_VERSION = MATRIX__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = MATRIX__HEADER;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LINES = MATRIX__LINES;

	/**
	 * The feature id for the '<em><b>Matrixes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__MATRIXES = MATRIX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = MATRIX_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.GroupImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 18;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_CHECKED_OUT = LIST__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATION = LIST__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VERSIONHISTORY = LIST__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIGURATION = LIST__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFLICT = LIST__CONFLICT;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PREVIOUS_VERSION = LIST__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BASE_VERSION = LIST__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Is Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_LABELED = LIST__IS_LABELED;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_ORDERED = LIST__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__IS_ENUMERATED = LIST__IS_ENUMERATED;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONTENTS = LIST__CONTENTS;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP = LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP2 = LIST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDS = LIST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INTERNAL_CONTENTS = LIST_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = LIST_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link spemarti.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.WorkspaceImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Versioned Extent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__VERSIONED_EXTENT = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link spemarti.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.SessionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 20;

	/**
	 * The feature id for the '<em><b>Workspace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__WORKSPACE = 0;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.ContainerDefinitionImpl <em>Container Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ContainerDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getContainerDefinition()
	 * @generated
	 */
	int CONTAINER_DEFINITION = 21;

	/**
	 * The number of structural features of the '<em>Container Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ArtifactDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getArtifactDefinition()
	 * @generated
	 */
	int ARTIFACT_DEFINITION = 22;

	/**
	 * The number of structural features of the '<em>Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link spemarti.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see spemarti.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link spemarti.SimpleInformationElement <em>Simple Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Information Element</em>'.
	 * @see spemarti.SimpleInformationElement
	 * @generated
	 */
	EClass getSimpleInformationElement();

	/**
	 * Returns the meta object for class '{@link spemarti.VersionedExtent <em>Versioned Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Extent</em>'.
	 * @see spemarti.VersionedExtent
	 * @generated
	 */
	EClass getVersionedExtent();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.VersionedExtent#isIsCheckedOut <em>Is Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked Out</em>'.
	 * @see spemarti.VersionedExtent#isIsCheckedOut()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EAttribute getVersionedExtent_IsCheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.VersionedExtent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see spemarti.VersionedExtent#getAnnotation()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EAttribute getVersionedExtent_Annotation();

	/**
	 * Returns the meta object for the reference '{@link spemarti.VersionedExtent#getVersionhistory <em>Versionhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Versionhistory</em>'.
	 * @see spemarti.VersionedExtent#getVersionhistory()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EReference getVersionedExtent_Versionhistory();

	/**
	 * Returns the meta object for the reference '{@link spemarti.VersionedExtent#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see spemarti.VersionedExtent#getConfiguration()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EReference getVersionedExtent_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.VersionedExtent#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflict</em>'.
	 * @see spemarti.VersionedExtent#getConflict()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EReference getVersionedExtent_Conflict();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.VersionedExtent#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Version</em>'.
	 * @see spemarti.VersionedExtent#getPreviousVersion()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EReference getVersionedExtent_PreviousVersion();

	/**
	 * Returns the meta object for the reference '{@link spemarti.VersionedExtent#getBaseVersion <em>Base Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Version</em>'.
	 * @see spemarti.VersionedExtent#getBaseVersion()
	 * @see #getVersionedExtent()
	 * @generated
	 */
	EReference getVersionedExtent_BaseVersion();

	/**
	 * Returns the meta object for class '{@link spemarti.VersionHistory <em>Version History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version History</em>'.
	 * @see spemarti.VersionHistory
	 * @generated
	 */
	EClass getVersionHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.VersionHistory#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see spemarti.VersionHistory#getVersions()
	 * @see #getVersionHistory()
	 * @generated
	 */
	EReference getVersionHistory_Versions();

	/**
	 * Returns the meta object for the reference '{@link spemarti.VersionHistory#getRootVersion <em>Root Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Version</em>'.
	 * @see spemarti.VersionHistory#getRootVersion()
	 * @see #getVersionHistory()
	 * @generated
	 */
	EReference getVersionHistory_RootVersion();

	/**
	 * Returns the meta object for class '{@link spemarti.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see spemarti.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute list '{@link spemarti.Version#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label</em>'.
	 * @see spemarti.Version#getLabel()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Label();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Version#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spemarti.Version#getId()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Version#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see spemarti.Version#getCreationDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Version#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see spemarti.Version#getAnnotation()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Annotation();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Version#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Version</em>'.
	 * @see spemarti.Version#getPreviousVersion()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_PreviousVersion();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Version#getNextVersion <em>Next Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Version</em>'.
	 * @see spemarti.Version#getNextVersion()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_NextVersion();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Version#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Baseline</em>'.
	 * @see spemarti.Version#getBaseline()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Baseline();

	/**
	 * Returns the meta object for class '{@link spemarti.Baseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline</em>'.
	 * @see spemarti.Baseline
	 * @generated
	 */
	EClass getBaseline();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Baseline#getMemberof <em>Memberof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memberof</em>'.
	 * @see spemarti.Baseline#getMemberof()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_Memberof();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Baseline#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see spemarti.Baseline#getMember()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_Member();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Baseline#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configuration</em>'.
	 * @see spemarti.Baseline#getConfiguration()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Baseline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Version</em>'.
	 * @see spemarti.Baseline#getVersion()
	 * @see #getBaseline()
	 * @generated
	 */
	EReference getBaseline_Version();

	/**
	 * Returns the meta object for class '{@link spemarti.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see spemarti.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Configuration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spemarti.Configuration#getId()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Id();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Configuration#getMemberof <em>Memberof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memberof</em>'.
	 * @see spemarti.Configuration#getMemberof()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Memberof();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Configuration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see spemarti.Configuration#getMember()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Member();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Configuration#getVersionedExtent <em>Versioned Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versioned Extent</em>'.
	 * @see spemarti.Configuration#getVersionedExtent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_VersionedExtent();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Configuration#getPreviousBaseline <em>Previous Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Baseline</em>'.
	 * @see spemarti.Configuration#getPreviousBaseline()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_PreviousBaseline();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Configuration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see spemarti.Configuration#getAnnotation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Annotation();

	/**
	 * Returns the meta object for the reference '{@link spemarti.Configuration#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseline</em>'.
	 * @see spemarti.Configuration#getBaseline()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Baseline();

	/**
	 * Returns the meta object for class '{@link spemarti.BaselineHistory <em>Baseline History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline History</em>'.
	 * @see spemarti.BaselineHistory
	 * @generated
	 */
	EClass getBaselineHistory();

	/**
	 * Returns the meta object for class '{@link spemarti.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see spemarti.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link spemarti.FragmentDefinition <em>Fragment Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Definition</em>'.
	 * @see spemarti.FragmentDefinition
	 * @generated
	 */
	EClass getFragmentDefinition();

	/**
	 * Returns the meta object for class '{@link spemarti.WorkProductDefinition <em>Work Product Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Definition</em>'.
	 * @see spemarti.WorkProductDefinition
	 * @generated
	 */
	EClass getWorkProductDefinition();

	/**
	 * Returns the meta object for class '{@link spemarti.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see spemarti.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Diagram#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image</em>'.
	 * @see spemarti.Diagram#getImage()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Image();

	/**
	 * Returns the meta object for class '{@link spemarti.ComplexInformationElement <em>Complex Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Information Element</em>'.
	 * @see spemarti.ComplexInformationElement
	 * @generated
	 */
	EClass getComplexInformationElement();

	/**
	 * Returns the meta object for class '{@link spemarti.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see spemarti.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.Question#getAsks <em>Asks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asks</em>'.
	 * @see spemarti.Question#getAsks()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Asks();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see spemarti.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for class '{@link spemarti.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see spemarti.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link spemarti.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see spemarti.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.List#isIsLabeled <em>Is Labeled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Labeled</em>'.
	 * @see spemarti.List#isIsLabeled()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_IsLabeled();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.List#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see spemarti.List#isIsOrdered()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.List#isIsEnumerated <em>Is Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enumerated</em>'.
	 * @see spemarti.List#isIsEnumerated()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_IsEnumerated();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.List#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see spemarti.List#getContents()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Contents();

	/**
	 * Returns the meta object for class '{@link spemarti.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see spemarti.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the reference '{@link spemarti.Matrix#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header</em>'.
	 * @see spemarti.Matrix#getHeader()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Header();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Matrix#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines</em>'.
	 * @see spemarti.Matrix#getLines()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Lines();

	/**
	 * Returns the meta object for class '{@link spemarti.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see spemarti.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Table#getMatrixes <em>Matrixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matrixes</em>'.
	 * @see spemarti.Table#getMatrixes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Matrixes();

	/**
	 * Returns the meta object for class '{@link spemarti.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see spemarti.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference '{@link spemarti.Group#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see spemarti.Group#getGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Group();

	/**
	 * Returns the meta object for the reference '{@link spemarti.Group#getGroup2 <em>Group2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group2</em>'.
	 * @see spemarti.Group#getGroup2()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Group2();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Group#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childs</em>'.
	 * @see spemarti.Group#getChilds()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Childs();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.Group#getInternalContents <em>Internal Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Contents</em>'.
	 * @see spemarti.Group#getInternalContents()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_InternalContents();

	/**
	 * Returns the meta object for class '{@link spemarti.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see spemarti.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Workspace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see spemarti.Workspace#getId()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Id();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.Workspace#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see spemarti.Workspace#getAnnotation()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.Workspace#getVersionedExtent <em>Versioned Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versioned Extent</em>'.
	 * @see spemarti.Workspace#getVersionedExtent()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_VersionedExtent();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.Workspace#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see spemarti.Workspace#getConfiguration()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Configuration();

	/**
	 * Returns the meta object for class '{@link spemarti.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see spemarti.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the reference '{@link spemarti.Session#getWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workspace</em>'.
	 * @see spemarti.Session#getWorkspace()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_Workspace();

	/**
	 * Returns the meta object for class '{@link spemarti.ContainerDefinition <em>Container Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Definition</em>'.
	 * @see spemarti.ContainerDefinition
	 * @generated
	 */
	EClass getContainerDefinition();

	/**
	 * Returns the meta object for class '{@link spemarti.ArtifactDefinition <em>Artifact Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Definition</em>'.
	 * @see spemarti.ArtifactDefinition
	 * @generated
	 */
	EClass getArtifactDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpemartiFactory getSpemartiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link spemarti.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ImageImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link spemarti.impl.SimpleInformationElementImpl <em>Simple Information Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.SimpleInformationElementImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getSimpleInformationElement()
		 * @generated
		 */
		EClass SIMPLE_INFORMATION_ELEMENT = eINSTANCE.getSimpleInformationElement();

		/**
		 * The meta object literal for the '{@link spemarti.impl.VersionedExtentImpl <em>Versioned Extent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.VersionedExtentImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getVersionedExtent()
		 * @generated
		 */
		EClass VERSIONED_EXTENT = eINSTANCE.getVersionedExtent();

		/**
		 * The meta object literal for the '<em><b>Is Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_EXTENT__IS_CHECKED_OUT = eINSTANCE.getVersionedExtent_IsCheckedOut();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_EXTENT__ANNOTATION = eINSTANCE.getVersionedExtent_Annotation();

		/**
		 * The meta object literal for the '<em><b>Versionhistory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_EXTENT__VERSIONHISTORY = eINSTANCE.getVersionedExtent_Versionhistory();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_EXTENT__CONFIGURATION = eINSTANCE.getVersionedExtent_Configuration();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_EXTENT__CONFLICT = eINSTANCE.getVersionedExtent_Conflict();

		/**
		 * The meta object literal for the '<em><b>Previous Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_EXTENT__PREVIOUS_VERSION = eINSTANCE.getVersionedExtent_PreviousVersion();

		/**
		 * The meta object literal for the '<em><b>Base Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSIONED_EXTENT__BASE_VERSION = eINSTANCE.getVersionedExtent_BaseVersion();

		/**
		 * The meta object literal for the '{@link spemarti.impl.VersionHistoryImpl <em>Version History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.VersionHistoryImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getVersionHistory()
		 * @generated
		 */
		EClass VERSION_HISTORY = eINSTANCE.getVersionHistory();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_HISTORY__VERSIONS = eINSTANCE.getVersionHistory_Versions();

		/**
		 * The meta object literal for the '<em><b>Root Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_HISTORY__ROOT_VERSION = eINSTANCE.getVersionHistory_RootVersion();

		/**
		 * The meta object literal for the '{@link spemarti.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.VersionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__LABEL = eINSTANCE.getVersion_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__ID = eINSTANCE.getVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CREATION_DATE = eINSTANCE.getVersion_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__ANNOTATION = eINSTANCE.getVersion_Annotation();

		/**
		 * The meta object literal for the '<em><b>Previous Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__PREVIOUS_VERSION = eINSTANCE.getVersion_PreviousVersion();

		/**
		 * The meta object literal for the '<em><b>Next Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__NEXT_VERSION = eINSTANCE.getVersion_NextVersion();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__BASELINE = eINSTANCE.getVersion_Baseline();

		/**
		 * The meta object literal for the '{@link spemarti.impl.BaselineImpl <em>Baseline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.BaselineImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getBaseline()
		 * @generated
		 */
		EClass BASELINE = eINSTANCE.getBaseline();

		/**
		 * The meta object literal for the '<em><b>Memberof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__MEMBEROF = eINSTANCE.getBaseline_Memberof();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__MEMBER = eINSTANCE.getBaseline_Member();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__CONFIGURATION = eINSTANCE.getBaseline_Configuration();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINE__VERSION = eINSTANCE.getBaseline_Version();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ConfigurationImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ID = eINSTANCE.getConfiguration_Id();

		/**
		 * The meta object literal for the '<em><b>Memberof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MEMBEROF = eINSTANCE.getConfiguration_Memberof();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MEMBER = eINSTANCE.getConfiguration_Member();

		/**
		 * The meta object literal for the '<em><b>Versioned Extent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__VERSIONED_EXTENT = eINSTANCE.getConfiguration_VersionedExtent();

		/**
		 * The meta object literal for the '<em><b>Previous Baseline</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PREVIOUS_BASELINE = eINSTANCE.getConfiguration_PreviousBaseline();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__ANNOTATION = eINSTANCE.getConfiguration_Annotation();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BASELINE = eINSTANCE.getConfiguration_Baseline();

		/**
		 * The meta object literal for the '{@link spemarti.impl.BaselineHistoryImpl <em>Baseline History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.BaselineHistoryImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getBaselineHistory()
		 * @generated
		 */
		EClass BASELINE_HISTORY = eINSTANCE.getBaselineHistory();

		/**
		 * The meta object literal for the '{@link spemarti.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.LabelImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link spemarti.impl.FragmentDefinitionImpl <em>Fragment Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.FragmentDefinitionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getFragmentDefinition()
		 * @generated
		 */
		EClass FRAGMENT_DEFINITION = eINSTANCE.getFragmentDefinition();

		/**
		 * The meta object literal for the '{@link spemarti.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.WorkProductDefinitionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getWorkProductDefinition()
		 * @generated
		 */
		EClass WORK_PRODUCT_DEFINITION = eINSTANCE.getWorkProductDefinition();

		/**
		 * The meta object literal for the '{@link spemarti.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.DiagramImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__IMAGE = eINSTANCE.getDiagram_Image();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ComplexInformationElementImpl <em>Complex Information Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ComplexInformationElementImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getComplexInformationElement()
		 * @generated
		 */
		EClass COMPLEX_INFORMATION_ELEMENT = eINSTANCE.getComplexInformationElement();

		/**
		 * The meta object literal for the '{@link spemarti.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.QuestionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Asks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ASKS = eINSTANCE.getQuestion_Asks();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '{@link spemarti.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.TextImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ListImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Is Labeled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__IS_LABELED = eINSTANCE.getList_IsLabeled();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__IS_ORDERED = eINSTANCE.getList_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Enumerated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__IS_ENUMERATED = eINSTANCE.getList_IsEnumerated();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__CONTENTS = eINSTANCE.getList_Contents();

		/**
		 * The meta object literal for the '{@link spemarti.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.MatrixImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__HEADER = eINSTANCE.getMatrix_Header();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__LINES = eINSTANCE.getMatrix_Lines();

		/**
		 * The meta object literal for the '{@link spemarti.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.TableImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Matrixes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__MATRIXES = eINSTANCE.getTable_Matrixes();

		/**
		 * The meta object literal for the '{@link spemarti.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.GroupImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP = eINSTANCE.getGroup_Group();

		/**
		 * The meta object literal for the '<em><b>Group2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUP2 = eINSTANCE.getGroup_Group2();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CHILDS = eINSTANCE.getGroup_Childs();

		/**
		 * The meta object literal for the '<em><b>Internal Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__INTERNAL_CONTENTS = eINSTANCE.getGroup_InternalContents();

		/**
		 * The meta object literal for the '{@link spemarti.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.WorkspaceImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__ID = eINSTANCE.getWorkspace_Id();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__ANNOTATION = eINSTANCE.getWorkspace_Annotation();

		/**
		 * The meta object literal for the '<em><b>Versioned Extent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__VERSIONED_EXTENT = eINSTANCE.getWorkspace_VersionedExtent();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__CONFIGURATION = eINSTANCE.getWorkspace_Configuration();

		/**
		 * The meta object literal for the '{@link spemarti.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.SessionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Workspace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__WORKSPACE = eINSTANCE.getSession_Workspace();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ContainerDefinitionImpl <em>Container Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ContainerDefinitionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getContainerDefinition()
		 * @generated
		 */
		EClass CONTAINER_DEFINITION = eINSTANCE.getContainerDefinition();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ArtifactDefinitionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getArtifactDefinition()
		 * @generated
		 */
		EClass ARTIFACT_DEFINITION = eINSTANCE.getArtifactDefinition();

	}

} //SpemartiPackage
