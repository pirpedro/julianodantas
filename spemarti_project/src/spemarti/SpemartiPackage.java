/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package spemarti;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__PREVIOUS_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT__BASE_VERSION = 5;

	/**
	 * The number of structural features of the '<em>Versioned Extent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_EXTENT_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME = VERSIONED_EXTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT__DESCRIPTION = VERSIONED_EXTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Information Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT = VERSIONED_EXTENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PRESENTATION_NAME = SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = SIMPLE_INFORMATION_ELEMENT__DESCRIPTION;

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
	 * The meta object id for the '{@link spemarti.impl.WorkProductDefinitionImpl <em>Work Product Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.WorkProductDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getWorkProductDefinition()
	 * @generated
	 */
	int WORK_PRODUCT_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__PRESENTATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Work Product Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.FragmentDefinitionImpl <em>Fragment Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.FragmentDefinitionImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getFragmentDefinition()
	 * @generated
	 */
	int FRAGMENT_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEFINITION__PRESENTATION_NAME = WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEFINITION__DESCRIPTION = WORK_PRODUCT_DEFINITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Fragment Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link spemarti.impl.Fragment_RelationshipImpl <em>Fragment Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.Fragment_RelationshipImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getFragment_Relationship()
	 * @generated
	 */
	int FRAGMENT_RELATIONSHIP = 24;

	/**
	 * The meta object id for the '{@link spemarti.impl.ComplexInformationElementImpl <em>Complex Information Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ComplexInformationElementImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getComplexInformationElement()
	 * @generated
	 */
	int COMPLEX_INFORMATION_ELEMENT = 11;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__PRESENTATION_NAME = SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_INFORMATION_ELEMENT__DESCRIPTION = SIMPLE_INFORMATION_ELEMENT__DESCRIPTION;

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
	int DIAGRAM = 10;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__PRESENTATION_NAME = COMPLEX_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__DESCRIPTION = COMPLEX_INFORMATION_ELEMENT__DESCRIPTION;

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
	int QUESTION = 12;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__PRESENTATION_NAME = COMPLEX_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = COMPLEX_INFORMATION_ELEMENT__DESCRIPTION;

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
	int TEXT = 13;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PRESENTATION_NAME = SIMPLE_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTION = SIMPLE_INFORMATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = SIMPLE_INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ListImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getList()
	 * @generated
	 */
	int LIST = 14;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PRESENTATION_NAME = COMPLEX_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__DESCRIPTION = COMPLEX_INFORMATION_ELEMENT__DESCRIPTION;

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
	int MATRIX = 15;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__PRESENTATION_NAME = COMPLEX_INFORMATION_ELEMENT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__DESCRIPTION = COMPLEX_INFORMATION_ELEMENT__DESCRIPTION;

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
	int TABLE = 16;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRESENTATION_NAME = MATRIX__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = MATRIX__DESCRIPTION;

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
	 * The meta object id for the '{@link spemarti.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ElementGroupImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IS_CHECKED_OUT = LIST__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__ANNOTATION = LIST__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__VERSIONHISTORY = LIST__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__CONFIGURATION = LIST__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__PREVIOUS_VERSION = LIST__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__BASE_VERSION = LIST__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__PRESENTATION_NAME = LIST__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__DESCRIPTION = LIST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Labeled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IS_LABELED = LIST__IS_LABELED;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IS_ORDERED = LIST__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__IS_ENUMERATED = LIST__IS_ENUMERATED;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__CONTENTS = LIST__CONTENTS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__CHILDS = LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__INTERNAL_CONTENTS = LIST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = LIST_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.WorkspaceImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 18;

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
	int SESSION = 19;

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
	int CONTAINER_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__PRESENTATION_NAME = WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__DESCRIPTION = WORK_PRODUCT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Artifact Container Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Definition Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Definition Relationship2</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2 = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container Fragment Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link spemarti.impl.ArtifactContainer_RelationshipImpl <em>Artifact Container Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ArtifactContainer_RelationshipImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getArtifactContainer_Relationship()
	 * @generated
	 */
	int ARTIFACT_CONTAINER_RELATIONSHIP = 21;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS = 1;

	/**
	 * The number of structural features of the '<em>Artifact Container Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_CONTAINER_RELATIONSHIP_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__PRESENTATION_NAME = WORK_PRODUCT_DEFINITION__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__DESCRIPTION = WORK_PRODUCT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__IS_EXTERNAL = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>AKind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__AKIND = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Fragment Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Container Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Artifact Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DEFINITION_FEATURE_COUNT = WORK_PRODUCT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_RELATIONSHIP__CONTAINERS = 0;

	/**
	 * The number of structural features of the '<em>Fragment Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_RELATIONSHIP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.ArtifactFragment_RelationshipImpl <em>Artifact Fragment Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ArtifactFragment_RelationshipImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getArtifactFragment_Relationship()
	 * @generated
	 */
	int ARTIFACT_FRAGMENT_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FRAGMENT_RELATIONSHIP__CONTAINERS = FRAGMENT_RELATIONSHIP__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FRAGMENT_RELATIONSHIP__ARTIFACT = FRAGMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Fragment Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FRAGMENT_RELATIONSHIP_FEATURE_COUNT = FRAGMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.ContainerDefinition_RelationshipImpl <em>Container Definition Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ContainerDefinition_RelationshipImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getContainerDefinition_Relationship()
	 * @generated
	 */
	int CONTAINER_DEFINITION_RELATIONSHIP = 25;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION_RELATIONSHIP__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Container Definition Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_DEFINITION_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link spemarti.impl.ContainerFragment_RelationshipImpl <em>Container Fragment Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.ContainerFragment_RelationshipImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getContainerFragment_Relationship()
	 * @generated
	 */
	int CONTAINER_FRAGMENT_RELATIONSHIP = 26;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FRAGMENT_RELATIONSHIP__CONTAINERS = FRAGMENT_RELATIONSHIP__CONTAINERS;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FRAGMENT_RELATIONSHIP__CONTAINER = FRAGMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Fragment Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FRAGMENT_RELATIONSHIP_FEATURE_COUNT = FRAGMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.impl.LabeledTextImpl <em>Labeled Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.impl.LabeledTextImpl
	 * @see spemarti.impl.SpemartiPackageImpl#getLabeledText()
	 * @generated
	 */
	int LABELED_TEXT = 27;

	/**
	 * The feature id for the '<em><b>Is Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__IS_CHECKED_OUT = TEXT__IS_CHECKED_OUT;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__ANNOTATION = TEXT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Versionhistory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__VERSIONHISTORY = TEXT__VERSIONHISTORY;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__CONFIGURATION = TEXT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__PREVIOUS_VERSION = TEXT__PREVIOUS_VERSION;

	/**
	 * The feature id for the '<em><b>Base Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__BASE_VERSION = TEXT__BASE_VERSION;

	/**
	 * The feature id for the '<em><b>Presentation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__PRESENTATION_NAME = TEXT__PRESENTATION_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__DESCRIPTION = TEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__VALUE = TEXT__VALUE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT__LABEL = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_FEATURE_COUNT = TEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link spemarti.ArtifactKinds <em>Artifact Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see spemarti.ArtifactKinds
	 * @see spemarti.impl.SpemartiPackageImpl#getArtifactKinds()
	 * @generated
	 */
	int ARTIFACT_KINDS = 28;


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
	 * Returns the meta object for the attribute '{@link spemarti.WorkProductDefinition#getPresentationName <em>Presentation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Name</em>'.
	 * @see spemarti.WorkProductDefinition#getPresentationName()
	 * @see #getWorkProductDefinition()
	 * @generated
	 */
	EAttribute getWorkProductDefinition_PresentationName();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.WorkProductDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see spemarti.WorkProductDefinition#getDescription()
	 * @see #getWorkProductDefinition()
	 * @generated
	 */
	EAttribute getWorkProductDefinition_Description();

	/**
	 * Returns the meta object for class '{@link spemarti.Fragment_Relationship <em>Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Relationship</em>'.
	 * @see spemarti.Fragment_Relationship
	 * @generated
	 */
	EClass getFragment_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.Fragment_Relationship#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see spemarti.Fragment_Relationship#getContainers()
	 * @see #getFragment_Relationship()
	 * @generated
	 */
	EReference getFragment_Relationship_Containers();

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
	 * Returns the meta object for the attribute '{@link spemarti.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see spemarti.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

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
	 * Returns the meta object for class '{@link spemarti.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see spemarti.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ElementGroup#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childs</em>'.
	 * @see spemarti.ElementGroup#getChilds()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_Childs();

	/**
	 * Returns the meta object for the containment reference list '{@link spemarti.ElementGroup#getInternalContents <em>Internal Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Contents</em>'.
	 * @see spemarti.ElementGroup#getInternalContents()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_InternalContents();

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
	 * Returns the meta object for the reference list '{@link spemarti.ContainerDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact Container Relationship</em>'.
	 * @see spemarti.ContainerDefinition#getArtifactContainer_Relationship()
	 * @see #getContainerDefinition()
	 * @generated
	 */
	EReference getContainerDefinition_ArtifactContainer_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship <em>Container Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Definition Relationship</em>'.
	 * @see spemarti.ContainerDefinition#getContainerDefinition_Relationship()
	 * @see #getContainerDefinition()
	 * @generated
	 */
	EReference getContainerDefinition_ContainerDefinition_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ContainerDefinition#getContainerDefinition_Relationship2 <em>Container Definition Relationship2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Definition Relationship2</em>'.
	 * @see spemarti.ContainerDefinition#getContainerDefinition_Relationship2()
	 * @see #getContainerDefinition()
	 * @generated
	 */
	EReference getContainerDefinition_ContainerDefinition_Relationship2();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ContainerDefinition#getContainerFragment_Relationship <em>Container Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container Fragment Relationship</em>'.
	 * @see spemarti.ContainerDefinition#getContainerFragment_Relationship()
	 * @see #getContainerDefinition()
	 * @generated
	 */
	EReference getContainerDefinition_ContainerFragment_Relationship();

	/**
	 * Returns the meta object for class '{@link spemarti.ArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Container Relationship</em>'.
	 * @see spemarti.ArtifactContainer_Relationship
	 * @generated
	 */
	EClass getArtifactContainer_Relationship();

	/**
	 * Returns the meta object for the reference '{@link spemarti.ArtifactContainer_Relationship#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact</em>'.
	 * @see spemarti.ArtifactContainer_Relationship#getArtifact()
	 * @see #getArtifactContainer_Relationship()
	 * @generated
	 */
	EReference getArtifactContainer_Relationship_Artifact();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ArtifactContainer_Relationship#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see spemarti.ArtifactContainer_Relationship#getContainers()
	 * @see #getArtifactContainer_Relationship()
	 * @generated
	 */
	EReference getArtifactContainer_Relationship_Containers();

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
	 * Returns the meta object for the attribute '{@link spemarti.ArtifactDefinition#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see spemarti.ArtifactDefinition#isIsExternal()
	 * @see #getArtifactDefinition()
	 * @generated
	 */
	EAttribute getArtifactDefinition_IsExternal();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.ArtifactDefinition#getAKind <em>AKind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AKind</em>'.
	 * @see spemarti.ArtifactDefinition#getAKind()
	 * @see #getArtifactDefinition()
	 * @generated
	 */
	EAttribute getArtifactDefinition_AKind();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ArtifactDefinition#getArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact Fragment Relationship</em>'.
	 * @see spemarti.ArtifactDefinition#getArtifactFragment_Relationship()
	 * @see #getArtifactDefinition()
	 * @generated
	 */
	EReference getArtifactDefinition_ArtifactFragment_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ArtifactDefinition#getArtifactContainer_Relationship <em>Artifact Container Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artifact Container Relationship</em>'.
	 * @see spemarti.ArtifactDefinition#getArtifactContainer_Relationship()
	 * @see #getArtifactDefinition()
	 * @generated
	 */
	EReference getArtifactDefinition_ArtifactContainer_Relationship();

	/**
	 * Returns the meta object for class '{@link spemarti.ArtifactFragment_Relationship <em>Artifact Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Fragment Relationship</em>'.
	 * @see spemarti.ArtifactFragment_Relationship
	 * @generated
	 */
	EClass getArtifactFragment_Relationship();

	/**
	 * Returns the meta object for the reference '{@link spemarti.ArtifactFragment_Relationship#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact</em>'.
	 * @see spemarti.ArtifactFragment_Relationship#getArtifact()
	 * @see #getArtifactFragment_Relationship()
	 * @generated
	 */
	EReference getArtifactFragment_Relationship_Artifact();

	/**
	 * Returns the meta object for class '{@link spemarti.ContainerDefinition_Relationship <em>Container Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Definition Relationship</em>'.
	 * @see spemarti.ContainerDefinition_Relationship
	 * @generated
	 */
	EClass getContainerDefinition_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ContainerDefinition_Relationship#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see spemarti.ContainerDefinition_Relationship#getChildren()
	 * @see #getContainerDefinition_Relationship()
	 * @generated
	 */
	EReference getContainerDefinition_Relationship_Children();

	/**
	 * Returns the meta object for the reference '{@link spemarti.ContainerDefinition_Relationship#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see spemarti.ContainerDefinition_Relationship#getParent()
	 * @see #getContainerDefinition_Relationship()
	 * @generated
	 */
	EReference getContainerDefinition_Relationship_Parent();

	/**
	 * Returns the meta object for class '{@link spemarti.ContainerFragment_Relationship <em>Container Fragment Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Fragment Relationship</em>'.
	 * @see spemarti.ContainerFragment_Relationship
	 * @generated
	 */
	EClass getContainerFragment_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link spemarti.ContainerFragment_Relationship#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see spemarti.ContainerFragment_Relationship#getContainer()
	 * @see #getContainerFragment_Relationship()
	 * @generated
	 */
	EReference getContainerFragment_Relationship_Container();

	/**
	 * Returns the meta object for class '{@link spemarti.LabeledText <em>Labeled Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Text</em>'.
	 * @see spemarti.LabeledText
	 * @generated
	 */
	EClass getLabeledText();

	/**
	 * Returns the meta object for the attribute '{@link spemarti.LabeledText#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see spemarti.LabeledText#getLabel()
	 * @see #getLabeledText()
	 * @generated
	 */
	EAttribute getLabeledText_Label();

	/**
	 * Returns the meta object for enum '{@link spemarti.ArtifactKinds <em>Artifact Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artifact Kinds</em>'.
	 * @see spemarti.ArtifactKinds
	 * @generated
	 */
	EEnum getArtifactKinds();

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
		 * The meta object literal for the '<em><b>Presentation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT_DEFINITION__PRESENTATION_NAME = eINSTANCE.getWorkProductDefinition_PresentationName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT_DEFINITION__DESCRIPTION = eINSTANCE.getWorkProductDefinition_Description();

		/**
		 * The meta object literal for the '{@link spemarti.impl.Fragment_RelationshipImpl <em>Fragment Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.Fragment_RelationshipImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getFragment_Relationship()
		 * @generated
		 */
		EClass FRAGMENT_RELATIONSHIP = eINSTANCE.getFragment_Relationship();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_RELATIONSHIP__CONTAINERS = eINSTANCE.getFragment_Relationship_Containers();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

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
		 * The meta object literal for the '{@link spemarti.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ElementGroupImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__CHILDS = eINSTANCE.getElementGroup_Childs();

		/**
		 * The meta object literal for the '<em><b>Internal Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__INTERNAL_CONTENTS = eINSTANCE.getElementGroup_InternalContents();

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
		 * The meta object literal for the '<em><b>Artifact Container Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP = eINSTANCE.getContainerDefinition_ArtifactContainer_Relationship();

		/**
		 * The meta object literal for the '<em><b>Container Definition Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP = eINSTANCE.getContainerDefinition_ContainerDefinition_Relationship();

		/**
		 * The meta object literal for the '<em><b>Container Definition Relationship2</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION__CONTAINER_DEFINITION_RELATIONSHIP2 = eINSTANCE.getContainerDefinition_ContainerDefinition_Relationship2();

		/**
		 * The meta object literal for the '<em><b>Container Fragment Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION__CONTAINER_FRAGMENT_RELATIONSHIP = eINSTANCE.getContainerDefinition_ContainerFragment_Relationship();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ArtifactContainer_RelationshipImpl <em>Artifact Container Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ArtifactContainer_RelationshipImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getArtifactContainer_Relationship()
		 * @generated
		 */
		EClass ARTIFACT_CONTAINER_RELATIONSHIP = eINSTANCE.getArtifactContainer_Relationship();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_CONTAINER_RELATIONSHIP__ARTIFACT = eINSTANCE.getArtifactContainer_Relationship_Artifact();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_CONTAINER_RELATIONSHIP__CONTAINERS = eINSTANCE.getArtifactContainer_Relationship_Containers();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ArtifactDefinitionImpl <em>Artifact Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ArtifactDefinitionImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getArtifactDefinition()
		 * @generated
		 */
		EClass ARTIFACT_DEFINITION = eINSTANCE.getArtifactDefinition();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION__IS_EXTERNAL = eINSTANCE.getArtifactDefinition_IsExternal();

		/**
		 * The meta object literal for the '<em><b>AKind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DEFINITION__AKIND = eINSTANCE.getArtifactDefinition_AKind();

		/**
		 * The meta object literal for the '<em><b>Artifact Fragment Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_DEFINITION__ARTIFACT_FRAGMENT_RELATIONSHIP = eINSTANCE.getArtifactDefinition_ArtifactFragment_Relationship();

		/**
		 * The meta object literal for the '<em><b>Artifact Container Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_DEFINITION__ARTIFACT_CONTAINER_RELATIONSHIP = eINSTANCE.getArtifactDefinition_ArtifactContainer_Relationship();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ArtifactFragment_RelationshipImpl <em>Artifact Fragment Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ArtifactFragment_RelationshipImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getArtifactFragment_Relationship()
		 * @generated
		 */
		EClass ARTIFACT_FRAGMENT_RELATIONSHIP = eINSTANCE.getArtifactFragment_Relationship();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_FRAGMENT_RELATIONSHIP__ARTIFACT = eINSTANCE.getArtifactFragment_Relationship_Artifact();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ContainerDefinition_RelationshipImpl <em>Container Definition Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ContainerDefinition_RelationshipImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getContainerDefinition_Relationship()
		 * @generated
		 */
		EClass CONTAINER_DEFINITION_RELATIONSHIP = eINSTANCE.getContainerDefinition_Relationship();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION_RELATIONSHIP__CHILDREN = eINSTANCE.getContainerDefinition_Relationship_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_DEFINITION_RELATIONSHIP__PARENT = eINSTANCE.getContainerDefinition_Relationship_Parent();

		/**
		 * The meta object literal for the '{@link spemarti.impl.ContainerFragment_RelationshipImpl <em>Container Fragment Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.ContainerFragment_RelationshipImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getContainerFragment_Relationship()
		 * @generated
		 */
		EClass CONTAINER_FRAGMENT_RELATIONSHIP = eINSTANCE.getContainerFragment_Relationship();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_FRAGMENT_RELATIONSHIP__CONTAINER = eINSTANCE.getContainerFragment_Relationship_Container();

		/**
		 * The meta object literal for the '{@link spemarti.impl.LabeledTextImpl <em>Labeled Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.impl.LabeledTextImpl
		 * @see spemarti.impl.SpemartiPackageImpl#getLabeledText()
		 * @generated
		 */
		EClass LABELED_TEXT = eINSTANCE.getLabeledText();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_TEXT__LABEL = eINSTANCE.getLabeledText_Label();

		/**
		 * The meta object literal for the '{@link spemarti.ArtifactKinds <em>Artifact Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see spemarti.ArtifactKinds
		 * @see spemarti.impl.SpemartiPackageImpl#getArtifactKinds()
		 * @generated
		 */
		EEnum ARTIFACT_KINDS = eINSTANCE.getArtifactKinds();

	}

} //SpemartiPackage
