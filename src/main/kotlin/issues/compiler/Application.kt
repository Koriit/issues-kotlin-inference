package issues.compiler

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class Config(val prop: String)

fun main() {
    val di = Kodein {
        bind<Config>() with singleton {
            Config("str")
        }
    }

    val config: Config by di.instance()

    println(config.prop)
}
