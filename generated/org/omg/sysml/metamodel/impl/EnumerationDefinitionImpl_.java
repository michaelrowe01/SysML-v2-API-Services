package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EnumerationDefinitionImpl.class)
public abstract class EnumerationDefinitionImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<EnumerationDefinitionImpl, Usage> directedUsage;
	public static volatile ListAttribute<EnumerationDefinitionImpl, PortUsage> ownedPort;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<EnumerationDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile ListAttribute<EnumerationDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Usage> usage;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile ListAttribute<EnumerationDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile ListAttribute<EnumerationDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> output;
	public static volatile ListAttribute<EnumerationDefinitionImpl, MetadataUsage> ownedMetadata;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Usage> variant;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Differencing> ownedDifferencing;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, UUID> elementId;
	public static volatile ListAttribute<EnumerationDefinitionImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isLibraryElement;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Type> intersectingType;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> directedFeature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile ListAttribute<EnumerationDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, FlowConnectionUsage> ownedFlow;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ActionUsage> ownedAction;
	public static volatile ListAttribute<EnumerationDefinitionImpl, CaseUsage> ownedCase;
	public static volatile ListAttribute<EnumerationDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile ListAttribute<EnumerationDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> name;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Usage> ownedUsage;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> shortName;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> ownedMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, UseCaseUsage> ownedUseCase;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<EnumerationDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> membership;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isImpliedIncluded;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Element> member;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<EnumerationDefinitionImpl, String> aliasIds;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<EnumerationDefinitionImpl, ConnectorAsUsage> ownedConnection;
	public static volatile ListAttribute<EnumerationDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Import> ownedImport;
	public static volatile ListAttribute<EnumerationDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isAbstract;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Type> differencingType;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Type> unioningType;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<EnumerationDefinitionImpl, EnumerationUsage> enumeratedValue;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile ListAttribute<EnumerationDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Intersecting> ownedIntersecting;
	public static volatile ListAttribute<EnumerationDefinitionImpl, PartUsage> ownedPart;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String OWNED_PORT = "ownedPort";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String OWNED_METADATA = "ownedMetadata";
	public static final String VARIANT = "variant";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_FLOW = "ownedFlow";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_USE_CASE = "ownedUseCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String ENUMERATED_VALUE = "enumeratedValue";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";
	public static final String OWNED_PART = "ownedPart";

}

