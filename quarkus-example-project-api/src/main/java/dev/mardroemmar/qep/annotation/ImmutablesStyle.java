package dev.mardroemmar.qep.annotation;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.immutables.value.Value;

/**
 * This sets up the preferred Immutables style.
 * <p>
 * Note that this is for <b>INTERNAL</b> usage. Do not depend on this class.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PACKAGE})
@Retention(RetentionPolicy.SOURCE)
@Value.Style(
    typeImmutable = "*",
    typeImmutableEnclosing = "*",
    typeAbstract = "Abstract*",
    forceJacksonPropertyNames = false,
    deferCollectionAllocation = true,
    deepImmutablesDetection = true,
    optionalAcceptNullable = true
)
@JsonSerialize
public @interface ImmutablesStyle {
}
