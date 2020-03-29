package me.vendoor.schema.specification

import me.vendoor.dragonball.library.schema.dsl.upsert.database
import me.vendoor.dragonball.library.schema.specification.Specification

class Specification : Specification {
    override fun get() = database {
        version { "1.0.0" }

        collections {
            collection {
                name { "User" }
            }
        }
    }
}