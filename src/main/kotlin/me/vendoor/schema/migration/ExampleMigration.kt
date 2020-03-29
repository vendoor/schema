package me.vendoor.schema.migration

import me.vendoor.dragonball.library.migration.MigrationContext
import me.vendoor.dragonball.library.schema.migration.MigrationScript
import org.bson.BsonDocument
import org.bson.BsonString

class ExampleMigration : MigrationScript(
        version = "1.1.0",
        description = """
            An example migration just to show off:
              * Drops the Users collection and does not even care about the documents.
              * Creates a new empty Customers.
        """.trimIndent()
) {
    override fun migrate(context: MigrationContext) {
        context.create {
            collection {
                name { "Customer" }
            }
        }

        // You can query any collection and work with the documents.
        val customerCollection = context.collection("Customer", BsonDocument::class.java)
        customerCollection.insertOne(BsonDocument())

        context.drop {
            collection { "User" }
        }
    }
}