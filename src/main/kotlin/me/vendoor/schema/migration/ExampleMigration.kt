package me.vendoor.schema.migration

import me.vendoor.dragonball.library.migration.MigrationContext
import me.vendoor.dragonball.library.schema.migration.MigrationScript

class ExampleMigration : MigrationScript(
        version = "1.1.0",
        description = """
            An example migration just to show off:
              * Drops the Users collection and does not even care about the documents.
              * Creates a new empty Customers.
        """.trimIndent()
) {
    override fun migrate(context: MigrationContext) {
        context.drop {
            collection { "User" }
        }

        context.create {
            collection {
                name { "Customers" }
            }
        }
    }
}