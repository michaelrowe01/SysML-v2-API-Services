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
@StaticMetamodel(NullExpressionImpl.class)
public abstract class NullExpressionImpl_ extends org.omg.sysml.metamodel.impl.SysMLTypeImpl_ {

	public static volatile ListAttribute<NullExpressionImpl, Feature> chainingFeature;
	public static volatile ListAttribute<NullExpressionImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<NullExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<NullExpressionImpl, Type> type;
	public static volatile ListAttribute<NullExpressionImpl, Feature> output;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<NullExpressionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<NullExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<NullExpressionImpl, UUID> identifier;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isDerived;
	public static volatile ListAttribute<NullExpressionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<NullExpressionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<NullExpressionImpl, String> qualifiedName;
	public static volatile ListAttribute<NullExpressionImpl, Documentation> documentation;
	public static volatile ListAttribute<NullExpressionImpl, Feature> endFeature;
	public static volatile ListAttribute<NullExpressionImpl, Feature> directedFeature;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isEnd;
	public static volatile ListAttribute<NullExpressionImpl, Type> featuringType;
	public static volatile ListAttribute<NullExpressionImpl, Feature> input;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isComposite;
	public static volatile SingularAttribute<NullExpressionImpl, String> name;
	public static volatile ListAttribute<NullExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<NullExpressionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<NullExpressionImpl, Type> disjointType;
	public static volatile CollectionAttribute<NullExpressionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<NullExpressionImpl, Membership> membership;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isPortion;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isNonunique;
	public static volatile ListAttribute<NullExpressionImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<NullExpressionImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<NullExpressionImpl, Feature> feature;
	public static volatile ListAttribute<NullExpressionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<NullExpressionImpl, Feature> parameter;
	public static volatile ListAttribute<NullExpressionImpl, Element> member;
	public static volatile ListAttribute<NullExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<NullExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<NullExpressionImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<NullExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<NullExpressionImpl, String> effectiveName;
	public static volatile SingularAttribute<NullExpressionImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<NullExpressionImpl, Membership> importedMembership;
	public static volatile ListAttribute<NullExpressionImpl, Element> ownedElement;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<NullExpressionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<NullExpressionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<NullExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<NullExpressionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<NullExpressionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<NullExpressionImpl, String> humanId;
	public static volatile ListAttribute<NullExpressionImpl, String> aliasId;
	public static volatile ListAttribute<NullExpressionImpl, Specialization> ownedSpecialization;

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

