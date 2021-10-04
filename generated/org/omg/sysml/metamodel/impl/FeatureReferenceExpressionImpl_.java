package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FeatureReferenceExpressionImpl.class)
public abstract class FeatureReferenceExpressionImpl_ extends org.omg.sysml.metamodel.impl.SysMLTypeImpl_ {

	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> chainingFeature;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<FeatureReferenceExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Type> type;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> output;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<FeatureReferenceExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, UUID> identifier;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isDerived;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, String> qualifiedName;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Documentation> documentation;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> endFeature;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> directedFeature;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isEnd;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Type> featuringType;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> input;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isComposite;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, String> name;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<FeatureReferenceExpressionImpl, Type> disjointType;
	public static volatile CollectionAttribute<FeatureReferenceExpressionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Membership> membership;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isPortion;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isNonunique;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> feature;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> parameter;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Element> member;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, String> effectiveName;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Membership> importedMembership;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Element> ownedElement;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<FeatureReferenceExpressionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<FeatureReferenceExpressionImpl, String> humanId;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, String> aliasId;
	public static volatile ListAttribute<FeatureReferenceExpressionImpl, Specialization> ownedSpecialization;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";

}

