package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QueryPathStepExpressionImpl.class)
public abstract class QueryPathStepExpressionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<QueryPathStepExpressionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Membership> membership;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Type> type;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, String> operator;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> output;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> feature;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Element> member;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Behavior> behavior;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Membership> importedMembership;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, UUID> identifier;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Type> referencedType;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Import> ownedImport;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isEnd;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Feature> input;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, Type> ownedType;
	public static volatile CollectionAttribute<QueryPathStepExpressionImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<QueryPathStepExpressionImpl, String> name;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Element> ownedMember;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Expression> operand;
	public static volatile ListAttribute<QueryPathStepExpressionImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String OPERATOR = "operator";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_END = "isEnd";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String TYPING = "typing";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OPERAND = "operand";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}
