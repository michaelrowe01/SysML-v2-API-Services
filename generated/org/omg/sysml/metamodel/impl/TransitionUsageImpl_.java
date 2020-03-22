package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.AcceptActionUsage;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransitionUsageImpl.class)
public abstract class TransitionUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<TransitionUsageImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<TransitionUsageImpl, Usage> nestedUsage;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<TransitionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<TransitionUsageImpl, Type> type;
	public static volatile CollectionAttribute<TransitionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> output;
	public static volatile CollectionAttribute<TransitionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<TransitionUsageImpl, Expression> guardExpression;
	public static volatile CollectionAttribute<TransitionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<TransitionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<TransitionUsageImpl, Property> property;
	public static volatile CollectionAttribute<TransitionUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<TransitionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<TransitionUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<TransitionUsageImpl, Property> nestedProperty;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<TransitionUsageImpl, Type> referencedType;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> input;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<TransitionUsageImpl, Type> ownedType;
	public static volatile CollectionAttribute<TransitionUsageImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<TransitionUsageImpl, String> name;
	public static volatile ListAttribute<TransitionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<TransitionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<TransitionUsageImpl, AcceptActionUsage> triggerAction;
	public static volatile CollectionAttribute<TransitionUsageImpl, Behavior> activity;
	public static volatile ListAttribute<TransitionUsageImpl, Membership> membership;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<TransitionUsageImpl, ActionUsage> effectAction;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> feature;
	public static volatile ListAttribute<TransitionUsageImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<TransitionUsageImpl, Element> member;
	public static volatile ListAttribute<TransitionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<TransitionUsageImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<TransitionUsageImpl, Behavior> behavior;
	public static volatile ListAttribute<TransitionUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<TransitionUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<TransitionUsageImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<TransitionUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<TransitionUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<TransitionUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<TransitionUsageImpl, Boolean> isAbstract;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String PROPERTY = "property";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_PROPERTY = "nestedProperty";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String TYPING = "typing";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String TRIGGER_ACTION = "triggerAction";
	public static final String ACTIVITY = "activity";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String EFFECT_ACTION = "effectAction";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";

}
