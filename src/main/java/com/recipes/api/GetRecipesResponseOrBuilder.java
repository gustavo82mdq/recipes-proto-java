// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1/recipes_api.proto

package com.recipes.api;

public interface GetRecipesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1.GetRecipesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .model.v1.Recipe recipes = 1 [json_name = "recipes"];</code>
   */
  java.util.List<com.recipes.model.Recipe> 
      getRecipesList();
  /**
   * <code>repeated .model.v1.Recipe recipes = 1 [json_name = "recipes"];</code>
   */
  com.recipes.model.Recipe getRecipes(int index);
  /**
   * <code>repeated .model.v1.Recipe recipes = 1 [json_name = "recipes"];</code>
   */
  int getRecipesCount();
  /**
   * <code>repeated .model.v1.Recipe recipes = 1 [json_name = "recipes"];</code>
   */
  java.util.List<? extends com.recipes.model.RecipeOrBuilder> 
      getRecipesOrBuilderList();
  /**
   * <code>repeated .model.v1.Recipe recipes = 1 [json_name = "recipes"];</code>
   */
  com.recipes.model.RecipeOrBuilder getRecipesOrBuilder(
      int index);
}
