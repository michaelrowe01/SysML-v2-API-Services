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
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
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
@StaticMetamodel(BindingConnectorAsUsageImpl.class)
public abstract class BindingConnectorAsUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> chainingFeature;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isConjugated;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Usage> usage;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> source;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Type> type;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> output;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Usage> variant;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, UUID> identifier;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> endFeature;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> directedFeature;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Type> featuringType;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> input;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> relatedElement;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, String> name;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Feature> connectorEnd;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Type> disjointType;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Association> association;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Membership> membership;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isPortion;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isNonunique;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ReferenceUsage> nestedReference;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, Feature> targetFeature;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> feature;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> member;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Classifier> definition;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, String> effectiveName;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Feature> relatedFeature;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Element> target;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<BindingConnectorAsUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, Boolean> isDirected;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<BindingConnectorAsUsageImpl, String> humanId;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, String> aliasId;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<BindingConnectorAsUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
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
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String ASSOCIATION = "association";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
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
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

