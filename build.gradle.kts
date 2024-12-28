plugins {
    id("fpgradle-minecraft") version ("0.10.0")
}

group = "mega"

minecraft_fp {
    mod {
        modid = "appliedenergistics2"
        name = "Applied Energistics 2"
        rootPkg = "appeng"
    }

    api {
        packages = listOf("api")
    }

    core {
        coreModClass = "transformer.AppEngCore"
        accessTransformerFile = "appeng_at.cfg"
    }

    tokens {
        tokenClass = "Tags"
    }

    publish {
        changelog = "https://github.com/GTMEGA/Applied-Energistics-2-Unofficial/releases/tag/$version"
        maven {
            repoUrl = "https://mvn.falsepattern.com/gtmega_releases"
            repoName = "mega"
        }
    }
}

repositories {
    exclusive(mavenpattern(), "com.falsepattern")
    ic2EX()
    exclusive(maven("k-4u", "https://mvn.falsepattern.com/k-4u"), "pneumaticCraft")
    exclusive(maven("cil", "https://mvn.falsepattern.com/cil") {
        metadataSources {
            mavenPom()
            artifact()
        }
    }, "li.cil.oc") {
        includeModule("api", "immibis")
    }
    exclusive(horizon(), "com.github.GTNewHorizons")
    cursemavenEX()
    mega {
        content {
            includeGroups("gtmega", "codechicken", "mega")
        }
    }
    exclusive(mega_uploads()) {
        includeModule("mega", "Railcraft")
    }
}

dependencies {
    compileOnly("com.github.GTNewHorizons:Angelica:1.0.0-beta28:api") {
        excludeDeps()
    }
    compileOnly("codechicken:codechickencore-mc1.7.10:1.4.0-mega:dev") {
        excludeDeps()
    }
    compileOnly("codechicken:notenoughitems-mc1.7.10:2.4.1-mega:dev") {
        excludeDeps()
    }
    compileOnly("codechicken:forgemultipart-mc1.7.10:1.6.3-mega:dev") {
        excludeDeps()
    }
    compileOnly("gtmega:gt5u-mc1.7.10:5.40.3-mega:dev") {
        excludeDeps()
    }
    compileOnly("mega:inventorytweaks-mc1.7.10:1.80.1:dev") {
        excludeDeps()
    }
    compileOnly("com.github.GTNewHorizons:waila:1.5.18:api") {
        excludeDeps()
    }
    compileOnly("mega:Railcraft:9.16.3-mega:api") {
        excludeDeps()
    }

    compileOnly("com.github.GTNewHorizons:BuildCraft:7.1.24:dev") {
        excludeDeps()
    }
    compileOnly("curse.maven:cofh-core-69162:2388751") {
        excludeDeps()
    }
    compileOnly("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev") {
        excludeDeps()
    }
    compileOnly("curse.maven:minefactory-reloaded-66672:2366150") {
        excludeDeps()
    }
    compileOnly("li.cil.oc:OpenComputers:MC1.7.10-1.7.5.1356:api") {
        excludeDeps()
    }
    compileOnly("pneumaticCraft:PneumaticCraft-1.7.10:1.12.7-152:api") {
        excludeDeps()
    }
    compileOnly("curse.maven:better-storage-232919:2731636") {
        excludeDeps()
    }
    compileOnly("api:immibis:1") {
        excludeDeps()
    }

    testImplementation("junit:junit:4.12")
}