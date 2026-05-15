package io.github.thelacspace.lucide.generator

import java.io.File

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: generator <source_dir> <version> [output_dir] [template_dir]")
        return
    }
    
    val sourceDir = File(args[0])
    val version = if (args.size > 1) args[1] else "unknown"
    val outputDir = if (args.size > 2) File(args[2]) else File("src/commonMain/kotlin/io/github/thelacspace/lucide")
    val templateDir = if (args.size > 3) File(args[3]) else File("generator/templates")

    LucideGenerator(sourceDir, outputDir, templateDir, version).generate()
}
