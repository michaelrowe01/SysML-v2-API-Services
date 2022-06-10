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
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Namespace;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Structure;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ViewUsageImpl.class)
public abstract class ViewUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<ViewUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<ViewUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<ViewUsageImpl, Feature> chainingFeature;
	public static volatile ListAttribute<ViewUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isConjugated;
	public static volatile ListAttribute<ViewUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<ViewUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ViewUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ViewUsageImpl, Type> type;
	public static volatile ListAttribute<ViewUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<ViewUsageImpl, Namespace> exposedNamespace;
	public static volatile ListAttribute<ViewUsageImpl, Feature> output;
	public static volatile ListAttribute<ViewUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ViewUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<ViewUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ViewUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ViewUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ViewUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ViewUsageImpl, UUID> elementId;
	public static volatile ListAttribute<ViewUsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<ViewUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<ViewUsageImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ViewUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<ViewUsageImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<ViewUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<ViewUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<ViewUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<ViewUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<ViewUsageImpl, Feature> endFeature;
	public static volatile ListAttribute<ViewUsageImpl, Feature> directedFeature;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<ViewUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<ViewUsageImpl, Type> featuringType;
	public static volatile ListAttribute<ViewUsageImpl, Feature> input;
	public static volatile ListAttribute<ViewUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<ViewUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<ViewUsageImpl, String> name;
	public static volatile SingularAttribute<ViewUsageImpl, String> shortName;
	public static volatile ListAttribute<ViewUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ViewUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<ViewUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ViewUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<ViewUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ViewUsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<ViewUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<ViewUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<ViewUsageImpl, Expression> viewCondition;
	public static volatile ListAttribute<ViewUsageImpl, ViewpointUsage> satisfiedViewpoint;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isNonunique;
	public static volatile ListAttribute<ViewUsageImpl, ReferenceUsage> nestedReference;
	public static volatile ListAttribute<ViewUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<ViewUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ViewUsageImpl, Feature> feature;
	public static volatile ListAttribute<ViewUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ViewUsageImpl, Element> member;
	public static volatile ListAttribute<ViewUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<ViewUsageImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<ViewUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ViewUsageImpl, Classifier> definition;
	public static volatile ListAttribute<ViewUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile ListAttribute<ViewUsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<ViewUsageImpl, String> effectiveName;
	public static volatile SingularAttribute<ViewUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<ViewUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<ViewUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<ViewUsageImpl, PartDefinition> partDefinition;
	public static volatile ListAttribute<ViewUsageImpl, String> aliasIds;
	public static volatile ListAttribute<ViewUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ViewUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ViewUsageImpl, Element> viewedElement;
	public static volatile ListAttribute<ViewUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<ViewUsageImpl, PortionKind> portionKind;
	public static volatile CollectionAttribute<ViewUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<ViewUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ViewUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<ViewUsageImpl, Structure> itemDefinition;
	public static volatile CollectionAttribute<ViewUsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<ViewUsageImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<ViewUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<ViewUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<ViewUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<ViewUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<ViewUsageImpl, FeatureInverting> ownedFeatureInverting;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String EXPOSED_NAMESPACE = "exposedNamespace";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_DERIVED = "isDerived";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String VIEW_CONDITION = "viewCondition";
	public static final String SATISFIED_VIEWPOINT = "satisfiedViewpoint";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String IS_REFERENCE = "isReference";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String VIEWED_ELEMENT = "viewedElement";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";

}

