package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Element;
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
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReferencePropertyImpl.class)
public abstract class ReferencePropertyImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ReferencePropertyImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ReferencePropertyImpl, Membership> membership;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Type> type;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> output;
	public static volatile CollectionAttribute<ReferencePropertyImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> feature;
	public static volatile ListAttribute<ReferencePropertyImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> ownedEndFeature;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Property> property;
	public static volatile ListAttribute<ReferencePropertyImpl, Element> member;
	public static volatile ListAttribute<ReferencePropertyImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Class> block;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<ReferencePropertyImpl, Membership> importedMembership;
	public static volatile SingularAttribute<ReferencePropertyImpl, UUID> identifier;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ReferencePropertyImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Property> nestedProperty;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Type> referencedType;
	public static volatile ListAttribute<ReferencePropertyImpl, Import> ownedImport;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isAbstract;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Feature> input;
	public static volatile SingularAttribute<ReferencePropertyImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ReferencePropertyImpl, Type> ownedType;
	public static volatile SingularAttribute<ReferencePropertyImpl, String> name;
	public static volatile CollectionAttribute<ReferencePropertyImpl, FeatureTyping> typing;
	public static volatile ListAttribute<ReferencePropertyImpl, Element> ownedMember;
	public static volatile ListAttribute<ReferencePropertyImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String PROPERTY = "property";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String BLOCK = "block";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String NESTED_PROPERTY = "nestedProperty";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String IS_END = "isEnd";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}

