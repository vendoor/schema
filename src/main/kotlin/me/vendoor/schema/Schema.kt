package me.vendoor.schema

import me.vendoor.dragonball.library.schema.Schema
import me.vendoor.schema.migration.ExampleMigration
import me.vendoor.schema.specification.Specification

class Schema : Schema {
    override fun getMigrationScripts() = listOf(
            ExampleMigration()
    )

    override fun getSpecification() = Specification()
}