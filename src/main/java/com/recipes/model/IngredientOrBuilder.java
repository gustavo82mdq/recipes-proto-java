// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/v1/recipes.proto

package com.recipes.model;

public interface IngredientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.v1.Ingredient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue name = 1 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 1 [json_name = "name"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue value = 2 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.google.protobuf.StringValue value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  com.google.protobuf.StringValue getValue();
  /**
   * <code>.google.protobuf.StringValue value = 2 [json_name = "value"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getValueOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue quantity = 3 [json_name = "quantity"];</code>
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   * <code>.google.protobuf.DoubleValue quantity = 3 [json_name = "quantity"];</code>
   * @return The quantity.
   */
  com.google.protobuf.DoubleValue getQuantity();
  /**
   * <code>.google.protobuf.DoubleValue quantity = 3 [json_name = "quantity"];</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getQuantityOrBuilder();

  /**
   * <code>.model.v1.Unit unit = 4 [json_name = "unit"];</code>
   * @return Whether the unit field is set.
   */
  boolean hasUnit();
  /**
   * <code>.model.v1.Unit unit = 4 [json_name = "unit"];</code>
   * @return The unit.
   */
  com.recipes.model.Unit getUnit();
  /**
   * <code>.model.v1.Unit unit = 4 [json_name = "unit"];</code>
   */
  com.recipes.model.UnitOrBuilder getUnitOrBuilder();

  public com.recipes.model.Ingredient.AmountCase getAmountCase();
}
